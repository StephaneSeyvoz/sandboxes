#include <mindassert.h>
#include <string.h>

#define NB_ATTR 3

const char * expectedNames[NB_ATTR] = { "attr1", "attr2", "attr3" };
int expectedIntValues[NB_ATTR] = { 0, 4, 0 };
const char * expectedStringValues[NB_ATTR] = { "", "", "toto" };
int expectedSizes[NB_ATTR] = { sizeof(int), sizeof(int), sizeof(char *) };
enum AttributeType expectedTypes[NB_ATTR] = {INT_ATTR_TYPE, INT_ATTR_TYPE, STRING_ATTR_TYPE};

/* -----------------------------------------------------------------------------
   Implementation of the main interface.
----------------------------------------------------------------------------- */

/* int main(int argc, string[] argv) */
int METH(main, main) (int argc, char *argv[]) {
  int nbAttr, err, i;
  const char *attrNames[NB_ATTR];

  nbAttr = CALL(testedAC, listFcAttributes)(NULL);
  mindassert(nbAttr == NB_ATTR);

  err = CALL(testedAC, listFcAttributes)(attrNames);
  mindassert(err == NB_ATTR);

  for (i = 0; i < NB_ATTR; i++) {
    enum AttributeType type;
    mindassert(attrNames[i] != NULL);
    mindassert(strcmp(attrNames[i], expectedNames[i]) == 0);

    mindassert(CALL(testedAC, getFcAttributeSize)(attrNames[i]) == expectedSizes[i]);
    mindassert(CALL(testedAC, getFcAttributeType)(attrNames[i], &type) == FRACTAL_API_OK);
    mindassert(type == expectedTypes[i]);

    if (expectedTypes[i] == INT_ATTR_TYPE) {
      int attrValue;
      mindassert(CALL(testedAC, getFcAttribute)(attrNames[i], (void **)&attrValue) == FRACTAL_API_OK);
      mindassert(attrValue == expectedIntValues[i]);
    } else {
      char * attrValue;
      mindassert(expectedTypes[i] == STRING_ATTR_TYPE);
      mindassert(CALL(testedAC, getFcAttribute)(attrNames[i], (void **)&attrValue) == FRACTAL_API_OK);
      mindassert(strcmp(attrValue, expectedStringValues[i]) == 0);
    }

  }

  mindassert(CALL(testedMain, main)(argc, argv) == 4);

  {
    int attrValue;
    mindassert(CALL(testedAC, setFcAttribute)("attr1", (void *) 3) == FRACTAL_API_OK);
    mindassert(CALL(testedAC, getFcAttribute)("attr1", (void **)&attrValue) == FRACTAL_API_OK);
    mindassert(attrValue == 3);
  }

  mindassert(CALL(testedMain, main)(argc, argv) == 7);

  return 0;
}

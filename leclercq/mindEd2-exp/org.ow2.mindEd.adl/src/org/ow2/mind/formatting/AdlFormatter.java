/*
 * generated by Xtext
 */

package org.ow2.mind.formatting;

import java.util.List;

import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.ow2.mind.services.AdlGrammarAccess;
import org.ow2.mind.services.AdlGrammarAccess.AnnotationElements;
import org.ow2.mind.services.AdlGrammarAccess.BindingElements;

/**
 * This class contains custom formatting description. see :
 * http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting on
 * how and when to use it Also see
 * {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class AdlFormatter extends AbstractDeclarativeFormatter {

  @Override
  protected AdlGrammarAccess getGrammarAccess() {
    return (AdlGrammarAccess) super.getGrammarAccess();
  }

  @Override
  protected void configureFormatting(FormattingConfig c) {
    AdlGrammarAccess f = getGrammarAccess();

    // add and preserve newlines around comments
    c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
    c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
    c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());

    // Add new lines after '{' and increment indentation
    List<Keyword> lCurlyBrackets = f.findKeywords("{");
    for (Keyword lCurly : lCurlyBrackets) {
      c.setLinewrap(0, 0, 1).after(lCurly);
      c.setIndentationIncrement().after(lCurly);
    }

    // Add new lines before and after '}' and decrement indentation
    for (Keyword rCurly : f.findKeywords("}")) {
      c.setLinewrap(1, 1, 2).around(rCurly);
      c.setIndentationDecrement().before(rCurly);
    }

    // '(', ')', '<' and '>' at most one new line around (0 by default), no
    // space around
    for (Keyword parent : f.findKeywords("(", "<")) {
      c.setLinewrap(0, 0, 1).around(parent);
      c.setNoSpace().around(parent);
      c.setIndentationIncrement().after(parent);
    }
    List<Keyword> rparents = f.findKeywords(")", ">");
    for (Keyword parent : rparents) {
      c.setLinewrap(0, 0, 1).around(parent);
      c.setNoSpace().before(parent);
      c.setIndentationDecrement().before(parent);
    }

    // ';' add new lines after but neither new line nor space before
    for (Keyword semi : f.findKeywords(";")) {
      c.setLinewrap(1, 1, 2).after(semi);
      c.setNoLinewrap().before(semi);
      c.setNoSpace().before(semi);
    }

    // ',' at most one new line after, one space after and neither new line nor
    // space before
    for (Keyword coma : f.findKeywords(",")) {
      c.setLinewrap(0, 0, 1).after(coma);
      c.setNoLinewrap().before(coma);
      c.setNoSpace().before(coma);
    }

    // '.' at most one new line before, neither newline nor space before, one space after and neither new line nor
    // space before
    for (Keyword dot : f.findKeywords(".")) {
      c.setLinewrap(0, 0, 1).before(dot);
      c.setLinewrap(0).after(dot);
      c.setNoSpace().around(dot);
    }
    
    configureAnnotation(c, f);
    configureBind(c, f);
    // TODO configure other rules
  }

  protected void configureAnnotation(FormattingConfig c, AdlGrammarAccess f) {
    AnnotationElements b = f.getAnnotationAccess();
    
    // At least one new line before each annotation
    c.setLinewrap(1, 1, 2).before(b.getCommercialAtKeyword_0());
    
    // No space after '@'
    c.setNoSpace().after(b.getCommercialAtKeyword_0());
    
    // At least one new line after annotation
    c.setLinewrap(1, 1, 2).after(f.getAnnotationRule());
  }
  
  protected void configureBind(FormattingConfig c, AdlGrammarAccess f) {
    BindingElements b = f.getBindingAccess();
    
    // at most one new line after 'binds', increment indentation after
    c.setLinewrap(0, 0, 1).after(b.getBindsKeyword_1());
    c.setIndentationIncrement().after(b.getBindsKeyword_1());
    c.setIndentationDecrement().after(f.getBindingRule());

    // indent '(fromSubComp|this).fromItf'
    c.setIndentationIncrement().before(b.getFromSubCompAssignment_2_0());
    c.setIndentationIncrement().before(b.getThisKeyword_2_1());
    c.setIndentationDecrement().after(b.getFromItfAssignment_4());
    
    // 'to' at most one line break around
    c.setLinewrap(0, 0, 1).around(b.getToKeyword_6());

    // indent '(toSubComp|this).toItf'
    c.setIndentationIncrement().before(b.getToSubCompAssignment_7_0());
    c.setIndentationIncrement().before(b.getThisKeyword_7_1());
    c.setIndentationDecrement().after(b.getToItfAssignment_9());
}
  
  
}

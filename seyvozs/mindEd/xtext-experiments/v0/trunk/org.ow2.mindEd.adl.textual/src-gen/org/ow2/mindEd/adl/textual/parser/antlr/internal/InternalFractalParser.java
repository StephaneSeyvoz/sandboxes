package org.ow2.mindEd.adl.textual.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.ow2.mindEd.adl.textual.services.FractalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFractalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_CODE_C", "RULE_SL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'.*'", "'composite'", "'<'", "','", "'>'", "'extends'", "'{'", "'}'", "'abstract'", "'primitive'", "'type'", "'provides'", "'as'", "'['", "']'", "'requires'", "'optional'", "'contains'", "'('", "')'", "'binds'", "'this'", "'.'", "'to'", "'conformsto'", "'STRUCT'", "'UNION'", "'ENUM'", "'+'", "'-'", "'0x'", "'null'", "'='", "'?'", "'attribute'", "'source'", "'data'", "'..'", "'@'", "'Override'", "'Singleton'", "'LDFlags'", "'CFlags'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_CODE_C=7;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_SL=8;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalFractalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFractalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFractalParser.tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private FractalGrammarAccess grammarAccess;
     	
        public InternalFractalParser(TokenStream input, FractalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "AdlDefinition";	
       	}
       	
       	@Override
       	protected FractalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAdlDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:73:1: entryRuleAdlDefinition returns [EObject current=null] : iv_ruleAdlDefinition= ruleAdlDefinition EOF ;
    public final EObject entryRuleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdlDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:74:2: (iv_ruleAdlDefinition= ruleAdlDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:75:2: iv_ruleAdlDefinition= ruleAdlDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdlDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition81);
            iv_ruleAdlDefinition=ruleAdlDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdlDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdlDefinition91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdlDefinition"


    // $ANTLR start "ruleAdlDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:82:1: ruleAdlDefinition returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_annotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) ) ) ;
    public final EObject ruleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_annotationsList_1_0 = null;

        EObject lv_architectureDefinition_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:85:28: ( ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_annotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:1: ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_annotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:1: ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_annotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:2: ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_annotationsList_1_0= ruleAnnotationsList ) )? ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:2: ( (lv_imports_0_0= ruleImportDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==53) ) {
                    int LA1_1 = input.LA(2);

                    if ( (synpred1_InternalFractal()) ) {
                        alt1=1;
                    }


                }
                else if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: (lv_imports_0_0= ruleImportDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: (lv_imports_0_0= ruleImportDefinition )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:88:3: lv_imports_0_0= ruleImportDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdlDefinitionAccess().getImportsImportDefinitionParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportDefinition_in_ruleAdlDefinition137);
            	    lv_imports_0_0=ruleImportDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdlDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"ImportDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:104:3: ( (lv_annotationsList_1_0= ruleAnnotationsList ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==53) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:105:1: (lv_annotationsList_1_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:105:1: (lv_annotationsList_1_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:106:3: lv_annotationsList_1_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAdlDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleAdlDefinition159);
                    lv_annotationsList_1_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAdlDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_1_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:122:3: ( (lv_architectureDefinition_2_0= ruleArchitectureDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:123:1: (lv_architectureDefinition_2_0= ruleArchitectureDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:123:1: (lv_architectureDefinition_2_0= ruleArchitectureDefinition )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:124:3: lv_architectureDefinition_2_0= ruleArchitectureDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdlDefinitionAccess().getArchitectureDefinitionArchitectureDefinitionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition181);
            lv_architectureDefinition_2_0=ruleArchitectureDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdlDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"architectureDefinition",
                      		lv_architectureDefinition_2_0, 
                      		"ArchitectureDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdlDefinition"


    // $ANTLR start "entryRuleArchitectureDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:148:1: entryRuleArchitectureDefinition returns [EObject current=null] : iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF ;
    public final EObject entryRuleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:149:2: (iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:150:2: iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArchitectureDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition217);
            iv_ruleArchitectureDefinition=ruleArchitectureDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArchitectureDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitectureDefinition227); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArchitectureDefinition"


    // $ANTLR start "ruleArchitectureDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:157:1: ruleArchitectureDefinition returns [EObject current=null] : (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeDefinition_0 = null;

        EObject this_PrimitiveDefinition_1 = null;

        EObject this_TypeDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:160:28: ( (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:161:1: (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:161:1: (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 23:
            case 24:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:162:2: this_CompositeDefinition_0= ruleCompositeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getCompositeDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeDefinition_in_ruleArchitectureDefinition277);
                    this_CompositeDefinition_0=ruleCompositeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompositeDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:175:2: this_PrimitiveDefinition_1= rulePrimitiveDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getPrimitiveDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveDefinition_in_ruleArchitectureDefinition307);
                    this_PrimitiveDefinition_1=rulePrimitiveDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimitiveDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:188:2: this_TypeDefinition_2= ruleTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getTypeDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleArchitectureDefinition337);
                    this_TypeDefinition_2=ruleTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeDefinition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArchitectureDefinition"


    // $ANTLR start "entryRuleImportDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:207:1: entryRuleImportDefinition returns [EObject current=null] : iv_ruleImportDefinition= ruleImportDefinition EOF ;
    public final EObject entryRuleImportDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:208:2: (iv_ruleImportDefinition= ruleImportDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:209:2: iv_ruleImportDefinition= ruleImportDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition372);
            iv_ruleImportDefinition=ruleImportDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDefinition382); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportDefinition"


    // $ANTLR start "ruleImportDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:216:1: ruleImportDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' ) ;
    public final EObject ruleImportDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:219:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:220:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:220:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:220:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:220:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==53) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:221:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:221:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:222:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleImportDefinition428);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImportDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleImportDefinition441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImportDefinitionAccess().getImportKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:242:1: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:243:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:243:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:244:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportDefinitionAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportDefinition462);
            lv_importedNamespace_2_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_2_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleImportDefinition474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getImportDefinitionAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportDefinition"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:272:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:273:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:274:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard511);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard522); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:281:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:284:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:285:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:285:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:286:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard569);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:296:1: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:297:2: kw= '.*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildcard588); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleCompositeDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:310:1: entryRuleCompositeDefinition returns [EObject current=null] : iv_ruleCompositeDefinition= ruleCompositeDefinition EOF ;
    public final EObject entryRuleCompositeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:311:2: (iv_ruleCompositeDefinition= ruleCompositeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:312:2: iv_ruleCompositeDefinition= ruleCompositeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeDefinition_in_entryRuleCompositeDefinition630);
            iv_ruleCompositeDefinition=ruleCompositeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeDefinition640); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeDefinition"


    // $ANTLR start "ruleCompositeDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:319:1: ruleCompositeDefinition returns [EObject current=null] : (otherlv_0= 'composite' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '<' ( ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )* ) otherlv_6= '>' )? ( (lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList ) )? (otherlv_8= 'extends' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_12= '{' ( ( (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition ) ) )* otherlv_14= '}' ) ;
    public final EObject ruleCompositeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_templateSpecifiers_3_0 = null;

        EObject lv_templateSpecifiers_5_0 = null;

        EObject lv_compositeFormalArgumentsList_7_0 = null;

        EObject lv_elements_13_1 = null;

        EObject lv_elements_13_2 = null;

        EObject lv_elements_13_3 = null;

        EObject lv_elements_13_4 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:322:28: ( (otherlv_0= 'composite' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '<' ( ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )* ) otherlv_6= '>' )? ( (lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList ) )? (otherlv_8= 'extends' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_12= '{' ( ( (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition ) ) )* otherlv_14= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:323:1: (otherlv_0= 'composite' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '<' ( ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )* ) otherlv_6= '>' )? ( (lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList ) )? (otherlv_8= 'extends' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_12= '{' ( ( (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition ) ) )* otherlv_14= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:323:1: (otherlv_0= 'composite' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '<' ( ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )* ) otherlv_6= '>' )? ( (lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList ) )? (otherlv_8= 'extends' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_12= '{' ( ( (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition ) ) )* otherlv_14= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:323:3: otherlv_0= 'composite' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '<' ( ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )* ) otherlv_6= '>' )? ( (lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList ) )? (otherlv_8= 'extends' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_12= '{' ( ( (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition ) ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleCompositeDefinition677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompositeDefinitionAccess().getCompositeKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:327:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:328:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:328:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:329:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition698);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:345:2: (otherlv_2= '<' ( ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )* ) otherlv_6= '>' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:345:4: otherlv_2= '<' ( ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )* ) otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleCompositeDefinition711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCompositeDefinitionAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:349:1: ( ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )* )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:349:2: ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) ) (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )*
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:349:2: ( (lv_templateSpecifiers_3_0= ruleTemplateSpecifier ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:350:1: (lv_templateSpecifiers_3_0= ruleTemplateSpecifier )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:350:1: (lv_templateSpecifiers_3_0= ruleTemplateSpecifier )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:351:3: lv_templateSpecifiers_3_0= ruleTemplateSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_2_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleCompositeDefinition733);
                    lv_templateSpecifiers_3_0=ruleTemplateSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"templateSpecifiers",
                              		lv_templateSpecifiers_3_0, 
                              		"TemplateSpecifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:367:2: (otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:367:4: otherlv_4= ',' ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleCompositeDefinition746); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getCompositeDefinitionAccess().getCommaKeyword_2_1_1_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:371:1: ( (lv_templateSpecifiers_5_0= ruleTemplateSpecifier ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:372:1: (lv_templateSpecifiers_5_0= ruleTemplateSpecifier )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:372:1: (lv_templateSpecifiers_5_0= ruleTemplateSpecifier )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:373:3: lv_templateSpecifiers_5_0= ruleTemplateSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_2_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleCompositeDefinition767);
                    	    lv_templateSpecifiers_5_0=ruleTemplateSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"templateSpecifiers",
                    	              		lv_templateSpecifiers_5_0, 
                    	              		"TemplateSpecifier");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }

                    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleCompositeDefinition782); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCompositeDefinitionAccess().getGreaterThanSignKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:393:3: ( (lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:394:1: (lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:394:1: (lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:395:3: lv_compositeFormalArgumentsList_7_0= ruleFormalArgumentsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_ruleCompositeDefinition805);
                    lv_compositeFormalArgumentsList_7_0=ruleFormalArgumentsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"compositeFormalArgumentsList",
                              		lv_compositeFormalArgumentsList_7_0, 
                              		"FormalArgumentsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:411:3: (otherlv_8= 'extends' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:411:5: otherlv_8= 'extends' ( ( ruleQualifiedName ) ) (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleCompositeDefinition819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCompositeDefinitionAccess().getExtendsKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:415:1: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:416:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:416:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:417:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getCompositeDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getSuperTypesArchitectureDefinitionCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition846);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:433:2: (otherlv_10= ',' ( ( ruleQualifiedName ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:433:4: otherlv_10= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleCompositeDefinition859); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getCompositeDefinitionAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:437:1: ( ( ruleQualifiedName ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:438:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:438:1: ( ruleQualifiedName )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:439:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getCompositeDefinitionRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getSuperTypesArchitectureDefinitionCrossReference_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition886);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleCompositeDefinition902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getCompositeDefinitionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:459:1: ( ( (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26||LA12_0==30||LA12_0==32||LA12_0==35||LA12_0==53) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:460:1: ( (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:460:1: ( (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:461:1: (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:461:1: (lv_elements_13_1= ruleProvidedInterfaceDefinition | lv_elements_13_2= ruleRequiredInterfaceDefinition | lv_elements_13_3= ruleSubComponentDefinition | lv_elements_13_4= ruleBindingDefinition )
            	    int alt11=4;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        int LA11_1 = input.LA(2);

            	        if ( (synpred12_InternalFractal()) ) {
            	            alt11=1;
            	        }
            	        else if ( (synpred13_InternalFractal()) ) {
            	            alt11=2;
            	        }
            	        else if ( (synpred14_InternalFractal()) ) {
            	            alt11=3;
            	        }
            	        else if ( (true) ) {
            	            alt11=4;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 11, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt11=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:462:3: lv_elements_13_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_6_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleCompositeDefinition925);
            	            lv_elements_13_1=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_13_1, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:477:8: lv_elements_13_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_6_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleCompositeDefinition944);
            	            lv_elements_13_2=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_13_2, 
            	                      		"RequiredInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:492:8: lv_elements_13_3= ruleSubComponentDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsSubComponentDefinitionParserRuleCall_6_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinition963);
            	            lv_elements_13_3=ruleSubComponentDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_13_3, 
            	                      		"SubComponentDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:507:8: lv_elements_13_4= ruleBindingDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsBindingDefinitionParserRuleCall_6_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinition982);
            	            lv_elements_13_4=ruleBindingDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_13_4, 
            	                      		"BindingDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleCompositeDefinition998); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getCompositeDefinitionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeDefinition"


    // $ANTLR start "entryRulePrimitiveDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:537:1: entryRulePrimitiveDefinition returns [EObject current=null] : iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF ;
    public final EObject entryRulePrimitiveDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:538:2: (iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:539:2: iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveDefinition_in_entryRulePrimitiveDefinition1034);
            iv_rulePrimitiveDefinition=rulePrimitiveDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveDefinition1044); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveDefinition"


    // $ANTLR start "rulePrimitiveDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:546:1: rulePrimitiveDefinition returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'primitive' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_8= '{' ( ( (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition ) ) )* otherlv_10= '}' ) ;
    public final EObject rulePrimitiveDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_compositeFormalArgumentsList_3_0 = null;

        EObject lv_elements_9_1 = null;

        EObject lv_elements_9_2 = null;

        EObject lv_elements_9_3 = null;

        EObject lv_elements_9_4 = null;

        EObject lv_elements_9_5 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:549:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'primitive' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_8= '{' ( ( (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition ) ) )* otherlv_10= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:550:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'primitive' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_8= '{' ( ( (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition ) ) )* otherlv_10= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:550:1: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'primitive' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_8= '{' ( ( (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition ) ) )* otherlv_10= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:550:2: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'primitive' ( (lv_name_2_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )? (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_8= '{' ( ( (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition ) ) )* otherlv_10= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:550:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:551:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:551:1: (lv_abstract_0_0= 'abstract' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:552:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,23,FOLLOW_23_in_rulePrimitiveDefinition1087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_abstract_0_0, grammarAccess.getPrimitiveDefinitionAccess().getAbstractAbstractKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimitiveDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "abstract", true, "abstract");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_rulePrimitiveDefinition1113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPrimitiveDefinitionAccess().getPrimitiveKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:569:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:570:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:570:1: (lv_name_2_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:571:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1134);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:587:2: ( (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:588:1: (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:588:1: (lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:589:3: lv_compositeFormalArgumentsList_3_0= ruleFormalArgumentsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveDefinition1155);
                    lv_compositeFormalArgumentsList_3_0=ruleFormalArgumentsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"compositeFormalArgumentsList",
                              		lv_compositeFormalArgumentsList_3_0, 
                              		"FormalArgumentsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:605:3: (otherlv_4= 'extends' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:605:5: otherlv_4= 'extends' ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_rulePrimitiveDefinition1169); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimitiveDefinitionAccess().getExtendsKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:609:1: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:610:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:610:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:611:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPrimitiveDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getSuperTypesArchitectureDefinitionCrossReference_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1196);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:627:2: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==18) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:627:4: otherlv_6= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_rulePrimitiveDefinition1209); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getPrimitiveDefinitionAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:631:1: ( ( ruleQualifiedName ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:632:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:632:1: ( ruleQualifiedName )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:633:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getPrimitiveDefinitionRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getSuperTypesArchitectureDefinitionCrossReference_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1236);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_rulePrimitiveDefinition1252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getPrimitiveDefinitionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:653:1: ( ( (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26||LA18_0==30||(LA18_0>=49 && LA18_0<=51)||LA18_0==53) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:654:1: ( (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:654:1: ( (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:655:1: (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:655:1: (lv_elements_9_1= ruleProvidedInterfaceDefinition | lv_elements_9_2= ruleRequiredInterfaceDefinition | lv_elements_9_3= ruleImplementationDefinition | lv_elements_9_4= ruleAttributeDefinition | lv_elements_9_5= ruleDataDefinition )
            	    int alt17=5;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        int LA17_1 = input.LA(2);

            	        if ( (synpred20_InternalFractal()) ) {
            	            alt17=1;
            	        }
            	        else if ( (synpred21_InternalFractal()) ) {
            	            alt17=2;
            	        }
            	        else if ( (synpred22_InternalFractal()) ) {
            	            alt17=3;
            	        }
            	        else if ( (synpred23_InternalFractal()) ) {
            	            alt17=4;
            	        }
            	        else if ( (true) ) {
            	            alt17=5;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 17, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt17=4;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt17=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:656:3: lv_elements_9_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_6_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_rulePrimitiveDefinition1275);
            	            lv_elements_9_1=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_9_1, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:671:8: lv_elements_9_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_6_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_rulePrimitiveDefinition1294);
            	            lv_elements_9_2=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_9_2, 
            	                      		"RequiredInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:686:8: lv_elements_9_3= ruleImplementationDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsImplementationDefinitionParserRuleCall_6_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinition1313);
            	            lv_elements_9_3=ruleImplementationDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_9_3, 
            	                      		"ImplementationDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:701:8: lv_elements_9_4= ruleAttributeDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsAttributeDefinitionParserRuleCall_6_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinition1332);
            	            lv_elements_9_4=ruleAttributeDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_9_4, 
            	                      		"AttributeDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:716:8: lv_elements_9_5= ruleDataDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsDataDefinitionParserRuleCall_6_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinition1351);
            	            lv_elements_9_5=ruleDataDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_9_5, 
            	                      		"DataDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_10=(Token)match(input,22,FOLLOW_22_in_rulePrimitiveDefinition1367); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getPrimitiveDefinitionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveDefinition"


    // $ANTLR start "entryRuleTypeDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:746:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:747:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:748:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1403);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition1413); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDefinition"


    // $ANTLR start "ruleTypeDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:755:1: ruleTypeDefinition returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_7_1 = null;

        EObject lv_elements_7_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:758:28: ( (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_8= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:759:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_8= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:759:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_8= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:759:3: otherlv_0= 'type' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleTypeDefinition1450); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:763:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:764:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:764:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:765:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1471);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:781:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:781:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTypeDefinition1484); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getTypeDefinitionAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:785:1: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:786:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:786:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:787:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getSuperTypesArchitectureDefinitionCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1511);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:803:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==18) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:803:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleTypeDefinition1524); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getTypeDefinitionAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:807:1: ( ( ruleQualifiedName ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:808:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:808:1: ( ruleQualifiedName )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:809:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      		  /* */ 
                    	      		
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTypeDefinitionRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getSuperTypesArchitectureDefinitionCrossReference_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1551);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleTypeDefinition1567); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getTypeDefinitionAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:829:1: ( ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==26||LA22_0==30||LA22_0==53) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:830:1: ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:830:1: ( (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:831:1: (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:831:1: (lv_elements_7_1= ruleProvidedInterfaceDefinition | lv_elements_7_2= ruleRequiredInterfaceDefinition )
            	    int alt21=2;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        int LA21_1 = input.LA(2);

            	        if ( (synpred27_InternalFractal()) ) {
            	            alt21=1;
            	        }
            	        else if ( (true) ) {
            	            alt21=2;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 21, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:832:3: lv_elements_7_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleTypeDefinition1590);
            	            lv_elements_7_1=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_7_1, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:847:8: lv_elements_7_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleTypeDefinition1609);
            	            lv_elements_7_2=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_7_2, 
            	                      		"RequiredInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleTypeDefinition1625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getTypeDefinitionAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDefinition"


    // $ANTLR start "entryRuleHostedInterfaceDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:877:1: entryRuleHostedInterfaceDefinition returns [EObject current=null] : iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF ;
    public final EObject entryRuleHostedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostedInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:878:2: (iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:879:2: iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostedInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_entryRuleHostedInterfaceDefinition1661);
            iv_ruleHostedInterfaceDefinition=ruleHostedInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostedInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostedInterfaceDefinition1671); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHostedInterfaceDefinition"


    // $ANTLR start "ruleHostedInterfaceDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:886:1: ruleHostedInterfaceDefinition returns [EObject current=null] : (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition ) ;
    public final EObject ruleHostedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ProvidedInterfaceDefinition_0 = null;

        EObject this_RequiredInterfaceDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:889:28: ( (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:890:1: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:890:1: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition )
            int alt23=2;
            switch ( input.LA(1) ) {
            case 53:
                {
                int LA23_1 = input.LA(2);

                if ( (synpred29_InternalFractal()) ) {
                    alt23=1;
                }
                else if ( (true) ) {
                    alt23=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt23=1;
                }
                break;
            case 30:
                {
                alt23=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:891:2: this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostedInterfaceDefinitionAccess().getProvidedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleHostedInterfaceDefinition1721);
                    this_ProvidedInterfaceDefinition_0=ruleProvidedInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ProvidedInterfaceDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:904:2: this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostedInterfaceDefinitionAccess().getRequiredInterfaceDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleHostedInterfaceDefinition1751);
                    this_RequiredInterfaceDefinition_1=ruleRequiredInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RequiredInterfaceDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHostedInterfaceDefinition"


    // $ANTLR start "entryRuleProvidedInterfaceDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:923:1: entryRuleProvidedInterfaceDefinition returns [EObject current=null] : iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF ;
    public final EObject entryRuleProvidedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:924:2: (iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:925:2: iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_entryRuleProvidedInterfaceDefinition1786);
            iv_ruleProvidedInterfaceDefinition=ruleProvidedInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProvidedInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedInterfaceDefinition1796); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProvidedInterfaceDefinition"


    // $ANTLR start "ruleProvidedInterfaceDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:932:1: ruleProvidedInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' ) ;
    public final EObject ruleProvidedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_role_1_0=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token lv_collection_5_0=null;
        Token lv_collectionsize_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_annotationsList_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:935:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:936:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:936:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:936:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:936:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==53) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:937:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:937:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:938:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleProvidedInterfaceDefinition1842);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getProvidedInterfaceDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:954:3: ( (lv_role_1_0= 'provides' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:955:1: (lv_role_1_0= 'provides' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:955:1: (lv_role_1_0= 'provides' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:956:3: lv_role_1_0= 'provides'
            {
            lv_role_1_0=(Token)match(input,26,FOLLOW_26_in_ruleProvidedInterfaceDefinition1861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_role_1_0, grammarAccess.getProvidedInterfaceDefinitionAccess().getRoleProvidesKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(current, "role", lv_role_1_0, "provides");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:969:2: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:970:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:970:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:971:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionAccess().getSignatureInterfaceDefinitionCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleProvidedInterfaceDefinition1901);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleProvidedInterfaceDefinition1913); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProvidedInterfaceDefinitionAccess().getAsKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:991:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:992:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:992:1: (lv_name_4_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:993:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvidedInterfaceDefinition1930); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_4_0, grammarAccess.getProvidedInterfaceDefinitionAccess().getNameIDTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_4_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1009:2: ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1009:3: ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']'
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1009:3: ( (lv_collection_5_0= '[' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1010:1: (lv_collection_5_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1010:1: (lv_collection_5_0= '[' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1011:3: lv_collection_5_0= '['
                    {
                    lv_collection_5_0=(Token)match(input,28,FOLLOW_28_in_ruleProvidedInterfaceDefinition1954); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_collection_5_0, grammarAccess.getProvidedInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_5_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "collection", true, "[");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1024:2: ( (lv_collectionsize_6_0= RULE_INT ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_INT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1025:1: (lv_collectionsize_6_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1025:1: (lv_collectionsize_6_0= RULE_INT )
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1026:3: lv_collectionsize_6_0= RULE_INT
                            {
                            lv_collectionsize_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProvidedInterfaceDefinition1984); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_collectionsize_6_0, grammarAccess.getProvidedInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_5_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getProvidedInterfaceDefinitionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"collectionsize",
                                      		lv_collectionsize_6_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleProvidedInterfaceDefinition2002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getProvidedInterfaceDefinitionAccess().getRightSquareBracketKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleProvidedInterfaceDefinition2016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getProvidedInterfaceDefinitionAccess().getSemicolonKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProvidedInterfaceDefinition"


    // $ANTLR start "entryRuleRequiredInterfaceDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1058:1: entryRuleRequiredInterfaceDefinition returns [EObject current=null] : iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF ;
    public final EObject entryRuleRequiredInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1059:2: (iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1060:2: iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_entryRuleRequiredInterfaceDefinition2052);
            iv_ruleRequiredInterfaceDefinition=ruleRequiredInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiredInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredInterfaceDefinition2062); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequiredInterfaceDefinition"


    // $ANTLR start "ruleRequiredInterfaceDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1067:1: ruleRequiredInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' ) ;
    public final EObject ruleRequiredInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_role_1_0=null;
        Token lv_optional_2_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token lv_collection_6_0=null;
        Token lv_collectionsize_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_annotationsList_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1070:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1071:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1071:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1071:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1071:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==53) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1072:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1072:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1073:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleRequiredInterfaceDefinition2108);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRequiredInterfaceDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1089:3: ( (lv_role_1_0= 'requires' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1090:1: (lv_role_1_0= 'requires' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1090:1: (lv_role_1_0= 'requires' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1091:3: lv_role_1_0= 'requires'
            {
            lv_role_1_0=(Token)match(input,30,FOLLOW_30_in_ruleRequiredInterfaceDefinition2127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_role_1_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getRoleRequiresKeyword_1_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(current, "role", lv_role_1_0, "requires");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1104:2: ( (lv_optional_2_0= 'optional' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1105:1: (lv_optional_2_0= 'optional' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1105:1: (lv_optional_2_0= 'optional' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1106:3: lv_optional_2_0= 'optional'
                    {
                    lv_optional_2_0=(Token)match(input,31,FOLLOW_31_in_ruleRequiredInterfaceDefinition2158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_optional_2_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getOptionalOptionalKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "optional", true, "optional");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1119:3: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1120:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1120:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1121:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionAccess().getSignatureInterfaceDefinitionCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRequiredInterfaceDefinition2199);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleRequiredInterfaceDefinition2211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRequiredInterfaceDefinitionAccess().getAsKeyword_4());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1141:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1142:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1142:1: (lv_name_5_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1143:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredInterfaceDefinition2228); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_5_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getNameIDTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_5_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1159:2: ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1159:3: ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']'
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1159:3: ( (lv_collection_6_0= '[' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1160:1: (lv_collection_6_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1160:1: (lv_collection_6_0= '[' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1161:3: lv_collection_6_0= '['
                    {
                    lv_collection_6_0=(Token)match(input,28,FOLLOW_28_in_ruleRequiredInterfaceDefinition2252); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_collection_6_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getCollectionLeftSquareBracketKeyword_6_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "collection", true, "[");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1174:2: ( (lv_collectionsize_7_0= RULE_INT ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_INT) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1175:1: (lv_collectionsize_7_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1175:1: (lv_collectionsize_7_0= RULE_INT )
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1176:3: lv_collectionsize_7_0= RULE_INT
                            {
                            lv_collectionsize_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRequiredInterfaceDefinition2282); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_collectionsize_7_0, grammarAccess.getRequiredInterfaceDefinitionAccess().getCollectionsizeINTTerminalRuleCall_6_1_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getRequiredInterfaceDefinitionRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"collectionsize",
                                      		lv_collectionsize_7_0, 
                                      		"INT");
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleRequiredInterfaceDefinition2300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getRequiredInterfaceDefinitionAccess().getRightSquareBracketKeyword_6_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleRequiredInterfaceDefinition2314); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getRequiredInterfaceDefinitionAccess().getSemicolonKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequiredInterfaceDefinition"


    // $ANTLR start "entryRuleSubComponentDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1210:1: entryRuleSubComponentDefinition returns [EObject current=null] : iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF ;
    public final EObject entryRuleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1211:2: (iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1212:2: iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2352);
            iv_ruleSubComponentDefinition=ruleSubComponentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentDefinition2362); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubComponentDefinition"


    // $ANTLR start "ruleSubComponentDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1219:1: ruleSubComponentDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_body_15_0= ruleSubComponentBody ) )? otherlv_16= ';' ) ;
    public final EObject ruleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_name_14_0=null;
        Token otherlv_16=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_templatesList_4_0 = null;

        EObject lv_templatesList_6_0 = null;

        EObject lv_argumentsList_9_0 = null;

        EObject lv_argumentsList_11_0 = null;

        EObject lv_body_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1222:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_body_15_0= ruleSubComponentBody ) )? otherlv_16= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1223:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_body_15_0= ruleSubComponentBody ) )? otherlv_16= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1223:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_body_15_0= ruleSubComponentBody ) )? otherlv_16= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1223:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_body_15_0= ruleSubComponentBody ) )? otherlv_16= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1223:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==53) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1224:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1224:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1225:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition2408);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleSubComponentDefinition2421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubComponentDefinitionAccess().getContainsKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1245:1: ( ( ruleQualifiedName ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1246:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1246:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1247:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTypeTypeReferenceCrossReference_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubComponentDefinition2448);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1263:3: (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==17) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1263:5: otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSubComponentDefinition2462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSubComponentDefinitionAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1267:1: ( (lv_templatesList_4_0= ruleTemplateDefinition ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1268:1: (lv_templatesList_4_0= ruleTemplateDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1268:1: (lv_templatesList_4_0= ruleTemplateDefinition )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1269:3: lv_templatesList_4_0= ruleTemplateDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleSubComponentDefinition2483);
                    lv_templatesList_4_0=ruleTemplateDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"templatesList",
                              		lv_templatesList_4_0, 
                              		"TemplateDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1285:2: (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==18) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1285:4: otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleSubComponentDefinition2496); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getSubComponentDefinitionAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1289:1: ( (lv_templatesList_6_0= ruleTemplateDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1290:1: (lv_templatesList_6_0= ruleTemplateDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1290:1: (lv_templatesList_6_0= ruleTemplateDefinition )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1291:3: lv_templatesList_6_0= ruleTemplateDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleSubComponentDefinition2517);
                    	    lv_templatesList_6_0=ruleTemplateDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"templatesList",
                    	              		lv_templatesList_6_0, 
                    	              		"TemplateDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleSubComponentDefinition2531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSubComponentDefinitionAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1311:3: (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==33) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1311:5: otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')'
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleSubComponentDefinition2546); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSubComponentDefinitionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1315:1: ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1316:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1316:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1317:3: lv_argumentsList_9_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2567);
                    lv_argumentsList_9_0=ruleArgumentDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"argumentsList",
                              		lv_argumentsList_9_0, 
                              		"ArgumentDefinition");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1333:2: (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==18) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1333:4: otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleSubComponentDefinition2580); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getSubComponentDefinitionAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1337:1: ( (lv_argumentsList_11_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1338:1: (lv_argumentsList_11_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1338:1: (lv_argumentsList_11_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1339:3: lv_argumentsList_11_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2601);
                    	    lv_argumentsList_11_0=ruleArgumentDefinition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"argumentsList",
                    	              		lv_argumentsList_11_0, 
                    	              		"ArgumentDefinition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,34,FOLLOW_34_in_ruleSubComponentDefinition2615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSubComponentDefinitionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            otherlv_13=(Token)match(input,27,FOLLOW_27_in_ruleSubComponentDefinition2629); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getSubComponentDefinitionAccess().getAsKeyword_5());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1363:1: ( (lv_name_14_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1364:1: (lv_name_14_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1364:1: (lv_name_14_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1365:3: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubComponentDefinition2646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_14_0, grammarAccess.getSubComponentDefinitionAccess().getNameIDTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubComponentDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_14_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1381:2: ( (lv_body_15_0= ruleSubComponentBody ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==16||LA37_0==24) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1382:1: (lv_body_15_0= ruleSubComponentBody )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1382:1: (lv_body_15_0= ruleSubComponentBody )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1383:3: lv_body_15_0= ruleSubComponentBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodySubComponentBodyParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSubComponentBody_in_ruleSubComponentDefinition2672);
                    lv_body_15_0=ruleSubComponentBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubComponentDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_15_0, 
                              		"SubComponentBody");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleSubComponentDefinition2685); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getSubComponentDefinitionAccess().getSemicolonKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubComponentDefinition"


    // $ANTLR start "entryRuleSubComponentBody"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1411:1: entryRuleSubComponentBody returns [EObject current=null] : iv_ruleSubComponentBody= ruleSubComponentBody EOF ;
    public final EObject entryRuleSubComponentBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1412:2: (iv_ruleSubComponentBody= ruleSubComponentBody EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1413:2: iv_ruleSubComponentBody= ruleSubComponentBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentBodyRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentBody_in_entryRuleSubComponentBody2721);
            iv_ruleSubComponentBody=ruleSubComponentBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentBody2731); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubComponentBody"


    // $ANTLR start "ruleSubComponentBody"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1420:1: ruleSubComponentBody returns [EObject current=null] : (this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody | this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody ) ;
    public final EObject ruleSubComponentBody() throws RecognitionException {
        EObject current = null;

        EObject this_SubComponentCompositeBody_0 = null;

        EObject this_SubComponentPrimitiveBody_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1423:28: ( (this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody | this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1424:1: (this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody | this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1424:1: (this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody | this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==16) ) {
                alt38=1;
            }
            else if ( (LA38_0==24) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1425:2: this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubComponentBodyAccess().getSubComponentCompositeBodyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentCompositeBody_in_ruleSubComponentBody2781);
                    this_SubComponentCompositeBody_0=ruleSubComponentCompositeBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SubComponentCompositeBody_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1438:2: this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubComponentBodyAccess().getSubComponentPrimitiveBodyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentPrimitiveBody_in_ruleSubComponentBody2811);
                    this_SubComponentPrimitiveBody_1=ruleSubComponentPrimitiveBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SubComponentPrimitiveBody_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubComponentBody"


    // $ANTLR start "entryRuleSubComponentCompositeBody"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1457:1: entryRuleSubComponentCompositeBody returns [EObject current=null] : iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF ;
    public final EObject entryRuleSubComponentCompositeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentCompositeBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1458:2: (iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1459:2: iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentCompositeBodyRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentCompositeBody_in_entryRuleSubComponentCompositeBody2846);
            iv_ruleSubComponentCompositeBody=ruleSubComponentCompositeBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentCompositeBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentCompositeBody2856); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubComponentCompositeBody"


    // $ANTLR start "ruleSubComponentCompositeBody"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1466:1: ruleSubComponentCompositeBody returns [EObject current=null] : ( ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleSubComponentCompositeBody() throws RecognitionException {
        EObject current = null;

        Token lv_anonymous_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_1 = null;

        EObject lv_elements_2_2 = null;

        EObject lv_elements_2_3 = null;

        EObject lv_elements_2_4 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1469:28: ( ( ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1470:1: ( ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1470:1: ( ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1470:2: ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1470:2: ( (lv_anonymous_0_0= 'composite' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1471:1: (lv_anonymous_0_0= 'composite' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1471:1: (lv_anonymous_0_0= 'composite' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1472:3: lv_anonymous_0_0= 'composite'
            {
            lv_anonymous_0_0=(Token)match(input,16,FOLLOW_16_in_ruleSubComponentCompositeBody2899); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_anonymous_0_0, grammarAccess.getSubComponentCompositeBodyAccess().getAnonymousCompositeKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubComponentCompositeBodyRule());
              	        }
                     		setWithLastConsumed(current, "anonymous", true, "composite");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSubComponentCompositeBody2924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubComponentCompositeBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1489:1: ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==26||LA40_0==30||LA40_0==32||LA40_0==35||LA40_0==53) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1490:1: ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1490:1: ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1491:1: (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1491:1: (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition )
            	    int alt39=4;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        int LA39_1 = input.LA(2);

            	        if ( (synpred45_InternalFractal()) ) {
            	            alt39=1;
            	        }
            	        else if ( (synpred46_InternalFractal()) ) {
            	            alt39=2;
            	        }
            	        else if ( (synpred47_InternalFractal()) ) {
            	            alt39=3;
            	        }
            	        else if ( (true) ) {
            	            alt39=4;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 39, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt39=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1492:3: lv_elements_2_1= ruleSubComponentDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsSubComponentDefinitionParserRuleCall_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleSubComponentCompositeBody2947);
            	            lv_elements_2_1=ruleSubComponentDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentCompositeBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_1, 
            	                      		"SubComponentDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1507:8: lv_elements_2_2= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_2_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleSubComponentCompositeBody2966);
            	            lv_elements_2_2=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentCompositeBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_2, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1522:8: lv_elements_2_3= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_2_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleSubComponentCompositeBody2985);
            	            lv_elements_2_3=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentCompositeBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_3, 
            	                      		"RequiredInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1537:8: lv_elements_2_4= ruleBindingDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsBindingDefinitionParserRuleCall_2_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleBindingDefinition_in_ruleSubComponentCompositeBody3004);
            	            lv_elements_2_4=ruleBindingDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentCompositeBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_4, 
            	                      		"BindingDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSubComponentCompositeBody3020); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSubComponentCompositeBodyAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubComponentCompositeBody"


    // $ANTLR start "entryRuleSubComponentPrimitiveBody"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1567:1: entryRuleSubComponentPrimitiveBody returns [EObject current=null] : iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF ;
    public final EObject entryRuleSubComponentPrimitiveBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentPrimitiveBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1568:2: (iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1569:2: iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentPrimitiveBody_in_entryRuleSubComponentPrimitiveBody3056);
            iv_ruleSubComponentPrimitiveBody=ruleSubComponentPrimitiveBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentPrimitiveBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentPrimitiveBody3066); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubComponentPrimitiveBody"


    // $ANTLR start "ruleSubComponentPrimitiveBody"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1576:1: ruleSubComponentPrimitiveBody returns [EObject current=null] : ( ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}' ) ;
    public final EObject ruleSubComponentPrimitiveBody() throws RecognitionException {
        EObject current = null;

        Token lv_anonymous_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_1 = null;

        EObject lv_elements_2_2 = null;

        EObject lv_elements_2_3 = null;

        EObject lv_elements_2_4 = null;

        EObject lv_elements_2_5 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1579:28: ( ( ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1580:1: ( ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1580:1: ( ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1580:2: ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1580:2: ( (lv_anonymous_0_0= 'primitive' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1581:1: (lv_anonymous_0_0= 'primitive' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1581:1: (lv_anonymous_0_0= 'primitive' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1582:3: lv_anonymous_0_0= 'primitive'
            {
            lv_anonymous_0_0=(Token)match(input,24,FOLLOW_24_in_ruleSubComponentPrimitiveBody3109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_anonymous_0_0, grammarAccess.getSubComponentPrimitiveBodyAccess().getAnonymousPrimitiveKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSubComponentPrimitiveBodyRule());
              	        }
                     		setWithLastConsumed(current, "anonymous", true, "primitive");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSubComponentPrimitiveBody3134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubComponentPrimitiveBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1599:1: ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==26||LA42_0==30||(LA42_0>=49 && LA42_0<=51)||LA42_0==53) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1600:1: ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1600:1: ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1601:1: (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1601:1: (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition )
            	    int alt41=5;
            	    switch ( input.LA(1) ) {
            	    case 53:
            	        {
            	        int LA41_1 = input.LA(2);

            	        if ( (synpred49_InternalFractal()) ) {
            	            alt41=1;
            	        }
            	        else if ( (synpred50_InternalFractal()) ) {
            	            alt41=2;
            	        }
            	        else if ( (synpred51_InternalFractal()) ) {
            	            alt41=3;
            	        }
            	        else if ( (synpred52_InternalFractal()) ) {
            	            alt41=4;
            	        }
            	        else if ( (true) ) {
            	            alt41=5;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 41, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt41=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt41=2;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt41=3;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt41=4;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt41=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt41) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1602:3: lv_elements_2_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleSubComponentPrimitiveBody3157);
            	            lv_elements_2_1=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentPrimitiveBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_1, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1617:8: lv_elements_2_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_2_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleSubComponentPrimitiveBody3176);
            	            lv_elements_2_2=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentPrimitiveBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_2, 
            	                      		"RequiredInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1632:8: lv_elements_2_3= ruleImplementationDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsImplementationDefinitionParserRuleCall_2_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleImplementationDefinition_in_ruleSubComponentPrimitiveBody3195);
            	            lv_elements_2_3=ruleImplementationDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentPrimitiveBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_3, 
            	                      		"ImplementationDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1647:8: lv_elements_2_4= ruleAttributeDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsAttributeDefinitionParserRuleCall_2_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAttributeDefinition_in_ruleSubComponentPrimitiveBody3214);
            	            lv_elements_2_4=ruleAttributeDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentPrimitiveBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_4, 
            	                      		"AttributeDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1662:8: lv_elements_2_5= ruleDataDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsDataDefinitionParserRuleCall_2_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDataDefinition_in_ruleSubComponentPrimitiveBody3233);
            	            lv_elements_2_5=ruleDataDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getSubComponentPrimitiveBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_2_5, 
            	                      		"DataDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSubComponentPrimitiveBody3249); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSubComponentPrimitiveBodyAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubComponentPrimitiveBody"


    // $ANTLR start "entryRuleCompositeElement"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1694:1: entryRuleCompositeElement returns [EObject current=null] : iv_ruleCompositeElement= ruleCompositeElement EOF ;
    public final EObject entryRuleCompositeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1695:2: (iv_ruleCompositeElement= ruleCompositeElement EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1696:2: iv_ruleCompositeElement= ruleCompositeElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeElementRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeElement_in_entryRuleCompositeElement3287);
            iv_ruleCompositeElement=ruleCompositeElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeElement3297); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeElement"


    // $ANTLR start "ruleCompositeElement"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1703:1: ruleCompositeElement returns [EObject current=null] : (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition ) ;
    public final EObject ruleCompositeElement() throws RecognitionException {
        EObject current = null;

        EObject this_HostedInterfaceDefinition_0 = null;

        EObject this_SubComponentDefinition_1 = null;

        EObject this_BindingDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1706:28: ( (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1707:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1707:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                int LA43_1 = input.LA(2);

                if ( (synpred54_InternalFractal()) ) {
                    alt43=1;
                }
                else if ( (synpred55_InternalFractal()) ) {
                    alt43=2;
                }
                else if ( (true) ) {
                    alt43=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
            case 30:
                {
                alt43=1;
                }
                break;
            case 32:
                {
                alt43=2;
                }
                break;
            case 35:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1708:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getHostedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeElement3347);
                    this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HostedInterfaceDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1721:2: this_SubComponentDefinition_1= ruleSubComponentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getSubComponentDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeElement3377);
                    this_SubComponentDefinition_1=ruleSubComponentDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SubComponentDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1734:2: this_BindingDefinition_2= ruleBindingDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getBindingDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeElement3407);
                    this_BindingDefinition_2=ruleBindingDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BindingDefinition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeElement"


    // $ANTLR start "entryRulePrimitiveElement"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1753:1: entryRulePrimitiveElement returns [EObject current=null] : iv_rulePrimitiveElement= rulePrimitiveElement EOF ;
    public final EObject entryRulePrimitiveElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1754:2: (iv_rulePrimitiveElement= rulePrimitiveElement EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1755:2: iv_rulePrimitiveElement= rulePrimitiveElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveElementRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveElement_in_entryRulePrimitiveElement3442);
            iv_rulePrimitiveElement=rulePrimitiveElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveElement3452); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveElement"


    // $ANTLR start "rulePrimitiveElement"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1762:1: rulePrimitiveElement returns [EObject current=null] : (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition ) ;
    public final EObject rulePrimitiveElement() throws RecognitionException {
        EObject current = null;

        EObject this_HostedInterfaceDefinition_0 = null;

        EObject this_ImplementationDefinition_1 = null;

        EObject this_AttributeDefinition_2 = null;

        EObject this_DataDefinition_3 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1765:28: ( (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1766:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1766:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                int LA44_1 = input.LA(2);

                if ( (synpred56_InternalFractal()) ) {
                    alt44=1;
                }
                else if ( (synpred57_InternalFractal()) ) {
                    alt44=2;
                }
                else if ( (synpred58_InternalFractal()) ) {
                    alt44=3;
                }
                else if ( (true) ) {
                    alt44=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
            case 30:
                {
                alt44=1;
                }
                break;
            case 50:
                {
                alt44=2;
                }
                break;
            case 49:
                {
                alt44=3;
                }
                break;
            case 51:
                {
                alt44=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1767:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getHostedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_rulePrimitiveElement3502);
                    this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HostedInterfaceDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1780:2: this_ImplementationDefinition_1= ruleImplementationDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getImplementationDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveElement3532);
                    this_ImplementationDefinition_1=ruleImplementationDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ImplementationDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1793:2: this_AttributeDefinition_2= ruleAttributeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getAttributeDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveElement3562);
                    this_AttributeDefinition_2=ruleAttributeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeDefinition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1806:2: this_DataDefinition_3= ruleDataDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getDataDefinitionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveElement3592);
                    this_DataDefinition_3=ruleDataDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DataDefinition_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveElement"


    // $ANTLR start "entryRuleBindingDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1825:1: entryRuleBindingDefinition returns [EObject current=null] : iv_ruleBindingDefinition= ruleBindingDefinition EOF ;
    public final EObject entryRuleBindingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1826:2: (iv_ruleBindingDefinition= ruleBindingDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1827:2: iv_ruleBindingDefinition= ruleBindingDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition3627);
            iv_ruleBindingDefinition=ruleBindingDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingDefinition3637); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBindingDefinition"


    // $ANTLR start "ruleBindingDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1834:1: ruleBindingDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' ) ;
    public final EObject ruleBindingDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_isSrcParentThis_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_sourceIndex_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_isTgtParentThis_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_targetIndex_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_annotationsList_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1837:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1838:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1838:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1838:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1838:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==53) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1839:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1839:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1840:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition3683);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleBindingDefinition3696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBindingDefinitionAccess().getBindsKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1860:1: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            else if ( (LA46_0==36) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1860:2: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1860:2: ( (otherlv_2= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1861:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1861:1: (otherlv_2= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1862:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3721); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getBindingDefinitionAccess().getSourceParentSubComponentDefinitionCrossReference_2_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1877:6: ( (lv_isSrcParentThis_3_0= 'this' ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1877:6: ( (lv_isSrcParentThis_3_0= 'this' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1878:1: (lv_isSrcParentThis_3_0= 'this' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1878:1: (lv_isSrcParentThis_3_0= 'this' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1879:3: lv_isSrcParentThis_3_0= 'this'
                    {
                    lv_isSrcParentThis_3_0=(Token)match(input,36,FOLLOW_36_in_ruleBindingDefinition3745); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isSrcParentThis_3_0, grammarAccess.getBindingDefinitionAccess().getIsSrcParentThisThisKeyword_2_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "isSrcParentThis", true, "this");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleBindingDefinition3771); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1896:1: ( (otherlv_5= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1897:1: (otherlv_5= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1897:1: (otherlv_5= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1898:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getBindingDefinitionAccess().getSourceInterfaceHostedInterfaceDefinitionCrossReference_4_0()); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1912:2: (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==28) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1912:4: otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleBindingDefinition3808); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_5_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1916:1: ( (lv_sourceIndex_7_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1917:1: (lv_sourceIndex_7_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1917:1: (lv_sourceIndex_7_0= RULE_INT )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1918:3: lv_sourceIndex_7_0= RULE_INT
                    {
                    lv_sourceIndex_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition3825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sourceIndex_7_0, grammarAccess.getBindingDefinitionAccess().getSourceIndexINTTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sourceIndex",
                              		lv_sourceIndex_7_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleBindingDefinition3842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleBindingDefinition3856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getBindingDefinitionAccess().getToKeyword_6());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1942:1: ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            else if ( (LA48_0==36) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1942:2: ( (otherlv_10= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1942:2: ( (otherlv_10= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1943:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1943:1: (otherlv_10= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1944:3: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                              
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3881); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_10, grammarAccess.getBindingDefinitionAccess().getTargetParentSubComponentDefinitionCrossReference_7_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1959:6: ( (lv_isTgtParentThis_11_0= 'this' ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1959:6: ( (lv_isTgtParentThis_11_0= 'this' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1960:1: (lv_isTgtParentThis_11_0= 'this' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1960:1: (lv_isTgtParentThis_11_0= 'this' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1961:3: lv_isTgtParentThis_11_0= 'this'
                    {
                    lv_isTgtParentThis_11_0=(Token)match(input,36,FOLLOW_36_in_ruleBindingDefinition3905); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTgtParentThis_11_0, grammarAccess.getBindingDefinitionAccess().getIsTgtParentThisThisKeyword_7_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "isTgtParentThis", true, "this");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,37,FOLLOW_37_in_ruleBindingDefinition3931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_8());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1978:1: ( (otherlv_13= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1979:1: (otherlv_13= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1979:1: (otherlv_13= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1980:3: otherlv_13= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
              	        }
                      
            }
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3955); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_13, grammarAccess.getBindingDefinitionAccess().getTargetInterfaceHostedInterfaceDefinitionCrossReference_9_0()); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1994:2: (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==28) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1994:4: otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']'
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleBindingDefinition3968); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_10_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1998:1: ( (lv_targetIndex_15_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1999:1: (lv_targetIndex_15_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1999:1: (lv_targetIndex_15_0= RULE_INT )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2000:3: lv_targetIndex_15_0= RULE_INT
                    {
                    lv_targetIndex_15_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition3985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_targetIndex_15_0, grammarAccess.getBindingDefinitionAccess().getTargetIndexINTTerminalRuleCall_10_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"targetIndex",
                              		lv_targetIndex_15_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_16=(Token)match(input,29,FOLLOW_29_in_ruleBindingDefinition4002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_10_2());
                          
                    }

                    }
                    break;

            }

            otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleBindingDefinition4016); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getBindingDefinitionAccess().getSemicolonKeyword_11());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBindingDefinition"


    // $ANTLR start "entryRuleFormalArgument"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2032:1: entryRuleFormalArgument returns [EObject current=null] : iv_ruleFormalArgument= ruleFormalArgument EOF ;
    public final EObject entryRuleFormalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgument = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2033:2: (iv_ruleFormalArgument= ruleFormalArgument EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2034:2: iv_ruleFormalArgument= ruleFormalArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument4052);
            iv_ruleFormalArgument=ruleFormalArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgument4062); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormalArgument"


    // $ANTLR start "ruleFormalArgument"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2041:1: ruleFormalArgument returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFormalArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2044:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2045:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2045:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2046:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2046:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2047:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormalArgument4103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getFormalArgumentAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFormalArgumentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormalArgument"


    // $ANTLR start "entryRuleFormalArgumentsList"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2071:1: entryRuleFormalArgumentsList returns [EObject current=null] : iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF ;
    public final EObject entryRuleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgumentsList = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2072:2: (iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2073:2: iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgumentsListRule()); 
            }
            pushFollow(FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList4143);
            iv_ruleFormalArgumentsList=ruleFormalArgumentsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgumentsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgumentsList4153); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormalArgumentsList"


    // $ANTLR start "ruleFormalArgumentsList"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2080:1: ruleFormalArgumentsList returns [EObject current=null] : (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalArguments_1_0 = null;

        EObject lv_formalArguments_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2083:28: ( (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2084:1: (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2084:1: (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2084:3: otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleFormalArgumentsList4190); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFormalArgumentsListAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2088:1: ( (lv_formalArguments_1_0= ruleFormalArgument ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2089:1: (lv_formalArguments_1_0= ruleFormalArgument )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2089:1: (lv_formalArguments_1_0= ruleFormalArgument )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2090:3: lv_formalArguments_1_0= ruleFormalArgument
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4211);
            lv_formalArguments_1_0=ruleFormalArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFormalArgumentsListRule());
              	        }
                     		add(
                     			current, 
                     			"formalArguments",
                      		lv_formalArguments_1_0, 
                      		"FormalArgument");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2106:2: (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==18) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2106:4: otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleFormalArgumentsList4224); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFormalArgumentsListAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2110:1: ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2111:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2111:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2112:3: lv_formalArguments_3_0= ruleFormalArgument
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4245);
            	    lv_formalArguments_3_0=ruleFormalArgument();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFormalArgumentsListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"formalArguments",
            	              		lv_formalArguments_3_0, 
            	              		"FormalArgument");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleFormalArgumentsList4259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getFormalArgumentsListAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormalArgumentsList"


    // $ANTLR start "entryRuleTemplateSpecifier"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2140:1: entryRuleTemplateSpecifier returns [EObject current=null] : iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF ;
    public final EObject entryRuleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifier = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2141:2: (iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2142:2: iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier4295);
            iv_ruleTemplateSpecifier=ruleTemplateSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateSpecifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifier4305); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateSpecifier"


    // $ANTLR start "ruleTemplateSpecifier"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2149:1: ruleTemplateSpecifier returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2152:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2153:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2153:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2153:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2153:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2154:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2154:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2155:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSpecifier4347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getTemplateSpecifierAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTemplateSpecifierRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleTemplateSpecifier4364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTemplateSpecifierAccess().getConformstoKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2175:1: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2176:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2176:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2177:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTemplateSpecifierRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemplateSpecifierAccess().getTypeReferenceTypeDefinitionCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateSpecifier4391);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateSpecifier"


    // $ANTLR start "entryRuleAttributeType"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2201:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2202:2: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2203:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType4428);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType4439); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2210:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2213:28: ( (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2214:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2214:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            int alt51=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt51=1;
                }
                break;
            case 41:
                {
                alt51=2;
                }
                break;
            case 42:
                {
                alt51=3;
                }
                break;
            case RULE_ID:
                {
                alt51=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2215:2: kw= 'STRUCT'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleAttributeType4477); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getSTRUCTKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2222:2: kw= 'UNION'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleAttributeType4496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getUNIONKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2229:2: kw= 'ENUM'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleAttributeType4515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getENUMKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2235:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeType4536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_3, grammarAccess.getAttributeTypeAccess().getIDTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRulesignedINT"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2250:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2251:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2252:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedINTRule()); 
            }
            pushFollow(FOLLOW_rulesignedINT_in_entryRulesignedINT4582);
            iv_rulesignedINT=rulesignedINT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesignedINT4593); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesignedINT"


    // $ANTLR start "rulesignedINT"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2259:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2262:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2263:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2263:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2263:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2263:2: (kw= '+' | kw= '-' )?
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==43) ) {
                alt52=1;
            }
            else if ( (LA52_0==44) ) {
                alt52=2;
            }
            switch (alt52) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2264:2: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_rulesignedINT4632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedINTAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2271:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_rulesignedINT4651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedINTAccess().getHyphenMinusKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulesignedINT4668); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_2, grammarAccess.getSignedINTAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesignedINT"


    // $ANTLR start "entryRuleHexadecimalType"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2291:1: entryRuleHexadecimalType returns [String current=null] : iv_ruleHexadecimalType= ruleHexadecimalType EOF ;
    public final String entryRuleHexadecimalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHexadecimalType = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2292:2: (iv_ruleHexadecimalType= ruleHexadecimalType EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2293:2: iv_ruleHexadecimalType= ruleHexadecimalType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexadecimalTypeRule()); 
            }
            pushFollow(FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType4714);
            iv_ruleHexadecimalType=ruleHexadecimalType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexadecimalType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexadecimalType4725); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHexadecimalType"


    // $ANTLR start "ruleHexadecimalType"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2300:1: ruleHexadecimalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0x' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleHexadecimalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2303:28: ( (kw= '0x' this_INT_1= RULE_INT ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2304:1: (kw= '0x' this_INT_1= RULE_INT )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2304:1: (kw= '0x' this_INT_1= RULE_INT )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2305:2: kw= '0x' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,45,FOLLOW_45_in_ruleHexadecimalType4763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getHexadecimalTypeAccess().getXKeyword_0()); 
                  
            }
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHexadecimalType4778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getHexadecimalTypeAccess().getINTTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHexadecimalType"


    // $ANTLR start "entryRuleValue"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2325:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2326:2: (iv_ruleValue= ruleValue EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2327:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue4824);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue4835); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2334:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_3=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_signedINT_1 = null;

        AntlrDatatypeRuleToken this_HexadecimalType_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2337:28: ( (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2338:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2338:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' )
            int alt53=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt53=1;
                }
                break;
            case RULE_INT:
            case 43:
            case 44:
                {
                alt53=2;
                }
                break;
            case 45:
                {
                alt53=3;
                }
                break;
            case RULE_STRING:
                {
                alt53=4;
                }
                break;
            case 46:
                {
                alt53=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2338:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue4875); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2347:5: this_signedINT_1= rulesignedINT
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getSignedINTParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulesignedINT_in_ruleValue4908);
                    this_signedINT_1=rulesignedINT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_signedINT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2359:5: this_HexadecimalType_2= ruleHexadecimalType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getHexadecimalTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexadecimalType_in_ruleValue4941);
                    this_HexadecimalType_2=ruleHexadecimalType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HexadecimalType_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2370:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue4967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2379:2: kw= 'null'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleValue4991); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getValueAccess().getNullKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleTemplateDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2392:1: entryRuleTemplateDefinition returns [EObject current=null] : iv_ruleTemplateDefinition= ruleTemplateDefinition EOF ;
    public final EObject entryRuleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2393:2: (iv_ruleTemplateDefinition= ruleTemplateDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2394:2: iv_ruleTemplateDefinition= ruleTemplateDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition5031);
            iv_ruleTemplateDefinition=ruleTemplateDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateDefinition5041); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplateDefinition"


    // $ANTLR start "ruleTemplateDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2401:1: ruleTemplateDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) ) ;
    public final EObject ruleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_anyTypeReference_3_0=null;
        EObject lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2404:28: ( ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2405:1: ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2405:1: ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2405:2: ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2405:2: ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==39) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2405:3: ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2405:3: ( (lv_name_0_0= ruleTemplateSpecifier ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2406:1: (lv_name_0_0= ruleTemplateSpecifier )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2406:1: (lv_name_0_0= ruleTemplateSpecifier )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2407:3: lv_name_0_0= ruleTemplateSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateDefinitionAccess().getNameTemplateSpecifierParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateDefinition5088);
                    lv_name_0_0=ruleTemplateSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTemplateDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"TemplateSpecifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleTemplateDefinition5100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTemplateDefinitionAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2427:3: ( ( ( ruleQualifiedName ) ) | ( (lv_anyTypeReference_3_0= '?' ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                alt55=1;
            }
            else if ( (LA55_0==48) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2427:4: ( ( ruleQualifiedName ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2427:4: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2428:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2428:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2429:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemplateDefinitionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateDefinitionAccess().getTypeReferenceArchitectureDefinitionCrossReference_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateDefinition5130);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2446:6: ( (lv_anyTypeReference_3_0= '?' ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2446:6: ( (lv_anyTypeReference_3_0= '?' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2447:1: (lv_anyTypeReference_3_0= '?' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2447:1: (lv_anyTypeReference_3_0= '?' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2448:3: lv_anyTypeReference_3_0= '?'
                    {
                    lv_anyTypeReference_3_0=(Token)match(input,48,FOLLOW_48_in_ruleTemplateDefinition5154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_anyTypeReference_3_0, grammarAccess.getTemplateDefinitionAccess().getAnyTypeReferenceQuestionMarkKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTemplateDefinitionRule());
                      	        }
                             		setWithLastConsumed(current, "anyTypeReference", true, "?");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemplateDefinition"


    // $ANTLR start "entryRuleArgumentDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2469:1: entryRuleArgumentDefinition returns [EObject current=null] : iv_ruleArgumentDefinition= ruleArgumentDefinition EOF ;
    public final EObject entryRuleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2470:2: (iv_ruleArgumentDefinition= ruleArgumentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2471:2: iv_ruleArgumentDefinition= ruleArgumentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5204);
            iv_ruleArgumentDefinition=ruleArgumentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgumentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentDefinition5214); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgumentDefinition"


    // $ANTLR start "ruleArgumentDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2478:1: ruleArgumentDefinition returns [EObject current=null] : ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) ) ;
    public final EObject ruleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_argumentName_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_argumentValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2481:28: ( ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2482:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2482:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2482:2: ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2482:2: ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==47) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2482:3: ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2482:3: ( (lv_argumentName_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2483:1: (lv_argumentName_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2483:1: (lv_argumentName_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2484:3: lv_argumentName_0_0= RULE_ID
                    {
                    lv_argumentName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgumentDefinition5257); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_argumentName_0_0, grammarAccess.getArgumentDefinitionAccess().getArgumentNameIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArgumentDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"argumentName",
                              		lv_argumentName_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleArgumentDefinition5274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArgumentDefinitionAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2504:3: ( (lv_argumentValue_2_0= ruleValue ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2505:1: (lv_argumentValue_2_0= ruleValue )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2505:1: (lv_argumentValue_2_0= ruleValue )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2506:3: lv_argumentValue_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleArgumentDefinition5297);
            lv_argumentValue_2_0=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArgumentDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"argumentValue",
                      		lv_argumentValue_2_0, 
                      		"Value");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgumentDefinition"


    // $ANTLR start "entryRuleAttributeDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2530:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2531:2: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2532:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5333);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDefinition5343); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeDefinition"


    // $ANTLR start "ruleAttributeDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2539:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_attributeName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2542:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2543:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2543:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2543:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2543:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==53) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2544:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2544:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2545:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition5389);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleAttributeDefinition5402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2565:1: ( (lv_type_2_0= ruleAttributeType ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=40 && LA58_0<=42)) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_ID) ) {
                int LA58_2 = input.LA(2);

                if ( (LA58_2==RULE_ID) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2566:1: (lv_type_2_0= ruleAttributeType )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2566:1: (lv_type_2_0= ruleAttributeType )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2567:3: lv_type_2_0= ruleAttributeType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAttributeTypeParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5423);
                    lv_type_2_0=ruleAttributeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"AttributeType");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2583:3: ( (lv_attributeName_3_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2584:1: (lv_attributeName_3_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2584:1: (lv_attributeName_3_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2585:3: lv_attributeName_3_0= RULE_ID
            {
            lv_attributeName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeDefinition5441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_attributeName_3_0, grammarAccess.getAttributeDefinitionAccess().getAttributeNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"attributeName",
                      		lv_attributeName_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2601:2: (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==47) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2601:4: otherlv_4= '=' ( (lv_value_5_0= ruleValue ) )
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleAttributeDefinition5459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2605:1: ( (lv_value_5_0= ruleValue ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2606:1: (lv_value_5_0= ruleValue )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2606:1: (lv_value_5_0= ruleValue )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2607:3: lv_value_5_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getValueValueParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleAttributeDefinition5480);
                    lv_value_5_0=ruleValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAttributeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_5_0, 
                              		"Value");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleAttributeDefinition5494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeDefinition"


    // $ANTLR start "entryRuleImplementationDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2635:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2636:2: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2637:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplementationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5530);
            iv_ruleImplementationDefinition=ruleImplementationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplementationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementationDefinition5540); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplementationDefinition"


    // $ANTLR start "ruleImplementationDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2644:1: ruleImplementationDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_fileC_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2647:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2648:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2648:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2648:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2648:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==53) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2649:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2649:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2650:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition5586);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImplementationDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleImplementationDefinition5599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImplementationDefinitionAccess().getSourceKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2670:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID||LA61_0==RULE_SL||LA61_0==37||LA61_0==52) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_CODE_C) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2670:2: ( (lv_fileC_2_0= ruleFileC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2670:2: ( (lv_fileC_2_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2671:1: (lv_fileC_2_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2671:1: (lv_fileC_2_0= ruleFileC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2672:3: lv_fileC_2_0= ruleFileC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getFileCFileCParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFileC_in_ruleImplementationDefinition5621);
                    lv_fileC_2_0=ruleFileC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImplementationDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"fileC",
                              		lv_fileC_2_0, 
                              		"FileC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2689:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2689:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2690:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2690:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2691:3: lv_inlineCcode_3_0= ruleInlineCodeC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5648);
                    lv_inlineCcode_3_0=ruleInlineCodeC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImplementationDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"inlineCcode",
                              		lv_inlineCcode_3_0, 
                              		"InlineCodeC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleImplementationDefinition5661); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getImplementationDefinitionAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplementationDefinition"


    // $ANTLR start "entryRuleDataDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2719:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2720:2: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2721:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5697);
            iv_ruleDataDefinition=ruleDataDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition5707); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataDefinition"


    // $ANTLR start "ruleDataDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2728:1: ruleDataDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_fileC_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2731:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2732:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2732:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2732:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2732:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==53) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2733:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2733:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2734:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleDataDefinition5753);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"annotationsList",
                              		lv_annotationsList_0_0, 
                              		"AnnotationsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleDataDefinition5766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataDefinitionAccess().getDataKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2754:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID||LA63_0==RULE_SL||LA63_0==37||LA63_0==52) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_CODE_C) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2754:2: ( (lv_fileC_2_0= ruleFileC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2754:2: ( (lv_fileC_2_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2755:1: (lv_fileC_2_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2755:1: (lv_fileC_2_0= ruleFileC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2756:3: lv_fileC_2_0= ruleFileC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getFileCFileCParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFileC_in_ruleDataDefinition5788);
                    lv_fileC_2_0=ruleFileC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"fileC",
                              		lv_fileC_2_0, 
                              		"FileC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2773:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2773:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2774:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2774:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2775:3: lv_inlineCcode_3_0= ruleInlineCodeC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5815);
                    lv_inlineCcode_3_0=ruleInlineCodeC();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDataDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"inlineCcode",
                              		lv_inlineCcode_3_0, 
                              		"InlineCodeC");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleDataDefinition5828); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDataDefinitionAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataDefinition"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2803:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2804:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2805:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5865);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName5876); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2812:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2815:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2816:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2816:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2816:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5916); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2823:1: (kw= '.' this_ID_2= RULE_ID )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==37) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2824:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,37,FOLLOW_37_in_ruleQualifiedName5935); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5950); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleFileC"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2844:1: entryRuleFileC returns [EObject current=null] : iv_ruleFileC= ruleFileC EOF ;
    public final EObject entryRuleFileC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileC = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2845:2: (iv_ruleFileC= ruleFileC EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2846:2: iv_ruleFileC= ruleFileC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileCRule()); 
            }
            pushFollow(FOLLOW_ruleFileC_in_entryRuleFileC5997);
            iv_ruleFileC=ruleFileC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileC6007); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileC"


    // $ANTLR start "ruleFileC"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2853:1: ruleFileC returns [EObject current=null] : ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) ) ;
    public final EObject ruleFileC() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_directory_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2856:28: ( ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2857:1: ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2857:1: ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2857:2: ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2857:2: ( (lv_directory_0_0= rulePath ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_ID) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==RULE_SL) ) {
                    alt65=1;
                }
            }
            else if ( (LA65_0==RULE_SL||LA65_0==37||LA65_0==52) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2858:1: (lv_directory_0_0= rulePath )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2858:1: (lv_directory_0_0= rulePath )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2859:3: lv_directory_0_0= rulePath
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFileCAccess().getDirectoryPathParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePath_in_ruleFileC6053);
                    lv_directory_0_0=rulePath();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFileCRule());
                      	        }
                             		set(
                             			current, 
                             			"directory",
                              		lv_directory_0_0, 
                              		"Path");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2875:3: ( (lv_name_1_0= ruleFileName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2876:1: (lv_name_1_0= ruleFileName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2876:1: (lv_name_1_0= ruleFileName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2877:3: lv_name_1_0= ruleFileName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFileCAccess().getNameFileNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFileName_in_ruleFileC6075);
            lv_name_1_0=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFileCRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"FileName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileC"


    // $ANTLR start "entryRuleInlineCodeC"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2901:1: entryRuleInlineCodeC returns [EObject current=null] : iv_ruleInlineCodeC= ruleInlineCodeC EOF ;
    public final EObject entryRuleInlineCodeC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineCodeC = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2902:2: (iv_ruleInlineCodeC= ruleInlineCodeC EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2903:2: iv_ruleInlineCodeC= ruleInlineCodeC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineCodeCRule()); 
            }
            pushFollow(FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC6111);
            iv_ruleInlineCodeC=ruleInlineCodeC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineCodeC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineCodeC6121); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInlineCodeC"


    // $ANTLR start "ruleInlineCodeC"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2910:1: ruleInlineCodeC returns [EObject current=null] : ( (lv_codeC_0_0= RULE_CODE_C ) ) ;
    public final EObject ruleInlineCodeC() throws RecognitionException {
        EObject current = null;

        Token lv_codeC_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2913:28: ( ( (lv_codeC_0_0= RULE_CODE_C ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2914:1: ( (lv_codeC_0_0= RULE_CODE_C ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2914:1: ( (lv_codeC_0_0= RULE_CODE_C ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2915:1: (lv_codeC_0_0= RULE_CODE_C )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2915:1: (lv_codeC_0_0= RULE_CODE_C )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2916:3: lv_codeC_0_0= RULE_CODE_C
            {
            lv_codeC_0_0=(Token)match(input,RULE_CODE_C,FOLLOW_RULE_CODE_C_in_ruleInlineCodeC6162); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_codeC_0_0, grammarAccess.getInlineCodeCAccess().getCodeCCODE_CTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInlineCodeCRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"codeC",
                      		lv_codeC_0_0, 
                      		"CODE_C");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInlineCodeC"


    // $ANTLR start "entryRulePath"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2940:1: entryRulePath returns [String current=null] : iv_rulePath= rulePath EOF ;
    public final String entryRulePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePath = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2941:2: (iv_rulePath= rulePath EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2942:2: iv_rulePath= rulePath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathRule()); 
            }
            pushFollow(FOLLOW_rulePath_in_entryRulePath6203);
            iv_rulePath=rulePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePath.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePath6214); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePath"


    // $ANTLR start "rulePath"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2949:1: rulePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL ) ;
    public final AntlrDatatypeRuleToken rulePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_SL_3=null;
        Token this_ID_4=null;
        Token this_SL_7=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2952:28: ( ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2953:1: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2953:1: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2953:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2953:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )?
            int alt66=4;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt66=1;
                    }
                    break;
                case 37:
                    {
                    alt66=2;
                    }
                    break;
                case 52:
                    {
                    alt66=3;
                    }
                    break;
            }

            switch (alt66) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2953:7: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath6255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getPathAccess().getIDTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2962:2: kw= '.'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_rulePath6279); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPathAccess().getFullStopKeyword_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2969:2: kw= '..'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_rulePath6298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPathAccess().getFullStopFullStopKeyword_0_2()); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2974:3: (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==RULE_SL) ) {
                    int LA70_1 = input.LA(2);

                    if ( (LA70_1==RULE_ID) ) {
                        int LA70_2 = input.LA(3);

                        if ( (LA70_2==RULE_ID||LA70_2==RULE_SL||LA70_2==44) ) {
                            alt70=1;
                        }


                    }
                    else if ( (LA70_1==RULE_SL||LA70_1==52) ) {
                        alt70=1;
                    }


                }


                switch (alt70) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2974:8: this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' )
            	    {
            	    this_SL_3=(Token)match(input,RULE_SL,FOLLOW_RULE_SL_in_rulePath6316); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SL_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SL_3, grammarAccess.getPathAccess().getSLTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2981:1: ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' )
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==RULE_ID||LA69_0==RULE_SL) ) {
            	        alt69=1;
            	    }
            	    else if ( (LA69_0==52) ) {
            	        alt69=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 69, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2981:2: (this_ID_4= RULE_ID (kw= '-' )? )*
            	            {
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2981:2: (this_ID_4= RULE_ID (kw= '-' )? )*
            	            loop68:
            	            do {
            	                int alt68=2;
            	                int LA68_0 = input.LA(1);

            	                if ( (LA68_0==RULE_ID) ) {
            	                    alt68=1;
            	                }


            	                switch (alt68) {
            	            	case 1 :
            	            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2981:7: this_ID_4= RULE_ID (kw= '-' )?
            	            	    {
            	            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath6338); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      		current.merge(this_ID_4);
            	            	          
            	            	    }
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	          newLeafNode(this_ID_4, grammarAccess.getPathAccess().getIDTerminalRuleCall_1_1_0_0()); 
            	            	          
            	            	    }
            	            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2988:1: (kw= '-' )?
            	            	    int alt67=2;
            	            	    int LA67_0 = input.LA(1);

            	            	    if ( (LA67_0==44) ) {
            	            	        alt67=1;
            	            	    }
            	            	    switch (alt67) {
            	            	        case 1 :
            	            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2989:2: kw= '-'
            	            	            {
            	            	            kw=(Token)match(input,44,FOLLOW_44_in_rulePath6357); if (state.failed) return current;
            	            	            if ( state.backtracking==0 ) {

            	            	                      current.merge(kw);
            	            	                      newLeafNode(kw, grammarAccess.getPathAccess().getHyphenMinusKeyword_1_1_0_1()); 
            	            	                  
            	            	            }

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop68;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2996:2: kw= '..'
            	            {
            	            kw=(Token)match(input,52,FOLLOW_52_in_rulePath6380); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      current.merge(kw);
            	                      newLeafNode(kw, grammarAccess.getPathAccess().getFullStopFullStopKeyword_1_1_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            this_SL_7=(Token)match(input,RULE_SL,FOLLOW_RULE_SL_in_rulePath6398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_SL_7);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_SL_7, grammarAccess.getPathAccess().getSLTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePath"


    // $ANTLR start "entryRuleFileName"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3016:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3017:2: (iv_ruleFileName= ruleFileName EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3018:2: iv_ruleFileName= ruleFileName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileNameRule()); 
            }
            pushFollow(FOLLOW_ruleFileName_in_entryRuleFileName6444);
            iv_ruleFileName=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileName6455); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileName"


    // $ANTLR start "ruleFileName"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3025:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3028:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3029:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3029:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3029:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName6495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFileNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3036:1: (kw= '.' this_ID_2= RULE_ID )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==37) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3037:2: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleFileName6514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFileNameAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName6529); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_2, grammarAccess.getFileNameAccess().getIDTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileName"


    // $ANTLR start "entryRuleAnnotationsList"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3057:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3058:2: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3059:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsListRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList6576);
            iv_ruleAnnotationsList=ruleAnnotationsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationsList6586); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationsList"


    // $ANTLR start "ruleAnnotationsList"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3066:1: ruleAnnotationsList returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3069:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3070:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3070:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3070:2: ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3070:2: ( (lv_annotations_0_0= ruleAnnotation ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3071:1: (lv_annotations_0_0= ruleAnnotation )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3071:1: (lv_annotations_0_0= ruleAnnotation )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3072:3: lv_annotations_0_0= ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList6632);
            lv_annotations_0_0=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationsListRule());
              	        }
                     		add(
                     			current, 
                     			"annotations",
                      		lv_annotations_0_0, 
                      		"Annotation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3088:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==53) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3089:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3089:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3090:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList6653);
            	    lv_annotations_1_0=ruleAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAnnotationsListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"annotations",
            	              		lv_annotations_1_0, 
            	              		"Annotation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationsList"


    // $ANTLR start "entryRuleAnnotation"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3114:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3115:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3116:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation6690);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation6700); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3123:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;
        Token lv_name_1_3=null;
        Token lv_name_1_4=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_5 = null;

        EObject lv_annotationElements_3_0 = null;

        EObject lv_annotationElements_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3126:28: ( (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3127:1: (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3127:1: (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3127:3: otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleAnnotation6737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3131:1: ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3132:1: ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3132:1: ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3133:1: (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3133:1: (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName )
            int alt73=5;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt73=1;
                }
                break;
            case 55:
                {
                alt73=2;
                }
                break;
            case 56:
                {
                alt73=3;
                }
                break;
            case 57:
                {
                alt73=4;
                }
                break;
            case RULE_ID:
                {
                alt73=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3134:3: lv_name_1_1= 'Override'
                    {
                    lv_name_1_1=(Token)match(input,54,FOLLOW_54_in_ruleAnnotation6757); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_1, grammarAccess.getAnnotationAccess().getNameOverrideKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3146:8: lv_name_1_2= 'Singleton'
                    {
                    lv_name_1_2=(Token)match(input,55,FOLLOW_55_in_ruleAnnotation6786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_2, grammarAccess.getAnnotationAccess().getNameSingletonKeyword_1_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_2, null);
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3158:8: lv_name_1_3= 'LDFlags'
                    {
                    lv_name_1_3=(Token)match(input,56,FOLLOW_56_in_ruleAnnotation6815); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_3, grammarAccess.getAnnotationAccess().getNameLDFlagsKeyword_1_0_2());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_3, null);
                      	    
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3170:8: lv_name_1_4= 'CFlags'
                    {
                    lv_name_1_4=(Token)match(input,57,FOLLOW_57_in_ruleAnnotation6844); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_name_1_4, grammarAccess.getAnnotationAccess().getNameCFlagsKeyword_1_0_3());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationRule());
                      	        }
                             		setWithLastConsumed(current, "name", lv_name_1_4, null);
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3182:8: lv_name_1_5= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameQualifiedNameParserRuleCall_1_0_4()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAnnotation6876);
                    lv_name_1_5=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_5, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3200:2: (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==33) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3200:4: otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleAnnotation6892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3204:1: ( (lv_annotationElements_3_0= ruleAnnotationElement ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3205:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3205:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3206:3: lv_annotationElements_3_0= ruleAnnotationElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation6913);
                    lv_annotationElements_3_0=ruleAnnotationElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                      	        }
                             		add(
                             			current, 
                             			"annotationElements",
                              		lv_annotationElements_3_0, 
                              		"AnnotationElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3222:2: (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==18) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3222:4: otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAnnotation6926); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3226:1: ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3227:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3227:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3228:3: lv_annotationElements_5_0= ruleAnnotationElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation6947);
                    	    lv_annotationElements_5_0=ruleAnnotationElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotationElements",
                    	              		lv_annotationElements_5_0, 
                    	              		"AnnotationElement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleAnnotation6961); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAnnotationAccess().getRightParenthesisKeyword_2_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleAnnotationElement"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3256:1: entryRuleAnnotationElement returns [EObject current=null] : iv_ruleAnnotationElement= ruleAnnotationElement EOF ;
    public final EObject entryRuleAnnotationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3257:2: (iv_ruleAnnotationElement= ruleAnnotationElement EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3258:2: iv_ruleAnnotationElement= ruleAnnotationElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationElementRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement6999);
            iv_ruleAnnotationElement=ruleAnnotationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationElement7009); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnnotationElement"


    // $ANTLR start "ruleAnnotationElement"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3265:1: ruleAnnotationElement returns [EObject current=null] : ( ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) ) ;
    public final EObject ruleAnnotationElement() throws RecognitionException {
        EObject current = null;

        Token lv_elementName_0_0=null;
        Token otherlv_1=null;
        EObject lv_elementValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3268:28: ( ( ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3269:1: ( ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3269:1: ( ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3269:2: ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3269:2: ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3269:3: ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3269:3: ( (lv_elementName_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3270:1: (lv_elementName_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3270:1: (lv_elementName_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3271:3: lv_elementName_0_0= RULE_ID
                    {
                    lv_elementName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationElement7052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_elementName_0_0, grammarAccess.getAnnotationElementAccess().getElementNameIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationElementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"elementName",
                              		lv_elementName_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleAnnotationElement7069); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAnnotationElementAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3291:3: ( (lv_elementValue_2_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3292:1: (lv_elementValue_2_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3292:1: (lv_elementValue_2_0= ruleElementValue )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3293:3: lv_elementValue_2_0= ruleElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElementValue_in_ruleAnnotationElement7092);
            lv_elementValue_2_0=ruleElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationElementRule());
              	        }
                     		set(
                     			current, 
                     			"elementValue",
                      		lv_elementValue_2_0, 
                      		"ElementValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnnotationElement"


    // $ANTLR start "entryRuleElementValue"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3317:1: entryRuleElementValue returns [EObject current=null] : iv_ruleElementValue= ruleElementValue EOF ;
    public final EObject entryRuleElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3318:2: (iv_ruleElementValue= ruleElementValue EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3319:2: iv_ruleElementValue= ruleElementValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementValueRule()); 
            }
            pushFollow(FOLLOW_ruleElementValue_in_entryRuleElementValue7128);
            iv_ruleElementValue=ruleElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValue7138); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementValue"


    // $ANTLR start "ruleElementValue"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3326:1: ruleElementValue returns [EObject current=null] : (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) ;
    public final EObject ruleElementValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantValue_0 = null;

        EObject this_Annotation_1 = null;

        EObject this_ElementValueArrayInitializer_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3329:28: ( (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3330:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3330:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            int alt77=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
                {
                alt77=1;
                }
                break;
            case 53:
                {
                alt77=2;
                }
                break;
            case 21:
                {
                alt77=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3331:2: this_ConstantValue_0= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getConstantValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleElementValue7188);
                    this_ConstantValue_0=ruleConstantValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3344:2: this_Annotation_1= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleElementValue7218);
                    this_Annotation_1=ruleAnnotation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Annotation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3357:2: this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getElementValueArrayInitializerParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7248);
                    this_ElementValueArrayInitializer_2=ruleElementValueArrayInitializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ElementValueArrayInitializer_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementValue"


    // $ANTLR start "entryRuleElementValueArrayInitializer"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3376:1: entryRuleElementValueArrayInitializer returns [EObject current=null] : iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF ;
    public final EObject entryRuleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValueArrayInitializer = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3377:2: (iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3378:2: iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementValueArrayInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer7283);
            iv_ruleElementValueArrayInitializer=ruleElementValueArrayInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementValueArrayInitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValueArrayInitializer7293); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElementValueArrayInitializer"


    // $ANTLR start "ruleElementValueArrayInitializer"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3385:1: ruleElementValueArrayInitializer returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3388:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3389:1: (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3389:1: (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3389:3: otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleElementValueArrayInitializer7330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElementValueArrayInitializerAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3393:1: ( (lv_values_1_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3394:1: (lv_values_1_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3394:1: (lv_values_1_0= ruleElementValue )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3395:3: lv_values_1_0= ruleElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7351);
            lv_values_1_0=ruleElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getElementValueArrayInitializerRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_1_0, 
                      		"ElementValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3411:2: (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==18) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3411:4: otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleElementValueArrayInitializer7364); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getElementValueArrayInitializerAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3415:1: ( (lv_values_3_0= ruleElementValue ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3416:1: (lv_values_3_0= ruleElementValue )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3416:1: (lv_values_3_0= ruleElementValue )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3417:3: lv_values_3_0= ruleElementValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7385);
            	    lv_values_3_0=ruleElementValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getElementValueArrayInitializerRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_3_0, 
            	              		"ElementValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleElementValueArrayInitializer7399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getElementValueArrayInitializerAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementValueArrayInitializer"


    // $ANTLR start "entryRuleConstantValue"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3445:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3446:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3447:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantValueRule()); 
            }
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue7435);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue7445); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantValue"


    // $ANTLR start "ruleConstantValue"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3454:1: ruleConstantValue returns [EObject current=null] : ( (lv_value_0_0= ruleConstantFormat ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3457:28: ( ( (lv_value_0_0= ruleConstantFormat ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3458:1: ( (lv_value_0_0= ruleConstantFormat ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3458:1: ( (lv_value_0_0= ruleConstantFormat ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3459:1: (lv_value_0_0= ruleConstantFormat )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3459:1: (lv_value_0_0= ruleConstantFormat )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3460:3: lv_value_0_0= ruleConstantFormat
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_ruleConstantValue7490);
            lv_value_0_0=ruleConstantFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantValueRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"ConstantFormat");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantValue"


    // $ANTLR start "entryRuleConstantFormat"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3484:1: entryRuleConstantFormat returns [String current=null] : iv_ruleConstantFormat= ruleConstantFormat EOF ;
    public final String entryRuleConstantFormat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantFormat = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3485:2: (iv_ruleConstantFormat= ruleConstantFormat EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3486:2: iv_ruleConstantFormat= ruleConstantFormat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantFormatRule()); 
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7526);
            iv_ruleConstantFormat=ruleConstantFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantFormat.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantFormat7537); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantFormat"


    // $ANTLR start "ruleConstantFormat"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3493:1: ruleConstantFormat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleConstantFormat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3496:28: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3497:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3497:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_INT) ) {
                alt79=1;
            }
            else if ( (LA79_0==RULE_STRING) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3497:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstantFormat7577); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getConstantFormatAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3505:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantFormat7603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getConstantFormatAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantFormat"

    // $ANTLR start synpred1_InternalFractal
    public final void synpred1_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_imports_0_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: ( (lv_imports_0_0= ruleImportDefinition ) )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: (lv_imports_0_0= ruleImportDefinition )
        {
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:87:1: (lv_imports_0_0= ruleImportDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:88:3: lv_imports_0_0= ruleImportDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAdlDefinitionAccess().getImportsImportDefinitionParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleImportDefinition_in_synpred1_InternalFractal137);
        lv_imports_0_0=ruleImportDefinition();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalFractal

    // $ANTLR start synpred12_InternalFractal
    public final void synpred12_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_13_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:462:3: (lv_elements_13_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:462:3: lv_elements_13_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_6_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred12_InternalFractal925);
        lv_elements_13_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalFractal

    // $ANTLR start synpred13_InternalFractal
    public final void synpred13_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_13_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:477:8: (lv_elements_13_2= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:477:8: lv_elements_13_2= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_6_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred13_InternalFractal944);
        lv_elements_13_2=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalFractal

    // $ANTLR start synpred14_InternalFractal
    public final void synpred14_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_13_3 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:492:8: (lv_elements_13_3= ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:492:8: lv_elements_13_3= ruleSubComponentDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsSubComponentDefinitionParserRuleCall_6_0_2()); 
          	    
        }
        pushFollow(FOLLOW_ruleSubComponentDefinition_in_synpred14_InternalFractal963);
        lv_elements_13_3=ruleSubComponentDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalFractal

    // $ANTLR start synpred20_InternalFractal
    public final void synpred20_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_9_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:656:3: (lv_elements_9_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:656:3: lv_elements_9_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_6_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred20_InternalFractal1275);
        lv_elements_9_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalFractal

    // $ANTLR start synpred21_InternalFractal
    public final void synpred21_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_9_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:671:8: (lv_elements_9_2= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:671:8: lv_elements_9_2= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_6_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred21_InternalFractal1294);
        lv_elements_9_2=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalFractal

    // $ANTLR start synpred22_InternalFractal
    public final void synpred22_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_9_3 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:686:8: (lv_elements_9_3= ruleImplementationDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:686:8: lv_elements_9_3= ruleImplementationDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsImplementationDefinitionParserRuleCall_6_0_2()); 
          	    
        }
        pushFollow(FOLLOW_ruleImplementationDefinition_in_synpred22_InternalFractal1313);
        lv_elements_9_3=ruleImplementationDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalFractal

    // $ANTLR start synpred23_InternalFractal
    public final void synpred23_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_9_4 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:701:8: (lv_elements_9_4= ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:701:8: lv_elements_9_4= ruleAttributeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsAttributeDefinitionParserRuleCall_6_0_3()); 
          	    
        }
        pushFollow(FOLLOW_ruleAttributeDefinition_in_synpred23_InternalFractal1332);
        lv_elements_9_4=ruleAttributeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalFractal

    // $ANTLR start synpred27_InternalFractal
    public final void synpred27_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_7_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:832:3: (lv_elements_7_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:832:3: lv_elements_7_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_4_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred27_InternalFractal1590);
        lv_elements_7_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalFractal

    // $ANTLR start synpred29_InternalFractal
    public final void synpred29_InternalFractal_fragment() throws RecognitionException {   
        EObject this_ProvidedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:891:2: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:891:2: this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred29_InternalFractal1721);
        this_ProvidedInterfaceDefinition_0=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_InternalFractal

    // $ANTLR start synpred45_InternalFractal
    public final void synpred45_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1492:3: (lv_elements_2_1= ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1492:3: lv_elements_2_1= ruleSubComponentDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsSubComponentDefinitionParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleSubComponentDefinition_in_synpred45_InternalFractal2947);
        lv_elements_2_1=ruleSubComponentDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_InternalFractal

    // $ANTLR start synpred46_InternalFractal
    public final void synpred46_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1507:8: (lv_elements_2_2= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1507:8: lv_elements_2_2= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_2_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred46_InternalFractal2966);
        lv_elements_2_2=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalFractal

    // $ANTLR start synpred47_InternalFractal
    public final void synpred47_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_3 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1522:8: (lv_elements_2_3= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1522:8: lv_elements_2_3= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_2_0_2()); 
          	    
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred47_InternalFractal2985);
        lv_elements_2_3=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalFractal

    // $ANTLR start synpred49_InternalFractal
    public final void synpred49_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1602:3: (lv_elements_2_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1602:3: lv_elements_2_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred49_InternalFractal3157);
        lv_elements_2_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalFractal

    // $ANTLR start synpred50_InternalFractal
    public final void synpred50_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1617:8: (lv_elements_2_2= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1617:8: lv_elements_2_2= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_2_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred50_InternalFractal3176);
        lv_elements_2_2=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalFractal

    // $ANTLR start synpred51_InternalFractal
    public final void synpred51_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_3 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1632:8: (lv_elements_2_3= ruleImplementationDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1632:8: lv_elements_2_3= ruleImplementationDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsImplementationDefinitionParserRuleCall_2_0_2()); 
          	    
        }
        pushFollow(FOLLOW_ruleImplementationDefinition_in_synpred51_InternalFractal3195);
        lv_elements_2_3=ruleImplementationDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalFractal

    // $ANTLR start synpred52_InternalFractal
    public final void synpred52_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_4 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1647:8: (lv_elements_2_4= ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1647:8: lv_elements_2_4= ruleAttributeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsAttributeDefinitionParserRuleCall_2_0_3()); 
          	    
        }
        pushFollow(FOLLOW_ruleAttributeDefinition_in_synpred52_InternalFractal3214);
        lv_elements_2_4=ruleAttributeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalFractal

    // $ANTLR start synpred54_InternalFractal
    public final void synpred54_InternalFractal_fragment() throws RecognitionException {   
        EObject this_HostedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1708:2: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1708:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_synpred54_InternalFractal3347);
        this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalFractal

    // $ANTLR start synpred55_InternalFractal
    public final void synpred55_InternalFractal_fragment() throws RecognitionException {   
        EObject this_SubComponentDefinition_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1721:2: (this_SubComponentDefinition_1= ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1721:2: this_SubComponentDefinition_1= ruleSubComponentDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSubComponentDefinition_in_synpred55_InternalFractal3377);
        this_SubComponentDefinition_1=ruleSubComponentDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalFractal

    // $ANTLR start synpred56_InternalFractal
    public final void synpred56_InternalFractal_fragment() throws RecognitionException {   
        EObject this_HostedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1767:2: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1767:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_synpred56_InternalFractal3502);
        this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalFractal

    // $ANTLR start synpred57_InternalFractal
    public final void synpred57_InternalFractal_fragment() throws RecognitionException {   
        EObject this_ImplementationDefinition_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1780:2: (this_ImplementationDefinition_1= ruleImplementationDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1780:2: this_ImplementationDefinition_1= ruleImplementationDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleImplementationDefinition_in_synpred57_InternalFractal3532);
        this_ImplementationDefinition_1=ruleImplementationDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalFractal

    // $ANTLR start synpred58_InternalFractal
    public final void synpred58_InternalFractal_fragment() throws RecognitionException {   
        EObject this_AttributeDefinition_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1793:2: (this_AttributeDefinition_2= ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1793:2: this_AttributeDefinition_2= ruleAttributeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleAttributeDefinition_in_synpred58_InternalFractal3562);
        this_AttributeDefinition_2=ruleAttributeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalFractal

    // Delegated rules

    public final boolean synpred27_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleAdlDefinition_in_entryRuleAdlDefinition81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdlDefinition91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_ruleAdlDefinition137 = new BitSet(new long[]{0x0020000003812000L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAdlDefinition159 = new BitSet(new long[]{0x0020000003810000L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureDefinition227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_ruleArchitectureDefinition277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_ruleArchitectureDefinition307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleArchitectureDefinition337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDefinition382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleImportDefinition428 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImportDefinition441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportDefinition462 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImportDefinition474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard511 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard569 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildcard588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_entryRuleCompositeDefinition630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeDefinition640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleCompositeDefinition677 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition698 = new BitSet(new long[]{0x0000000200320000L});
    public static final BitSet FOLLOW_17_in_ruleCompositeDefinition711 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleCompositeDefinition733 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleCompositeDefinition746 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleCompositeDefinition767 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleCompositeDefinition782 = new BitSet(new long[]{0x0000000200300000L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_ruleCompositeDefinition805 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeDefinition819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition846 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_ruleCompositeDefinition859 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition886 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_ruleCompositeDefinition902 = new BitSet(new long[]{0x0020000944400000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleCompositeDefinition925 = new BitSet(new long[]{0x0020000944400000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleCompositeDefinition944 = new BitSet(new long[]{0x0020000944400000L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinition963 = new BitSet(new long[]{0x0020000944400000L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinition982 = new BitSet(new long[]{0x0020000944400000L});
    public static final BitSet FOLLOW_22_in_ruleCompositeDefinition998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_entryRulePrimitiveDefinition1034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDefinition1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulePrimitiveDefinition1087 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePrimitiveDefinition1113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1134 = new BitSet(new long[]{0x0000000200300000L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveDefinition1155 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_rulePrimitiveDefinition1169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1196 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_rulePrimitiveDefinition1209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1236 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_rulePrimitiveDefinition1252 = new BitSet(new long[]{0x002E000044400000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_rulePrimitiveDefinition1275 = new BitSet(new long[]{0x002E000044400000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_rulePrimitiveDefinition1294 = new BitSet(new long[]{0x002E000044400000L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinition1313 = new BitSet(new long[]{0x002E000044400000L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinition1332 = new BitSet(new long[]{0x002E000044400000L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinition1351 = new BitSet(new long[]{0x002E000044400000L});
    public static final BitSet FOLLOW_22_in_rulePrimitiveDefinition1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTypeDefinition1450 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1471 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleTypeDefinition1484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1511 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_ruleTypeDefinition1524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1551 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_ruleTypeDefinition1567 = new BitSet(new long[]{0x0020000044400000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleTypeDefinition1590 = new BitSet(new long[]{0x0020000044400000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleTypeDefinition1609 = new BitSet(new long[]{0x0020000044400000L});
    public static final BitSet FOLLOW_22_in_ruleTypeDefinition1625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_entryRuleHostedInterfaceDefinition1661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostedInterfaceDefinition1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleHostedInterfaceDefinition1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleHostedInterfaceDefinition1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_entryRuleProvidedInterfaceDefinition1786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedInterfaceDefinition1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleProvidedInterfaceDefinition1842 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleProvidedInterfaceDefinition1861 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProvidedInterfaceDefinition1901 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleProvidedInterfaceDefinition1913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvidedInterfaceDefinition1930 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_28_in_ruleProvidedInterfaceDefinition1954 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProvidedInterfaceDefinition1984 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleProvidedInterfaceDefinition2002 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProvidedInterfaceDefinition2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_entryRuleRequiredInterfaceDefinition2052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredInterfaceDefinition2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleRequiredInterfaceDefinition2108 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleRequiredInterfaceDefinition2127 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_31_in_ruleRequiredInterfaceDefinition2158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRequiredInterfaceDefinition2199 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRequiredInterfaceDefinition2211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredInterfaceDefinition2228 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_28_in_ruleRequiredInterfaceDefinition2252 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRequiredInterfaceDefinition2282 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRequiredInterfaceDefinition2300 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRequiredInterfaceDefinition2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentDefinition2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition2408 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSubComponentDefinition2421 = new BitSet(new long[]{0x0000000208020010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubComponentDefinition2448 = new BitSet(new long[]{0x0000000208020000L});
    public static final BitSet FOLLOW_17_in_ruleSubComponentDefinition2462 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleSubComponentDefinition2483 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleSubComponentDefinition2496 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleSubComponentDefinition2517 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleSubComponentDefinition2531 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_33_in_ruleSubComponentDefinition2546 = new BitSet(new long[]{0x0000780000000070L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2567 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_18_in_ruleSubComponentDefinition2580 = new BitSet(new long[]{0x0000780000000070L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2601 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_34_in_ruleSubComponentDefinition2615 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSubComponentDefinition2629 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubComponentDefinition2646 = new BitSet(new long[]{0x0000000001014000L});
    public static final BitSet FOLLOW_ruleSubComponentBody_in_ruleSubComponentDefinition2672 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSubComponentDefinition2685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentBody_in_entryRuleSubComponentBody2721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentBody2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_ruleSubComponentBody2781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_ruleSubComponentBody2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_entryRuleSubComponentCompositeBody2846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentCompositeBody2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSubComponentCompositeBody2899 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSubComponentCompositeBody2924 = new BitSet(new long[]{0x0020000944400000L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleSubComponentCompositeBody2947 = new BitSet(new long[]{0x0020000944400000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleSubComponentCompositeBody2966 = new BitSet(new long[]{0x0020000944400000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleSubComponentCompositeBody2985 = new BitSet(new long[]{0x0020000944400000L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleSubComponentCompositeBody3004 = new BitSet(new long[]{0x0020000944400000L});
    public static final BitSet FOLLOW_22_in_ruleSubComponentCompositeBody3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_entryRuleSubComponentPrimitiveBody3056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentPrimitiveBody3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSubComponentPrimitiveBody3109 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSubComponentPrimitiveBody3134 = new BitSet(new long[]{0x002E000044400000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleSubComponentPrimitiveBody3157 = new BitSet(new long[]{0x002E000044400000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleSubComponentPrimitiveBody3176 = new BitSet(new long[]{0x002E000044400000L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_ruleSubComponentPrimitiveBody3195 = new BitSet(new long[]{0x002E000044400000L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_ruleSubComponentPrimitiveBody3214 = new BitSet(new long[]{0x002E000044400000L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_ruleSubComponentPrimitiveBody3233 = new BitSet(new long[]{0x002E000044400000L});
    public static final BitSet FOLLOW_22_in_ruleSubComponentPrimitiveBody3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeElement_in_entryRuleCompositeElement3287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeElement3297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeElement3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeElement3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeElement3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveElement_in_entryRulePrimitiveElement3442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveElement3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_rulePrimitiveElement3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveElement3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveElement3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveElement3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition3627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingDefinition3637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition3683 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleBindingDefinition3696 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3721 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36_in_ruleBindingDefinition3745 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleBindingDefinition3771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3795 = new BitSet(new long[]{0x0000004010000000L});
    public static final BitSet FOLLOW_28_in_ruleBindingDefinition3808 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition3825 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleBindingDefinition3842 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBindingDefinition3856 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3881 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36_in_ruleBindingDefinition3905 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleBindingDefinition3931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3955 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_28_in_ruleBindingDefinition3968 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition3985 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleBindingDefinition4002 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBindingDefinition4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument4052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgument4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormalArgument4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList4143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgumentsList4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFormalArgumentsList4190 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4211 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_18_in_ruleFormalArgumentsList4224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4245 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_34_in_ruleFormalArgumentsList4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier4295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifier4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSpecifier4347 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleTemplateSpecifier4364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateSpecifier4391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType4428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType4439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAttributeType4477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAttributeType4496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAttributeType4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeType4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT4582 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignedINT4593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulesignedINT4632 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_44_in_rulesignedINT4651 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType4714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexadecimalType4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleHexadecimalType4763 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHexadecimalType4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue4824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_ruleValue4908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexadecimalType_in_ruleValue4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleValue4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition5031 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDefinition5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateDefinition5088 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleTemplateDefinition5100 = new BitSet(new long[]{0x0001000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateDefinition5130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTemplateDefinition5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDefinition5214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDefinition5257 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleArgumentDefinition5274 = new BitSet(new long[]{0x0000780000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition5297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDefinition5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition5389 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleAttributeDefinition5402 = new BitSet(new long[]{0x0000070000000010L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition5441 = new BitSet(new long[]{0x0000800000004000L});
    public static final BitSet FOLLOW_47_in_ruleAttributeDefinition5459 = new BitSet(new long[]{0x0000780000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttributeDefinition5480 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAttributeDefinition5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementationDefinition5540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition5586 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleImplementationDefinition5599 = new BitSet(new long[]{0x0010002000000190L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleImplementationDefinition5621 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5648 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImplementationDefinition5661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition5707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleDataDefinition5753 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleDataDefinition5766 = new BitSet(new long[]{0x0010002000000190L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleDataDefinition5788 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5815 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataDefinition5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5916 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleQualifiedName5935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5950 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleFileC_in_entryRuleFileC5997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileC6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_ruleFileC6053 = new BitSet(new long[]{0x0010002000000110L});
    public static final BitSet FOLLOW_ruleFileName_in_ruleFileC6075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC6111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineCodeC6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_C_in_ruleInlineCodeC6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath6203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath6255 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_37_in_rulePath6279 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_52_in_rulePath6298 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SL_in_rulePath6316 = new BitSet(new long[]{0x0010000000000110L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath6338 = new BitSet(new long[]{0x0000100000000110L});
    public static final BitSet FOLLOW_44_in_rulePath6357 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_52_in_rulePath6380 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SL_in_rulePath6398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileName_in_entryRuleFileName6444 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileName6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName6495 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleFileName6514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList6576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList6586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList6632 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList6653 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation6690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation6700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAnnotation6737 = new BitSet(new long[]{0x03C0000000000010L});
    public static final BitSet FOLLOW_54_in_ruleAnnotation6757 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_55_in_ruleAnnotation6786 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_56_in_ruleAnnotation6815 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_57_in_ruleAnnotation6844 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotation6876 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleAnnotation6892 = new BitSet(new long[]{0x0020000000200070L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation6913 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_18_in_ruleAnnotation6926 = new BitSet(new long[]{0x0020000000200070L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation6947 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_34_in_ruleAnnotation6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement6999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationElement7009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationElement7052 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleAnnotationElement7069 = new BitSet(new long[]{0x0020000000200070L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement7092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValue_in_entryRuleElementValue7128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValue7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleElementValue7188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleElementValue7218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer7283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValueArrayInitializer7293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleElementValueArrayInitializer7330 = new BitSet(new long[]{0x0020000000200070L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7351 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_18_in_ruleElementValueArrayInitializer7364 = new BitSet(new long[]{0x0020000000200070L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7385 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_22_in_ruleElementValueArrayInitializer7399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue7435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue7445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_ruleConstantValue7490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantFormat7537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstantFormat7577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantFormat7603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_synpred1_InternalFractal137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred12_InternalFractal925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred13_InternalFractal944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred14_InternalFractal963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred20_InternalFractal1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred21_InternalFractal1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_synpred22_InternalFractal1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred23_InternalFractal1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred27_InternalFractal1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred29_InternalFractal1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred45_InternalFractal2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred46_InternalFractal2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred47_InternalFractal2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred49_InternalFractal3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred50_InternalFractal3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_synpred51_InternalFractal3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred52_InternalFractal3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_synpred54_InternalFractal3347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred55_InternalFractal3377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_synpred56_InternalFractal3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_synpred57_InternalFractal3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred58_InternalFractal3562 = new BitSet(new long[]{0x0000000000000002L});

}
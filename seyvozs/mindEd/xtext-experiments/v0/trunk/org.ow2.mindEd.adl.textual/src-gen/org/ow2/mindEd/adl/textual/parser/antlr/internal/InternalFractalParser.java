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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_CODE_C", "RULE_SL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "';'", "'.*'", "'composite'", "'<'", "','", "'>'", "'extends'", "'{'", "'}'", "'abstract'", "'primitive'", "'type'", "'provides'", "'as'", "'['", "']'", "'requires'", "'optional'", "'contains'", "'('", "')'", "'binds'", "'this'", "'.'", "'to'", "'conformsto'", "'STRUCT'", "'UNION'", "'ENUM'", "'+'", "'-'", "'0x'", "'null'", "'='", "'attribute'", "'source'", "'data'", "'..'", "'@'", "'Override'", "'Singleton'", "'LDFlags'", "'CFlags'"
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:82:1: ruleAdlDefinition returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architectureDefinition_1_0= ruleArchitectureDefinition ) ) ) ;
    public final EObject ruleAdlDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_architectureDefinition_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:85:28: ( ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architectureDefinition_1_0= ruleArchitectureDefinition ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:1: ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architectureDefinition_1_0= ruleArchitectureDefinition ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:1: ( ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architectureDefinition_1_0= ruleArchitectureDefinition ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:2: ( (lv_imports_0_0= ruleImportDefinition ) )* ( (lv_architectureDefinition_1_0= ruleArchitectureDefinition ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:86:2: ( (lv_imports_0_0= ruleImportDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==52) ) {
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:104:3: ( (lv_architectureDefinition_1_0= ruleArchitectureDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:105:1: (lv_architectureDefinition_1_0= ruleArchitectureDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:105:1: (lv_architectureDefinition_1_0= ruleArchitectureDefinition )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:106:3: lv_architectureDefinition_1_0= ruleArchitectureDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdlDefinitionAccess().getArchitectureDefinitionArchitectureDefinitionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition159);
            lv_architectureDefinition_1_0=ruleArchitectureDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdlDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"architectureDefinition",
                      		lv_architectureDefinition_1_0, 
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:130:1: entryRuleArchitectureDefinition returns [EObject current=null] : iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF ;
    public final EObject entryRuleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:131:2: (iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:132:2: iv_ruleArchitectureDefinition= ruleArchitectureDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArchitectureDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition195);
            iv_ruleArchitectureDefinition=ruleArchitectureDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArchitectureDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArchitectureDefinition205); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:139:1: ruleArchitectureDefinition returns [EObject current=null] : (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition ) ;
    public final EObject ruleArchitectureDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeDefinition_0 = null;

        EObject this_PrimitiveDefinition_1 = null;

        EObject this_TypeDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:142:28: ( (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:143:1: (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:143:1: (this_CompositeDefinition_0= ruleCompositeDefinition | this_PrimitiveDefinition_1= rulePrimitiveDefinition | this_TypeDefinition_2= ruleTypeDefinition )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                int LA2_1 = input.LA(2);

                if ( (synpred2_InternalFractal()) ) {
                    alt2=1;
                }
                else if ( (synpred3_InternalFractal()) ) {
                    alt2=2;
                }
                else if ( (true) ) {
                    alt2=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                alt2=1;
                }
                break;
            case 23:
            case 24:
                {
                alt2=2;
                }
                break;
            case 25:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:144:2: this_CompositeDefinition_0= ruleCompositeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getCompositeDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeDefinition_in_ruleArchitectureDefinition255);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:157:2: this_PrimitiveDefinition_1= rulePrimitiveDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getPrimitiveDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimitiveDefinition_in_ruleArchitectureDefinition285);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:170:2: this_TypeDefinition_2= ruleTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getArchitectureDefinitionAccess().getTypeDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleArchitectureDefinition315);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:189:1: entryRuleImportDefinition returns [EObject current=null] : iv_ruleImportDefinition= ruleImportDefinition EOF ;
    public final EObject entryRuleImportDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:190:2: (iv_ruleImportDefinition= ruleImportDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:191:2: iv_ruleImportDefinition= ruleImportDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition350);
            iv_ruleImportDefinition=ruleImportDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportDefinition360); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:198:1: ruleImportDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' ) ;
    public final EObject ruleImportDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:201:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:202:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:202:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:202:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'import' ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) ) otherlv_3= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:202:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==52) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:203:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:203:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:204:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleImportDefinition406);
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

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleImportDefinition419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImportDefinitionAccess().getImportKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:224:1: ( (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:225:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:225:1: (lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:226:3: lv_importedNamespace_2_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportDefinitionAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportDefinition440);
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

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleImportDefinition452); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:254:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:255:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:256:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard489);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard500); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:263:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:266:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:267:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:267:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:268:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard547);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:278:1: (kw= '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:279:2: kw= '.*'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleQualifiedNameWithWildcard566); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:292:1: entryRuleCompositeDefinition returns [EObject current=null] : iv_ruleCompositeDefinition= ruleCompositeDefinition EOF ;
    public final EObject entryRuleCompositeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:293:2: (iv_ruleCompositeDefinition= ruleCompositeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:294:2: iv_ruleCompositeDefinition= ruleCompositeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeDefinition_in_entryRuleCompositeDefinition608);
            iv_ruleCompositeDefinition=ruleCompositeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeDefinition618); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:301:1: ruleCompositeDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )? ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )? (otherlv_9= 'extends' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= '{' ( ( (lv_elements_14_1= ruleHostedInterfaceDefinition | lv_elements_14_2= ruleSubComponentDefinition | lv_elements_14_3= ruleBindingDefinition ) ) )* otherlv_15= '}' ) ;
    public final EObject ruleCompositeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_templateSpecifiers_4_0 = null;

        EObject lv_templateSpecifiers_6_0 = null;

        EObject lv_compositeFormalArgumentsList_8_0 = null;

        EObject lv_elements_14_1 = null;

        EObject lv_elements_14_2 = null;

        EObject lv_elements_14_3 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:304:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )? ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )? (otherlv_9= 'extends' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= '{' ( ( (lv_elements_14_1= ruleHostedInterfaceDefinition | lv_elements_14_2= ruleSubComponentDefinition | lv_elements_14_3= ruleBindingDefinition ) ) )* otherlv_15= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:305:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )? ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )? (otherlv_9= 'extends' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= '{' ( ( (lv_elements_14_1= ruleHostedInterfaceDefinition | lv_elements_14_2= ruleSubComponentDefinition | lv_elements_14_3= ruleBindingDefinition ) ) )* otherlv_15= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:305:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )? ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )? (otherlv_9= 'extends' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= '{' ( ( (lv_elements_14_1= ruleHostedInterfaceDefinition | lv_elements_14_2= ruleSubComponentDefinition | lv_elements_14_3= ruleBindingDefinition ) ) )* otherlv_15= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:305:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'composite' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )? ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )? (otherlv_9= 'extends' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_13= '{' ( ( (lv_elements_14_1= ruleHostedInterfaceDefinition | lv_elements_14_2= ruleSubComponentDefinition | lv_elements_14_3= ruleBindingDefinition ) ) )* otherlv_15= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:305:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==52) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:306:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:306:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:307:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleCompositeDefinition664);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleCompositeDefinition677); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCompositeDefinitionAccess().getCompositeKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:327:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:328:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:328:1: (lv_name_2_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:329:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompositeDefinition698);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:345:2: (otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:345:4: otherlv_3= '<' ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* ) otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleCompositeDefinition711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCompositeDefinitionAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:349:1: ( ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )* )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:349:2: ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) ) (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )*
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:349:2: ( (lv_templateSpecifiers_4_0= ruleTemplateSpecifier ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:350:1: (lv_templateSpecifiers_4_0= ruleTemplateSpecifier )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:350:1: (lv_templateSpecifiers_4_0= ruleTemplateSpecifier )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:351:3: lv_templateSpecifiers_4_0= ruleTemplateSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_3_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleCompositeDefinition733);
                    lv_templateSpecifiers_4_0=ruleTemplateSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"templateSpecifiers",
                              		lv_templateSpecifiers_4_0, 
                              		"TemplateSpecifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:367:2: (otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:367:4: otherlv_5= ',' ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleCompositeDefinition746); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getCompositeDefinitionAccess().getCommaKeyword_3_1_1_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:371:1: ( (lv_templateSpecifiers_6_0= ruleTemplateSpecifier ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:372:1: (lv_templateSpecifiers_6_0= ruleTemplateSpecifier )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:372:1: (lv_templateSpecifiers_6_0= ruleTemplateSpecifier )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:373:3: lv_templateSpecifiers_6_0= ruleTemplateSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getTemplateSpecifiersTemplateSpecifierParserRuleCall_3_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleCompositeDefinition767);
                    	    lv_templateSpecifiers_6_0=ruleTemplateSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"templateSpecifiers",
                    	              		lv_templateSpecifiers_6_0, 
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

                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleCompositeDefinition782); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getCompositeDefinitionAccess().getGreaterThanSignKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:393:3: ( (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:394:1: (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:394:1: (lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:395:3: lv_compositeFormalArgumentsList_8_0= ruleFormalArgumentsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_ruleCompositeDefinition805);
                    lv_compositeFormalArgumentsList_8_0=ruleFormalArgumentsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"compositeFormalArgumentsList",
                              		lv_compositeFormalArgumentsList_8_0, 
                              		"FormalArgumentsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:411:3: (otherlv_9= 'extends' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:411:5: otherlv_9= 'extends' ( ( ruleQualifiedName ) ) (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleCompositeDefinition819); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getCompositeDefinitionAccess().getExtendsKeyword_5_0());
                          
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
                       
                      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getSuperTypesArchitectureDefinitionCrossReference_5_1_0()); 
                      	    
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:433:2: (otherlv_11= ',' ( ( ruleQualifiedName ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:433:4: otherlv_11= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_11=(Token)match(input,18,FOLLOW_18_in_ruleCompositeDefinition859); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getCompositeDefinitionAccess().getCommaKeyword_5_2_0());
                    	          
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
                    	       
                    	      	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getSuperTypesArchitectureDefinitionCrossReference_5_2_1_0()); 
                    	      	    
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

            otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleCompositeDefinition902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getCompositeDefinitionAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:459:1: ( ( (lv_elements_14_1= ruleHostedInterfaceDefinition | lv_elements_14_2= ruleSubComponentDefinition | lv_elements_14_3= ruleBindingDefinition ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26||LA12_0==30||LA12_0==32||LA12_0==35||LA12_0==52) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:460:1: ( (lv_elements_14_1= ruleHostedInterfaceDefinition | lv_elements_14_2= ruleSubComponentDefinition | lv_elements_14_3= ruleBindingDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:460:1: ( (lv_elements_14_1= ruleHostedInterfaceDefinition | lv_elements_14_2= ruleSubComponentDefinition | lv_elements_14_3= ruleBindingDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:461:1: (lv_elements_14_1= ruleHostedInterfaceDefinition | lv_elements_14_2= ruleSubComponentDefinition | lv_elements_14_3= ruleBindingDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:461:1: (lv_elements_14_1= ruleHostedInterfaceDefinition | lv_elements_14_2= ruleSubComponentDefinition | lv_elements_14_3= ruleBindingDefinition )
            	    int alt11=3;
            	    switch ( input.LA(1) ) {
            	    case 52:
            	        {
            	        int LA11_1 = input.LA(2);

            	        if ( (synpred12_InternalFractal()) ) {
            	            alt11=1;
            	        }
            	        else if ( (synpred13_InternalFractal()) ) {
            	            alt11=2;
            	        }
            	        else if ( (true) ) {
            	            alt11=3;
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
            	    case 30:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt11=3;
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:462:3: lv_elements_14_1= ruleHostedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsHostedInterfaceDefinitionParserRuleCall_7_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeDefinition925);
            	            lv_elements_14_1=ruleHostedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_14_1, 
            	                      		"HostedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:477:8: lv_elements_14_2= ruleSubComponentDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsSubComponentDefinitionParserRuleCall_7_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinition944);
            	            lv_elements_14_2=ruleSubComponentDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_14_2, 
            	                      		"SubComponentDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:492:8: lv_elements_14_3= ruleBindingDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsBindingDefinitionParserRuleCall_7_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinition963);
            	            lv_elements_14_3=ruleBindingDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getCompositeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_14_3, 
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

            otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleCompositeDefinition979); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getCompositeDefinitionAccess().getRightCurlyBracketKeyword_8());
                  
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:522:1: entryRulePrimitiveDefinition returns [EObject current=null] : iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF ;
    public final EObject entryRulePrimitiveDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:523:2: (iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:524:2: iv_rulePrimitiveDefinition= rulePrimitiveDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveDefinition_in_entryRulePrimitiveDefinition1015);
            iv_rulePrimitiveDefinition=rulePrimitiveDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveDefinition1025); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:531:1: rulePrimitiveDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_9= '{' ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition ) ) )* otherlv_11= '}' ) ;
    public final EObject rulePrimitiveDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_compositeFormalArgumentsList_4_0 = null;

        EObject lv_elements_10_1 = null;

        EObject lv_elements_10_2 = null;

        EObject lv_elements_10_3 = null;

        EObject lv_elements_10_4 = null;

        EObject lv_elements_10_5 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:534:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_9= '{' ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition ) ) )* otherlv_11= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:535:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_9= '{' ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition ) ) )* otherlv_11= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:535:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_9= '{' ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition ) ) )* otherlv_11= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:535:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'primitive' ( (lv_name_3_0= ruleQualifiedName ) ) ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )? (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_9= '{' ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition ) ) )* otherlv_11= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:535:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==52) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:536:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:536:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:537:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_rulePrimitiveDefinition1071);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:553:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:554:1: (lv_abstract_1_0= 'abstract' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:554:1: (lv_abstract_1_0= 'abstract' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:555:3: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,23,FOLLOW_23_in_rulePrimitiveDefinition1090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_abstract_1_0, grammarAccess.getPrimitiveDefinitionAccess().getAbstractAbstractKeyword_1_0());
                          
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_rulePrimitiveDefinition1116); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPrimitiveDefinitionAccess().getPrimitiveKeyword_2());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:572:1: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:573:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:573:1: (lv_name_3_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:574:3: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getNameQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1137);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:590:2: ( (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:591:1: (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:591:1: (lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:592:3: lv_compositeFormalArgumentsList_4_0= ruleFormalArgumentsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getCompositeFormalArgumentsListFormalArgumentsListParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveDefinition1158);
                    lv_compositeFormalArgumentsList_4_0=ruleFormalArgumentsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"compositeFormalArgumentsList",
                              		lv_compositeFormalArgumentsList_4_0, 
                              		"FormalArgumentsList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:608:3: (otherlv_5= 'extends' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:608:5: otherlv_5= 'extends' ( ( ruleQualifiedName ) ) (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_rulePrimitiveDefinition1172); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPrimitiveDefinitionAccess().getExtendsKeyword_5_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:612:1: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:613:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:613:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:614:3: ruleQualifiedName
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
                       
                      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getSuperTypesArchitectureDefinitionCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1199);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:630:2: (otherlv_7= ',' ( ( ruleQualifiedName ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==18) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:630:4: otherlv_7= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_18_in_rulePrimitiveDefinition1212); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getPrimitiveDefinitionAccess().getCommaKeyword_5_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:634:1: ( ( ruleQualifiedName ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:635:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:635:1: ( ruleQualifiedName )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:636:3: ruleQualifiedName
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
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getSuperTypesArchitectureDefinitionCrossReference_5_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1239);
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
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_21_in_rulePrimitiveDefinition1255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getPrimitiveDefinitionAccess().getLeftCurlyBracketKeyword_6());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:656:1: ( ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==26||LA19_0==30||(LA19_0>=48 && LA19_0<=50)||LA19_0==52) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:657:1: ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:657:1: ( (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:658:1: (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:658:1: (lv_elements_10_1= ruleProvidedInterfaceDefinition | lv_elements_10_2= ruleRequiredInterfaceDefinition | lv_elements_10_3= ruleImplementationDefinition | lv_elements_10_4= ruleAttributeDefinition | lv_elements_10_5= ruleDataDefinition )
            	    int alt18=5;
            	    switch ( input.LA(1) ) {
            	    case 52:
            	        {
            	        int LA18_1 = input.LA(2);

            	        if ( (synpred20_InternalFractal()) ) {
            	            alt18=1;
            	        }
            	        else if ( (synpred21_InternalFractal()) ) {
            	            alt18=2;
            	        }
            	        else if ( (synpred22_InternalFractal()) ) {
            	            alt18=3;
            	        }
            	        else if ( (synpred23_InternalFractal()) ) {
            	            alt18=4;
            	        }
            	        else if ( (true) ) {
            	            alt18=5;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 18, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt18=4;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt18=5;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:659:3: lv_elements_10_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_7_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_rulePrimitiveDefinition1278);
            	            lv_elements_10_1=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_10_1, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:674:8: lv_elements_10_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_7_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_rulePrimitiveDefinition1297);
            	            lv_elements_10_2=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_10_2, 
            	                      		"RequiredInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:689:8: lv_elements_10_3= ruleImplementationDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsImplementationDefinitionParserRuleCall_7_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinition1316);
            	            lv_elements_10_3=ruleImplementationDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_10_3, 
            	                      		"ImplementationDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:704:8: lv_elements_10_4= ruleAttributeDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsAttributeDefinitionParserRuleCall_7_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinition1335);
            	            lv_elements_10_4=ruleAttributeDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_10_4, 
            	                      		"AttributeDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:719:8: lv_elements_10_5= ruleDataDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsDataDefinitionParserRuleCall_7_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinition1354);
            	            lv_elements_10_5=ruleDataDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getPrimitiveDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_10_5, 
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
            	    break loop19;
                }
            } while (true);

            otherlv_11=(Token)match(input,22,FOLLOW_22_in_rulePrimitiveDefinition1370); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getPrimitiveDefinitionAccess().getRightCurlyBracketKeyword_8());
                  
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:749:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:750:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:751:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1406);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition1416); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:758:1: ruleTypeDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( ( (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elements_8_1 = null;

        EObject lv_elements_8_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:761:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( ( (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_9= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:762:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( ( (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_9= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:762:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( ( (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_9= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:762:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'type' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( ( (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition ) ) )* otherlv_9= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:762:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==52) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:763:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:763:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:764:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleTypeDefinition1462);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleTypeDefinition1475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:784:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:785:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:785:1: (lv_name_2_0= ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:786:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1496);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:802:2: (otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:802:4: otherlv_3= 'extends' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleTypeDefinition1509); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTypeDefinitionAccess().getExtendsKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:806:1: ( ( ruleQualifiedName ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:807:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:807:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:808:3: ruleQualifiedName
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
                       
                      	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getSuperTypesArchitectureDefinitionCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1536);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:824:2: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==18) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:824:4: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleTypeDefinition1549); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getTypeDefinitionAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:828:1: ( ( ruleQualifiedName ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:829:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:829:1: ( ruleQualifiedName )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:830:3: ruleQualifiedName
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
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getSuperTypesArchitectureDefinitionCrossReference_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1576);
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
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleTypeDefinition1592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getTypeDefinitionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:850:1: ( ( (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==26||LA24_0==30||LA24_0==52) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:851:1: ( (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:851:1: ( (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:852:1: (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:852:1: (lv_elements_8_1= ruleProvidedInterfaceDefinition | lv_elements_8_2= ruleRequiredInterfaceDefinition )
            	    int alt23=2;
            	    switch ( input.LA(1) ) {
            	    case 52:
            	        {
            	        int LA23_1 = input.LA(2);

            	        if ( (synpred28_InternalFractal()) ) {
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:853:3: lv_elements_8_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_5_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleTypeDefinition1615);
            	            lv_elements_8_1=ruleProvidedInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_8_1, 
            	                      		"ProvidedInterfaceDefinition");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:868:8: lv_elements_8_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_5_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleTypeDefinition1634);
            	            lv_elements_8_2=ruleRequiredInterfaceDefinition();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"elements",
            	                      		lv_elements_8_2, 
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
            	    break loop24;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleTypeDefinition1650); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getTypeDefinitionAccess().getRightCurlyBracketKeyword_6());
                  
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:898:1: entryRuleHostedInterfaceDefinition returns [EObject current=null] : iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF ;
    public final EObject entryRuleHostedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHostedInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:899:2: (iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:900:2: iv_ruleHostedInterfaceDefinition= ruleHostedInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHostedInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_entryRuleHostedInterfaceDefinition1686);
            iv_ruleHostedInterfaceDefinition=ruleHostedInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHostedInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHostedInterfaceDefinition1696); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:907:1: ruleHostedInterfaceDefinition returns [EObject current=null] : (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition ) ;
    public final EObject ruleHostedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_ProvidedInterfaceDefinition_0 = null;

        EObject this_RequiredInterfaceDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:910:28: ( (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:911:1: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:911:1: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition | this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition )
            int alt25=2;
            switch ( input.LA(1) ) {
            case 52:
                {
                int LA25_1 = input.LA(2);

                if ( (synpred30_InternalFractal()) ) {
                    alt25=1;
                }
                else if ( (true) ) {
                    alt25=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt25=1;
                }
                break;
            case 30:
                {
                alt25=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:912:2: this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostedInterfaceDefinitionAccess().getProvidedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleHostedInterfaceDefinition1746);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:925:2: this_RequiredInterfaceDefinition_1= ruleRequiredInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHostedInterfaceDefinitionAccess().getRequiredInterfaceDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleHostedInterfaceDefinition1776);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:944:1: entryRuleProvidedInterfaceDefinition returns [EObject current=null] : iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF ;
    public final EObject entryRuleProvidedInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvidedInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:945:2: (iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:946:2: iv_ruleProvidedInterfaceDefinition= ruleProvidedInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_entryRuleProvidedInterfaceDefinition1811);
            iv_ruleProvidedInterfaceDefinition=ruleProvidedInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProvidedInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvidedInterfaceDefinition1821); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:953:1: ruleProvidedInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:956:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:957:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:957:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:957:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'provides' ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( (lv_name_4_0= RULE_ID ) ) ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )? otherlv_8= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:957:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==52) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:958:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:958:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:959:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getProvidedInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleProvidedInterfaceDefinition1867);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:975:3: ( (lv_role_1_0= 'provides' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:976:1: (lv_role_1_0= 'provides' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:976:1: (lv_role_1_0= 'provides' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:977:3: lv_role_1_0= 'provides'
            {
            lv_role_1_0=(Token)match(input,26,FOLLOW_26_in_ruleProvidedInterfaceDefinition1886); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:990:2: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:991:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:991:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:992:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleProvidedInterfaceDefinition1926);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleProvidedInterfaceDefinition1938); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getProvidedInterfaceDefinitionAccess().getAsKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1012:1: ( (lv_name_4_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1013:1: (lv_name_4_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1013:1: (lv_name_4_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1014:3: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleProvidedInterfaceDefinition1955); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1030:2: ( ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1030:3: ( (lv_collection_5_0= '[' ) ) ( (lv_collectionsize_6_0= RULE_INT ) )? otherlv_7= ']'
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1030:3: ( (lv_collection_5_0= '[' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1031:1: (lv_collection_5_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1031:1: (lv_collection_5_0= '[' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1032:3: lv_collection_5_0= '['
                    {
                    lv_collection_5_0=(Token)match(input,28,FOLLOW_28_in_ruleProvidedInterfaceDefinition1979); if (state.failed) return current;
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1045:2: ( (lv_collectionsize_6_0= RULE_INT ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_INT) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1046:1: (lv_collectionsize_6_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1046:1: (lv_collectionsize_6_0= RULE_INT )
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1047:3: lv_collectionsize_6_0= RULE_INT
                            {
                            lv_collectionsize_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleProvidedInterfaceDefinition2009); if (state.failed) return current;
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

                    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleProvidedInterfaceDefinition2027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getProvidedInterfaceDefinitionAccess().getRightSquareBracketKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleProvidedInterfaceDefinition2041); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1079:1: entryRuleRequiredInterfaceDefinition returns [EObject current=null] : iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF ;
    public final EObject entryRuleRequiredInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1080:2: (iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1081:2: iv_ruleRequiredInterfaceDefinition= ruleRequiredInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_entryRuleRequiredInterfaceDefinition2077);
            iv_ruleRequiredInterfaceDefinition=ruleRequiredInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequiredInterfaceDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequiredInterfaceDefinition2087); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1088:1: ruleRequiredInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1091:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1092:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1092:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1092:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_role_1_0= 'requires' ) ) ( (lv_optional_2_0= 'optional' ) )? ( ( ruleQualifiedName ) ) otherlv_4= 'as' ( (lv_name_5_0= RULE_ID ) ) ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )? otherlv_9= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1092:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==52) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1093:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1093:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1094:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRequiredInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleRequiredInterfaceDefinition2133);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1110:3: ( (lv_role_1_0= 'requires' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1111:1: (lv_role_1_0= 'requires' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1111:1: (lv_role_1_0= 'requires' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1112:3: lv_role_1_0= 'requires'
            {
            lv_role_1_0=(Token)match(input,30,FOLLOW_30_in_ruleRequiredInterfaceDefinition2152); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1125:2: ( (lv_optional_2_0= 'optional' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1126:1: (lv_optional_2_0= 'optional' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1126:1: (lv_optional_2_0= 'optional' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1127:3: lv_optional_2_0= 'optional'
                    {
                    lv_optional_2_0=(Token)match(input,31,FOLLOW_31_in_ruleRequiredInterfaceDefinition2183); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1140:3: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1141:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1141:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1142:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleRequiredInterfaceDefinition2224);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleRequiredInterfaceDefinition2236); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRequiredInterfaceDefinitionAccess().getAsKeyword_4());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1162:1: ( (lv_name_5_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1163:1: (lv_name_5_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1163:1: (lv_name_5_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1164:3: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequiredInterfaceDefinition2253); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1180:2: ( ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1180:3: ( (lv_collection_6_0= '[' ) ) ( (lv_collectionsize_7_0= RULE_INT ) )? otherlv_8= ']'
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1180:3: ( (lv_collection_6_0= '[' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1181:1: (lv_collection_6_0= '[' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1181:1: (lv_collection_6_0= '[' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1182:3: lv_collection_6_0= '['
                    {
                    lv_collection_6_0=(Token)match(input,28,FOLLOW_28_in_ruleRequiredInterfaceDefinition2277); if (state.failed) return current;
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1195:2: ( (lv_collectionsize_7_0= RULE_INT ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_INT) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1196:1: (lv_collectionsize_7_0= RULE_INT )
                            {
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1196:1: (lv_collectionsize_7_0= RULE_INT )
                            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1197:3: lv_collectionsize_7_0= RULE_INT
                            {
                            lv_collectionsize_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleRequiredInterfaceDefinition2307); if (state.failed) return current;
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

                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleRequiredInterfaceDefinition2325); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getRequiredInterfaceDefinitionAccess().getRightSquareBracketKeyword_6_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleRequiredInterfaceDefinition2339); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1231:1: entryRuleSubComponentDefinition returns [EObject current=null] : iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF ;
    public final EObject entryRuleSubComponentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1232:2: (iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1233:2: iv_ruleSubComponentDefinition= ruleSubComponentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2377);
            iv_ruleSubComponentDefinition=ruleSubComponentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentDefinition2387); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1240:1: ruleSubComponentDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_body_15_0= ruleSubComponentBody ) )? otherlv_16= ';' ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1243:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_body_15_0= ruleSubComponentBody ) )? otherlv_16= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1244:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_body_15_0= ruleSubComponentBody ) )? otherlv_16= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1244:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_body_15_0= ruleSubComponentBody ) )? otherlv_16= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1244:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'contains' ( ( ruleQualifiedName ) )? (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )? (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )? otherlv_13= 'as' ( (lv_name_14_0= RULE_ID ) ) ( (lv_body_15_0= ruleSubComponentBody ) )? otherlv_16= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1244:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==52) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1245:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1245:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1246:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition2433);
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

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleSubComponentDefinition2446); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubComponentDefinitionAccess().getContainsKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1266:1: ( ( ruleQualifiedName ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1267:1: ( ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1267:1: ( ruleQualifiedName )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1268:3: ruleQualifiedName
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
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSubComponentDefinition2473);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1284:3: (otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==17) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1284:5: otherlv_3= '<' ( (lv_templatesList_4_0= ruleTemplateDefinition ) ) (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSubComponentDefinition2487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSubComponentDefinitionAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1288:1: ( (lv_templatesList_4_0= ruleTemplateDefinition ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1289:1: (lv_templatesList_4_0= ruleTemplateDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1289:1: (lv_templatesList_4_0= ruleTemplateDefinition )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1290:3: lv_templatesList_4_0= ruleTemplateDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleSubComponentDefinition2508);
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1306:2: (otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==18) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1306:4: otherlv_5= ',' ( (lv_templatesList_6_0= ruleTemplateDefinition ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleSubComponentDefinition2521); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getSubComponentDefinitionAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1310:1: ( (lv_templatesList_6_0= ruleTemplateDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1311:1: (lv_templatesList_6_0= ruleTemplateDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1311:1: (lv_templatesList_6_0= ruleTemplateDefinition )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1312:3: lv_templatesList_6_0= ruleTemplateDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getTemplatesListTemplateDefinitionParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTemplateDefinition_in_ruleSubComponentDefinition2542);
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
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleSubComponentDefinition2556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSubComponentDefinitionAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1332:3: (otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==33) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1332:5: otherlv_8= '(' ( (lv_argumentsList_9_0= ruleArgumentDefinition ) ) (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )* otherlv_12= ')'
                    {
                    otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleSubComponentDefinition2571); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSubComponentDefinitionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1336:1: ( (lv_argumentsList_9_0= ruleArgumentDefinition ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1337:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1337:1: (lv_argumentsList_9_0= ruleArgumentDefinition )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1338:3: lv_argumentsList_9_0= ruleArgumentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2592);
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1354:2: (otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==18) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1354:4: otherlv_10= ',' ( (lv_argumentsList_11_0= ruleArgumentDefinition ) )
                    	    {
                    	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleSubComponentDefinition2605); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_10, grammarAccess.getSubComponentDefinitionAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1358:1: ( (lv_argumentsList_11_0= ruleArgumentDefinition ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1359:1: (lv_argumentsList_11_0= ruleArgumentDefinition )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1359:1: (lv_argumentsList_11_0= ruleArgumentDefinition )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1360:3: lv_argumentsList_11_0= ruleArgumentDefinition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getArgumentsListArgumentDefinitionParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2626);
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
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,34,FOLLOW_34_in_ruleSubComponentDefinition2640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getSubComponentDefinitionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            otherlv_13=(Token)match(input,27,FOLLOW_27_in_ruleSubComponentDefinition2654); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getSubComponentDefinitionAccess().getAsKeyword_5());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1384:1: ( (lv_name_14_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1385:1: (lv_name_14_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1385:1: (lv_name_14_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1386:3: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSubComponentDefinition2671); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1402:2: ( (lv_body_15_0= ruleSubComponentBody ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==16||LA39_0==24) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1403:1: (lv_body_15_0= ruleSubComponentBody )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1403:1: (lv_body_15_0= ruleSubComponentBody )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1404:3: lv_body_15_0= ruleSubComponentBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubComponentDefinitionAccess().getBodySubComponentBodyParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSubComponentBody_in_ruleSubComponentDefinition2697);
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

            otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleSubComponentDefinition2710); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1432:1: entryRuleSubComponentBody returns [EObject current=null] : iv_ruleSubComponentBody= ruleSubComponentBody EOF ;
    public final EObject entryRuleSubComponentBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1433:2: (iv_ruleSubComponentBody= ruleSubComponentBody EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1434:2: iv_ruleSubComponentBody= ruleSubComponentBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentBodyRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentBody_in_entryRuleSubComponentBody2746);
            iv_ruleSubComponentBody=ruleSubComponentBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentBody2756); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1441:1: ruleSubComponentBody returns [EObject current=null] : (this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody | this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody ) ;
    public final EObject ruleSubComponentBody() throws RecognitionException {
        EObject current = null;

        EObject this_SubComponentCompositeBody_0 = null;

        EObject this_SubComponentPrimitiveBody_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1444:28: ( (this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody | this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1445:1: (this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody | this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1445:1: (this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody | this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==16) ) {
                alt40=1;
            }
            else if ( (LA40_0==24) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1446:2: this_SubComponentCompositeBody_0= ruleSubComponentCompositeBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubComponentBodyAccess().getSubComponentCompositeBodyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentCompositeBody_in_ruleSubComponentBody2806);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1459:2: this_SubComponentPrimitiveBody_1= ruleSubComponentPrimitiveBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSubComponentBodyAccess().getSubComponentPrimitiveBodyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentPrimitiveBody_in_ruleSubComponentBody2836);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1478:1: entryRuleSubComponentCompositeBody returns [EObject current=null] : iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF ;
    public final EObject entryRuleSubComponentCompositeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentCompositeBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1479:2: (iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1480:2: iv_ruleSubComponentCompositeBody= ruleSubComponentCompositeBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentCompositeBodyRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentCompositeBody_in_entryRuleSubComponentCompositeBody2871);
            iv_ruleSubComponentCompositeBody=ruleSubComponentCompositeBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentCompositeBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentCompositeBody2881); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1487:1: ruleSubComponentCompositeBody returns [EObject current=null] : ( ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}' ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1490:28: ( ( ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1491:1: ( ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1491:1: ( ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1491:2: ( (lv_anonymous_0_0= 'composite' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )* otherlv_3= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1491:2: ( (lv_anonymous_0_0= 'composite' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1492:1: (lv_anonymous_0_0= 'composite' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1492:1: (lv_anonymous_0_0= 'composite' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1493:3: lv_anonymous_0_0= 'composite'
            {
            lv_anonymous_0_0=(Token)match(input,16,FOLLOW_16_in_ruleSubComponentCompositeBody2924); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSubComponentCompositeBody2949); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubComponentCompositeBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1510:1: ( ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==26||LA42_0==30||LA42_0==32||LA42_0==35||LA42_0==52) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1511:1: ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1511:1: ( (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1512:1: (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1512:1: (lv_elements_2_1= ruleSubComponentDefinition | lv_elements_2_2= ruleProvidedInterfaceDefinition | lv_elements_2_3= ruleRequiredInterfaceDefinition | lv_elements_2_4= ruleBindingDefinition )
            	    int alt41=4;
            	    switch ( input.LA(1) ) {
            	    case 52:
            	        {
            	        int LA41_1 = input.LA(2);

            	        if ( (synpred46_InternalFractal()) ) {
            	            alt41=1;
            	        }
            	        else if ( (synpred47_InternalFractal()) ) {
            	            alt41=2;
            	        }
            	        else if ( (synpred48_InternalFractal()) ) {
            	            alt41=3;
            	        }
            	        else if ( (true) ) {
            	            alt41=4;
            	        }
            	        else {
            	            if (state.backtracking>0) {state.failed=true; return current;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 41, 1, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt41=1;
            	        }
            	        break;
            	    case 26:
            	        {
            	        alt41=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt41=3;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt41=4;
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1513:3: lv_elements_2_1= ruleSubComponentDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsSubComponentDefinitionParserRuleCall_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleSubComponentCompositeBody2972);
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1528:8: lv_elements_2_2= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_2_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleSubComponentCompositeBody2991);
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1543:8: lv_elements_2_3= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_2_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleSubComponentCompositeBody3010);
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1558:8: lv_elements_2_4= ruleBindingDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsBindingDefinitionParserRuleCall_2_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleBindingDefinition_in_ruleSubComponentCompositeBody3029);
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
            	    break loop42;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSubComponentCompositeBody3045); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1588:1: entryRuleSubComponentPrimitiveBody returns [EObject current=null] : iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF ;
    public final EObject entryRuleSubComponentPrimitiveBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubComponentPrimitiveBody = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1589:2: (iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1590:2: iv_ruleSubComponentPrimitiveBody= ruleSubComponentPrimitiveBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyRule()); 
            }
            pushFollow(FOLLOW_ruleSubComponentPrimitiveBody_in_entryRuleSubComponentPrimitiveBody3081);
            iv_ruleSubComponentPrimitiveBody=ruleSubComponentPrimitiveBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubComponentPrimitiveBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubComponentPrimitiveBody3091); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1597:1: ruleSubComponentPrimitiveBody returns [EObject current=null] : ( ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}' ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1600:28: ( ( ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1601:1: ( ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1601:1: ( ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1601:2: ( (lv_anonymous_0_0= 'primitive' ) ) otherlv_1= '{' ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )* otherlv_3= '}'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1601:2: ( (lv_anonymous_0_0= 'primitive' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1602:1: (lv_anonymous_0_0= 'primitive' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1602:1: (lv_anonymous_0_0= 'primitive' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1603:3: lv_anonymous_0_0= 'primitive'
            {
            lv_anonymous_0_0=(Token)match(input,24,FOLLOW_24_in_ruleSubComponentPrimitiveBody3134); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSubComponentPrimitiveBody3159); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubComponentPrimitiveBodyAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1620:1: ( ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==26||LA44_0==30||(LA44_0>=48 && LA44_0<=50)||LA44_0==52) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1621:1: ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1621:1: ( (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1622:1: (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1622:1: (lv_elements_2_1= ruleProvidedInterfaceDefinition | lv_elements_2_2= ruleRequiredInterfaceDefinition | lv_elements_2_3= ruleImplementationDefinition | lv_elements_2_4= ruleAttributeDefinition | lv_elements_2_5= ruleDataDefinition )
            	    int alt43=5;
            	    switch ( input.LA(1) ) {
            	    case 52:
            	        {
            	        int LA43_1 = input.LA(2);

            	        if ( (synpred50_InternalFractal()) ) {
            	            alt43=1;
            	        }
            	        else if ( (synpred51_InternalFractal()) ) {
            	            alt43=2;
            	        }
            	        else if ( (synpred52_InternalFractal()) ) {
            	            alt43=3;
            	        }
            	        else if ( (synpred53_InternalFractal()) ) {
            	            alt43=4;
            	        }
            	        else if ( (true) ) {
            	            alt43=5;
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
            	        {
            	        alt43=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt43=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt43=3;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt43=4;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt43=5;
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1623:3: lv_elements_2_1= ruleProvidedInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_2_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_ruleSubComponentPrimitiveBody3182);
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1638:8: lv_elements_2_2= ruleRequiredInterfaceDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_2_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_ruleSubComponentPrimitiveBody3201);
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1653:8: lv_elements_2_3= ruleImplementationDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsImplementationDefinitionParserRuleCall_2_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleImplementationDefinition_in_ruleSubComponentPrimitiveBody3220);
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1668:8: lv_elements_2_4= ruleAttributeDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsAttributeDefinitionParserRuleCall_2_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAttributeDefinition_in_ruleSubComponentPrimitiveBody3239);
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
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1683:8: lv_elements_2_5= ruleDataDefinition
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsDataDefinitionParserRuleCall_2_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDataDefinition_in_ruleSubComponentPrimitiveBody3258);
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
            	    break loop44;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleSubComponentPrimitiveBody3274); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1715:1: entryRuleCompositeElement returns [EObject current=null] : iv_ruleCompositeElement= ruleCompositeElement EOF ;
    public final EObject entryRuleCompositeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1716:2: (iv_ruleCompositeElement= ruleCompositeElement EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1717:2: iv_ruleCompositeElement= ruleCompositeElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeElementRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeElement_in_entryRuleCompositeElement3312);
            iv_ruleCompositeElement=ruleCompositeElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeElement3322); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1724:1: ruleCompositeElement returns [EObject current=null] : (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition ) ;
    public final EObject ruleCompositeElement() throws RecognitionException {
        EObject current = null;

        EObject this_HostedInterfaceDefinition_0 = null;

        EObject this_SubComponentDefinition_1 = null;

        EObject this_BindingDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1727:28: ( (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1728:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1728:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_SubComponentDefinition_1= ruleSubComponentDefinition | this_BindingDefinition_2= ruleBindingDefinition )
            int alt45=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                int LA45_1 = input.LA(2);

                if ( (synpred55_InternalFractal()) ) {
                    alt45=1;
                }
                else if ( (synpred56_InternalFractal()) ) {
                    alt45=2;
                }
                else if ( (true) ) {
                    alt45=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
            case 30:
                {
                alt45=1;
                }
                break;
            case 32:
                {
                alt45=2;
                }
                break;
            case 35:
                {
                alt45=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1729:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getHostedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeElement3372);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1742:2: this_SubComponentDefinition_1= ruleSubComponentDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getSubComponentDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubComponentDefinition_in_ruleCompositeElement3402);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1755:2: this_BindingDefinition_2= ruleBindingDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCompositeElementAccess().getBindingDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBindingDefinition_in_ruleCompositeElement3432);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1774:1: entryRulePrimitiveElement returns [EObject current=null] : iv_rulePrimitiveElement= rulePrimitiveElement EOF ;
    public final EObject entryRulePrimitiveElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1775:2: (iv_rulePrimitiveElement= rulePrimitiveElement EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1776:2: iv_rulePrimitiveElement= rulePrimitiveElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveElementRule()); 
            }
            pushFollow(FOLLOW_rulePrimitiveElement_in_entryRulePrimitiveElement3467);
            iv_rulePrimitiveElement=rulePrimitiveElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveElement3477); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1783:1: rulePrimitiveElement returns [EObject current=null] : (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition ) ;
    public final EObject rulePrimitiveElement() throws RecognitionException {
        EObject current = null;

        EObject this_HostedInterfaceDefinition_0 = null;

        EObject this_ImplementationDefinition_1 = null;

        EObject this_AttributeDefinition_2 = null;

        EObject this_DataDefinition_3 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1786:28: ( (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1787:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1787:1: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition | this_ImplementationDefinition_1= ruleImplementationDefinition | this_AttributeDefinition_2= ruleAttributeDefinition | this_DataDefinition_3= ruleDataDefinition )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                int LA46_1 = input.LA(2);

                if ( (synpred57_InternalFractal()) ) {
                    alt46=1;
                }
                else if ( (synpred58_InternalFractal()) ) {
                    alt46=2;
                }
                else if ( (synpred59_InternalFractal()) ) {
                    alt46=3;
                }
                else if ( (true) ) {
                    alt46=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 46, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
            case 30:
                {
                alt46=1;
                }
                break;
            case 49:
                {
                alt46=2;
                }
                break;
            case 48:
                {
                alt46=3;
                }
                break;
            case 50:
                {
                alt46=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1788:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getHostedInterfaceDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_rulePrimitiveElement3527);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1801:2: this_ImplementationDefinition_1= ruleImplementationDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getImplementationDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleImplementationDefinition_in_rulePrimitiveElement3557);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1814:2: this_AttributeDefinition_2= ruleAttributeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getAttributeDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAttributeDefinition_in_rulePrimitiveElement3587);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1827:2: this_DataDefinition_3= ruleDataDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimitiveElementAccess().getDataDefinitionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDataDefinition_in_rulePrimitiveElement3617);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1846:1: entryRuleBindingDefinition returns [EObject current=null] : iv_ruleBindingDefinition= ruleBindingDefinition EOF ;
    public final EObject entryRuleBindingDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindingDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1847:2: (iv_ruleBindingDefinition= ruleBindingDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1848:2: iv_ruleBindingDefinition= ruleBindingDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBindingDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition3652);
            iv_ruleBindingDefinition=ruleBindingDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBindingDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindingDefinition3662); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1855:1: ruleBindingDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1858:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1859:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1859:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1859:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'binds' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) ) otherlv_4= '.' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )? otherlv_9= 'to' ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) ) otherlv_12= '.' ( (otherlv_13= RULE_ID ) ) (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )? otherlv_17= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1859:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==52) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1860:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1860:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1861:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getBindingDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition3708);
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

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleBindingDefinition3721); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBindingDefinitionAccess().getBindsKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1881:1: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_isSrcParentThis_3_0= 'this' ) ) )
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1881:2: ( (otherlv_2= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1881:2: ( (otherlv_2= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1882:1: (otherlv_2= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1882:1: (otherlv_2= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1883:3: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                              
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_2, grammarAccess.getBindingDefinitionAccess().getSourceParentSubComponentDefinitionCrossReference_2_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1898:6: ( (lv_isSrcParentThis_3_0= 'this' ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1898:6: ( (lv_isSrcParentThis_3_0= 'this' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1899:1: (lv_isSrcParentThis_3_0= 'this' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1899:1: (lv_isSrcParentThis_3_0= 'this' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1900:3: lv_isSrcParentThis_3_0= 'this'
                    {
                    lv_isSrcParentThis_3_0=(Token)match(input,36,FOLLOW_36_in_ruleBindingDefinition3770); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleBindingDefinition3796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_3());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1917:1: ( (otherlv_5= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1918:1: (otherlv_5= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1918:1: (otherlv_5= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1919:3: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
              	        }
                      
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3820); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_5, grammarAccess.getBindingDefinitionAccess().getSourceInterfaceHostedInterfaceDefinitionCrossReference_4_0()); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1933:2: (otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==28) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1933:4: otherlv_6= '[' ( (lv_sourceIndex_7_0= RULE_INT ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleBindingDefinition3833); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_5_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1937:1: ( (lv_sourceIndex_7_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1938:1: (lv_sourceIndex_7_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1938:1: (lv_sourceIndex_7_0= RULE_INT )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1939:3: lv_sourceIndex_7_0= RULE_INT
                    {
                    lv_sourceIndex_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition3850); if (state.failed) return current;
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

                    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleBindingDefinition3867); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_5_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,38,FOLLOW_38_in_ruleBindingDefinition3881); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getBindingDefinitionAccess().getToKeyword_6());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1963:1: ( ( (otherlv_10= RULE_ID ) ) | ( (lv_isTgtParentThis_11_0= 'this' ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            else if ( (LA50_0==36) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1963:2: ( (otherlv_10= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1963:2: ( (otherlv_10= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1964:1: (otherlv_10= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1964:1: (otherlv_10= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1965:3: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
                      	        }
                              
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_10, grammarAccess.getBindingDefinitionAccess().getTargetParentSubComponentDefinitionCrossReference_7_0_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1980:6: ( (lv_isTgtParentThis_11_0= 'this' ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1980:6: ( (lv_isTgtParentThis_11_0= 'this' ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1981:1: (lv_isTgtParentThis_11_0= 'this' )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1981:1: (lv_isTgtParentThis_11_0= 'this' )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1982:3: lv_isTgtParentThis_11_0= 'this'
                    {
                    lv_isTgtParentThis_11_0=(Token)match(input,36,FOLLOW_36_in_ruleBindingDefinition3930); if (state.failed) return current;
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

            otherlv_12=(Token)match(input,37,FOLLOW_37_in_ruleBindingDefinition3956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getBindingDefinitionAccess().getFullStopKeyword_8());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1999:1: ( (otherlv_13= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2000:1: (otherlv_13= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2000:1: (otherlv_13= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2001:3: otherlv_13= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getBindingDefinitionRule());
              	        }
                      
            }
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindingDefinition3980); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_13, grammarAccess.getBindingDefinitionAccess().getTargetInterfaceHostedInterfaceDefinitionCrossReference_9_0()); 
              	
            }

            }


            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2015:2: (otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==28) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2015:4: otherlv_14= '[' ( (lv_targetIndex_15_0= RULE_INT ) ) otherlv_16= ']'
                    {
                    otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleBindingDefinition3993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getBindingDefinitionAccess().getLeftSquareBracketKeyword_10_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2019:1: ( (lv_targetIndex_15_0= RULE_INT ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2020:1: (lv_targetIndex_15_0= RULE_INT )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2020:1: (lv_targetIndex_15_0= RULE_INT )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2021:3: lv_targetIndex_15_0= RULE_INT
                    {
                    lv_targetIndex_15_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleBindingDefinition4010); if (state.failed) return current;
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

                    otherlv_16=(Token)match(input,29,FOLLOW_29_in_ruleBindingDefinition4027); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getBindingDefinitionAccess().getRightSquareBracketKeyword_10_2());
                          
                    }

                    }
                    break;

            }

            otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleBindingDefinition4041); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2053:1: entryRuleFormalArgument returns [EObject current=null] : iv_ruleFormalArgument= ruleFormalArgument EOF ;
    public final EObject entryRuleFormalArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgument = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2054:2: (iv_ruleFormalArgument= ruleFormalArgument EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2055:2: iv_ruleFormalArgument= ruleFormalArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument4077);
            iv_ruleFormalArgument=ruleFormalArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgument4087); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2062:1: ruleFormalArgument returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFormalArgument() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2065:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2066:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2066:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2067:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2067:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2068:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFormalArgument4128); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2092:1: entryRuleFormalArgumentsList returns [EObject current=null] : iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF ;
    public final EObject entryRuleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormalArgumentsList = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2093:2: (iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2094:2: iv_ruleFormalArgumentsList= ruleFormalArgumentsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormalArgumentsListRule()); 
            }
            pushFollow(FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList4168);
            iv_ruleFormalArgumentsList=ruleFormalArgumentsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormalArgumentsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormalArgumentsList4178); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2101:1: ruleFormalArgumentsList returns [EObject current=null] : (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleFormalArgumentsList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalArguments_1_0 = null;

        EObject lv_formalArguments_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2104:28: ( (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2105:1: (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2105:1: (otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2105:3: otherlv_0= '(' ( (lv_formalArguments_1_0= ruleFormalArgument ) ) (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleFormalArgumentsList4215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFormalArgumentsListAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2109:1: ( (lv_formalArguments_1_0= ruleFormalArgument ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2110:1: (lv_formalArguments_1_0= ruleFormalArgument )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2110:1: (lv_formalArguments_1_0= ruleFormalArgument )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2111:3: lv_formalArguments_1_0= ruleFormalArgument
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4236);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2127:2: (otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==18) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2127:4: otherlv_2= ',' ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleFormalArgumentsList4249); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getFormalArgumentsListAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2131:1: ( (lv_formalArguments_3_0= ruleFormalArgument ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2132:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2132:1: (lv_formalArguments_3_0= ruleFormalArgument )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2133:3: lv_formalArguments_3_0= ruleFormalArgument
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFormalArgumentsListAccess().getFormalArgumentsFormalArgumentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4270);
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
            	    break loop52;
                }
            } while (true);

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleFormalArgumentsList4284); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2161:1: entryRuleTemplateSpecifier returns [EObject current=null] : iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF ;
    public final EObject entryRuleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateSpecifier = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2162:2: (iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2163:2: iv_ruleTemplateSpecifier= ruleTemplateSpecifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateSpecifierRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier4320);
            iv_ruleTemplateSpecifier=ruleTemplateSpecifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateSpecifier; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateSpecifier4330); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2170:1: ruleTemplateSpecifier returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTemplateSpecifier() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2173:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2174:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2174:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2174:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= 'conformsto' ( ( ruleQualifiedName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2174:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2175:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2175:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2176:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplateSpecifier4372); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleTemplateSpecifier4389); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTemplateSpecifierAccess().getConformstoKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2196:1: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2197:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2197:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2198:3: ruleQualifiedName
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateSpecifier4416);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2222:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2223:2: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2224:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType4453);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType4464); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2231:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2234:28: ( (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2235:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2235:1: (kw= 'STRUCT' | kw= 'UNION' | kw= 'ENUM' | this_ID_3= RULE_ID )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt53=1;
                }
                break;
            case 41:
                {
                alt53=2;
                }
                break;
            case 42:
                {
                alt53=3;
                }
                break;
            case RULE_ID:
                {
                alt53=4;
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2236:2: kw= 'STRUCT'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleAttributeType4502); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getSTRUCTKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2243:2: kw= 'UNION'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleAttributeType4521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getUNIONKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2250:2: kw= 'ENUM'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleAttributeType4540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getENUMKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2256:10: this_ID_3= RULE_ID
                    {
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeType4561); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2271:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2272:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2273:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedINTRule()); 
            }
            pushFollow(FOLLOW_rulesignedINT_in_entryRulesignedINT4607);
            iv_rulesignedINT=rulesignedINT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulesignedINT4618); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2280:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2283:28: ( ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2284:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2284:1: ( (kw= '+' | kw= '-' )? this_INT_2= RULE_INT )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2284:2: (kw= '+' | kw= '-' )? this_INT_2= RULE_INT
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2284:2: (kw= '+' | kw= '-' )?
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==43) ) {
                alt54=1;
            }
            else if ( (LA54_0==44) ) {
                alt54=2;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2285:2: kw= '+'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_rulesignedINT4657); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedINTAccess().getPlusSignKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2292:2: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_rulesignedINT4676); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSignedINTAccess().getHyphenMinusKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulesignedINT4693); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2312:1: entryRuleHexadecimalType returns [String current=null] : iv_ruleHexadecimalType= ruleHexadecimalType EOF ;
    public final String entryRuleHexadecimalType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHexadecimalType = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2313:2: (iv_ruleHexadecimalType= ruleHexadecimalType EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2314:2: iv_ruleHexadecimalType= ruleHexadecimalType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHexadecimalTypeRule()); 
            }
            pushFollow(FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType4739);
            iv_ruleHexadecimalType=ruleHexadecimalType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHexadecimalType.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHexadecimalType4750); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2321:1: ruleHexadecimalType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '0x' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleHexadecimalType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2324:28: ( (kw= '0x' this_INT_1= RULE_INT ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2325:1: (kw= '0x' this_INT_1= RULE_INT )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2325:1: (kw= '0x' this_INT_1= RULE_INT )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2326:2: kw= '0x' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,45,FOLLOW_45_in_ruleHexadecimalType4788); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getHexadecimalTypeAccess().getXKeyword_0()); 
                  
            }
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHexadecimalType4803); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2346:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2347:2: (iv_ruleValue= ruleValue EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2348:2: iv_ruleValue= ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue4849);
            iv_ruleValue=ruleValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue4860); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2355:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_3=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_signedINT_1 = null;

        AntlrDatatypeRuleToken this_HexadecimalType_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2358:28: ( (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2359:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2359:1: (this_ID_0= RULE_ID | this_signedINT_1= rulesignedINT | this_HexadecimalType_2= ruleHexadecimalType | this_STRING_3= RULE_STRING | kw= 'null' )
            int alt55=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt55=1;
                }
                break;
            case RULE_INT:
            case 43:
            case 44:
                {
                alt55=2;
                }
                break;
            case 45:
                {
                alt55=3;
                }
                break;
            case RULE_STRING:
                {
                alt55=4;
                }
                break;
            case 46:
                {
                alt55=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2359:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValue4900); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2368:5: this_signedINT_1= rulesignedINT
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getSignedINTParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulesignedINT_in_ruleValue4933);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2380:5: this_HexadecimalType_2= ruleHexadecimalType
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueAccess().getHexadecimalTypeParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHexadecimalType_in_ruleValue4966);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2391:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue4992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_3, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2400:2: kw= 'null'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleValue5016); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2413:1: entryRuleTemplateDefinition returns [EObject current=null] : iv_ruleTemplateDefinition= ruleTemplateDefinition EOF ;
    public final EObject entryRuleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplateDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2414:2: (iv_ruleTemplateDefinition= ruleTemplateDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2415:2: iv_ruleTemplateDefinition= ruleTemplateDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition5056);
            iv_ruleTemplateDefinition=ruleTemplateDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplateDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplateDefinition5066); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2422:1: ruleTemplateDefinition returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTemplateDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2425:28: ( ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ruleQualifiedName ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2426:1: ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ruleQualifiedName ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2426:1: ( ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ruleQualifiedName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2426:2: ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )? ( ( ruleQualifiedName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2426:2: ( ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '=' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==39) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2426:3: ( (lv_name_0_0= ruleTemplateSpecifier ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2426:3: ( (lv_name_0_0= ruleTemplateSpecifier ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2427:1: (lv_name_0_0= ruleTemplateSpecifier )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2427:1: (lv_name_0_0= ruleTemplateSpecifier )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2428:3: lv_name_0_0= ruleTemplateSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateDefinitionAccess().getNameTemplateSpecifierParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTemplateSpecifier_in_ruleTemplateDefinition5113);
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

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleTemplateDefinition5125); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getTemplateDefinitionAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2448:3: ( ( ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2449:1: ( ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2449:1: ( ruleQualifiedName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2450:3: ruleQualifiedName
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
               
              	        newCompositeNode(grammarAccess.getTemplateDefinitionAccess().getTypeReferenceArchitectureDefinitionCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTemplateDefinition5154);
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
    // $ANTLR end "ruleTemplateDefinition"


    // $ANTLR start "entryRuleArgumentDefinition"
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2474:1: entryRuleArgumentDefinition returns [EObject current=null] : iv_ruleArgumentDefinition= ruleArgumentDefinition EOF ;
    public final EObject entryRuleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2475:2: (iv_ruleArgumentDefinition= ruleArgumentDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2476:2: iv_ruleArgumentDefinition= ruleArgumentDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5190);
            iv_ruleArgumentDefinition=ruleArgumentDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgumentDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentDefinition5200); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2483:1: ruleArgumentDefinition returns [EObject current=null] : ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) ) ;
    public final EObject ruleArgumentDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_argumentName_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_argumentValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2486:28: ( ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2487:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2487:1: ( ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2487:2: ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_argumentValue_2_0= ruleValue ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2487:2: ( ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==47) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2487:3: ( (lv_argumentName_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2487:3: ( (lv_argumentName_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2488:1: (lv_argumentName_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2488:1: (lv_argumentName_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2489:3: lv_argumentName_0_0= RULE_ID
                    {
                    lv_argumentName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArgumentDefinition5243); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleArgumentDefinition5260); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArgumentDefinitionAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2509:3: ( (lv_argumentValue_2_0= ruleValue ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2510:1: (lv_argumentValue_2_0= ruleValue )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2510:1: (lv_argumentValue_2_0= ruleValue )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2511:3: lv_argumentValue_2_0= ruleValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentDefinitionAccess().getArgumentValueValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValue_in_ruleArgumentDefinition5283);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2535:1: entryRuleAttributeDefinition returns [EObject current=null] : iv_ruleAttributeDefinition= ruleAttributeDefinition EOF ;
    public final EObject entryRuleAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2536:2: (iv_ruleAttributeDefinition= ruleAttributeDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2537:2: iv_ruleAttributeDefinition= ruleAttributeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5319);
            iv_ruleAttributeDefinition=ruleAttributeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeDefinition5329); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2544:1: ruleAttributeDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= ';' ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2547:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2548:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2548:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2548:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'attribute' ( (lv_type_2_0= ruleAttributeType ) )? ( (lv_attributeName_3_0= RULE_ID ) ) (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )? otherlv_6= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2548:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==52) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2549:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2549:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2550:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition5375);
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

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleAttributeDefinition5388); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAttributeDefinitionAccess().getAttributeKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2570:1: ( (lv_type_2_0= ruleAttributeType ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=40 && LA59_0<=42)) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_ID) ) {
                int LA59_2 = input.LA(2);

                if ( (LA59_2==RULE_ID) ) {
                    alt59=1;
                }
            }
            switch (alt59) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2571:1: (lv_type_2_0= ruleAttributeType )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2571:1: (lv_type_2_0= ruleAttributeType )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2572:3: lv_type_2_0= ruleAttributeType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getTypeAttributeTypeParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5409);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2588:3: ( (lv_attributeName_3_0= RULE_ID ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2589:1: (lv_attributeName_3_0= RULE_ID )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2589:1: (lv_attributeName_3_0= RULE_ID )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2590:3: lv_attributeName_3_0= RULE_ID
            {
            lv_attributeName_3_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttributeDefinition5427); if (state.failed) return current;
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2606:2: (otherlv_4= '=' ( (lv_value_5_0= ruleValue ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==47) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2606:4: otherlv_4= '=' ( (lv_value_5_0= ruleValue ) )
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleAttributeDefinition5445); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2610:1: ( (lv_value_5_0= ruleValue ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2611:1: (lv_value_5_0= ruleValue )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2611:1: (lv_value_5_0= ruleValue )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2612:3: lv_value_5_0= ruleValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeDefinitionAccess().getValueValueParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_ruleAttributeDefinition5466);
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

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleAttributeDefinition5480); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2640:1: entryRuleImplementationDefinition returns [EObject current=null] : iv_ruleImplementationDefinition= ruleImplementationDefinition EOF ;
    public final EObject entryRuleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2641:2: (iv_ruleImplementationDefinition= ruleImplementationDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2642:2: iv_ruleImplementationDefinition= ruleImplementationDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplementationDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5516);
            iv_ruleImplementationDefinition=ruleImplementationDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplementationDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplementationDefinition5526); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2649:1: ruleImplementationDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleImplementationDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_fileC_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2652:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2653:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2653:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2653:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'source' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2653:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==52) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2654:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2654:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2655:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition5572);
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

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleImplementationDefinition5585); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getImplementationDefinitionAccess().getSourceKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2675:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ID||LA62_0==RULE_SL||LA62_0==37||LA62_0==51) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_CODE_C) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2675:2: ( (lv_fileC_2_0= ruleFileC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2675:2: ( (lv_fileC_2_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2676:1: (lv_fileC_2_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2676:1: (lv_fileC_2_0= ruleFileC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2677:3: lv_fileC_2_0= ruleFileC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getFileCFileCParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFileC_in_ruleImplementationDefinition5607);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2694:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2694:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2695:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2695:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2696:3: lv_inlineCcode_3_0= ruleInlineCodeC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplementationDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5634);
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

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleImplementationDefinition5647); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2724:1: entryRuleDataDefinition returns [EObject current=null] : iv_ruleDataDefinition= ruleDataDefinition EOF ;
    public final EObject entryRuleDataDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDefinition = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2725:2: (iv_ruleDataDefinition= ruleDataDefinition EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2726:2: iv_ruleDataDefinition= ruleDataDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5683);
            iv_ruleDataDefinition=ruleDataDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataDefinition5693); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2733:1: ruleDataDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) ;
    public final EObject ruleDataDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_fileC_2_0 = null;

        EObject lv_inlineCcode_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2736:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2737:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2737:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2737:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'data' ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) ) otherlv_4= ';'
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2737:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==52) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2738:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2738:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2739:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationsList_in_ruleDataDefinition5739);
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

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleDataDefinition5752); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDataDefinitionAccess().getDataKeyword_1());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2759:1: ( ( (lv_fileC_2_0= ruleFileC ) ) | ( (lv_inlineCcode_3_0= ruleInlineCodeC ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID||LA64_0==RULE_SL||LA64_0==37||LA64_0==51) ) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_CODE_C) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2759:2: ( (lv_fileC_2_0= ruleFileC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2759:2: ( (lv_fileC_2_0= ruleFileC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2760:1: (lv_fileC_2_0= ruleFileC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2760:1: (lv_fileC_2_0= ruleFileC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2761:3: lv_fileC_2_0= ruleFileC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getFileCFileCParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFileC_in_ruleDataDefinition5774);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2778:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2778:6: ( (lv_inlineCcode_3_0= ruleInlineCodeC ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2779:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2779:1: (lv_inlineCcode_3_0= ruleInlineCodeC )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2780:3: lv_inlineCcode_3_0= ruleInlineCodeC
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDataDefinitionAccess().getInlineCcodeInlineCodeCParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5801);
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

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleDataDefinition5814); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2808:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2809:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2810:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5851);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName5862); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2817:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2820:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2821:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2821:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2821:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5902); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2828:1: (kw= '.' this_ID_2= RULE_ID )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==37) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2829:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,37,FOLLOW_37_in_ruleQualifiedName5921); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName5936); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop65;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2849:1: entryRuleFileC returns [EObject current=null] : iv_ruleFileC= ruleFileC EOF ;
    public final EObject entryRuleFileC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileC = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2850:2: (iv_ruleFileC= ruleFileC EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2851:2: iv_ruleFileC= ruleFileC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileCRule()); 
            }
            pushFollow(FOLLOW_ruleFileC_in_entryRuleFileC5983);
            iv_ruleFileC=ruleFileC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileC5993); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2858:1: ruleFileC returns [EObject current=null] : ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) ) ;
    public final EObject ruleFileC() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_directory_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2861:28: ( ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2862:1: ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2862:1: ( ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2862:2: ( (lv_directory_0_0= rulePath ) )? ( (lv_name_1_0= ruleFileName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2862:2: ( (lv_directory_0_0= rulePath ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==RULE_SL) ) {
                    alt66=1;
                }
            }
            else if ( (LA66_0==RULE_SL||LA66_0==37||LA66_0==51) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2863:1: (lv_directory_0_0= rulePath )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2863:1: (lv_directory_0_0= rulePath )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2864:3: lv_directory_0_0= rulePath
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFileCAccess().getDirectoryPathParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePath_in_ruleFileC6039);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2880:3: ( (lv_name_1_0= ruleFileName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2881:1: (lv_name_1_0= ruleFileName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2881:1: (lv_name_1_0= ruleFileName )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2882:3: lv_name_1_0= ruleFileName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFileCAccess().getNameFileNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFileName_in_ruleFileC6061);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2906:1: entryRuleInlineCodeC returns [EObject current=null] : iv_ruleInlineCodeC= ruleInlineCodeC EOF ;
    public final EObject entryRuleInlineCodeC() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInlineCodeC = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2907:2: (iv_ruleInlineCodeC= ruleInlineCodeC EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2908:2: iv_ruleInlineCodeC= ruleInlineCodeC EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInlineCodeCRule()); 
            }
            pushFollow(FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC6097);
            iv_ruleInlineCodeC=ruleInlineCodeC();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInlineCodeC; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInlineCodeC6107); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2915:1: ruleInlineCodeC returns [EObject current=null] : ( (lv_codeC_0_0= RULE_CODE_C ) ) ;
    public final EObject ruleInlineCodeC() throws RecognitionException {
        EObject current = null;

        Token lv_codeC_0_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2918:28: ( ( (lv_codeC_0_0= RULE_CODE_C ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2919:1: ( (lv_codeC_0_0= RULE_CODE_C ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2919:1: ( (lv_codeC_0_0= RULE_CODE_C ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2920:1: (lv_codeC_0_0= RULE_CODE_C )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2920:1: (lv_codeC_0_0= RULE_CODE_C )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2921:3: lv_codeC_0_0= RULE_CODE_C
            {
            lv_codeC_0_0=(Token)match(input,RULE_CODE_C,FOLLOW_RULE_CODE_C_in_ruleInlineCodeC6148); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2945:1: entryRulePath returns [String current=null] : iv_rulePath= rulePath EOF ;
    public final String entryRulePath() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePath = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2946:2: (iv_rulePath= rulePath EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2947:2: iv_rulePath= rulePath EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPathRule()); 
            }
            pushFollow(FOLLOW_rulePath_in_entryRulePath6189);
            iv_rulePath=rulePath();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePath.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePath6200); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2954:1: rulePath returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL ) ;
    public final AntlrDatatypeRuleToken rulePath() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_SL_3=null;
        Token this_ID_4=null;
        Token this_SL_7=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2957:28: ( ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2958:1: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2958:1: ( (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2958:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )? (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )* this_SL_7= RULE_SL
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2958:2: (this_ID_0= RULE_ID | kw= '.' | kw= '..' )?
            int alt67=4;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt67=1;
                    }
                    break;
                case 37:
                    {
                    alt67=2;
                    }
                    break;
                case 51:
                    {
                    alt67=3;
                    }
                    break;
            }

            switch (alt67) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2958:7: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath6241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getPathAccess().getIDTerminalRuleCall_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2967:2: kw= '.'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_rulePath6265); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPathAccess().getFullStopKeyword_0_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2974:2: kw= '..'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_rulePath6284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPathAccess().getFullStopFullStopKeyword_0_2()); 
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2979:3: (this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==RULE_SL) ) {
                    int LA71_1 = input.LA(2);

                    if ( (LA71_1==RULE_ID) ) {
                        int LA71_2 = input.LA(3);

                        if ( (LA71_2==RULE_ID||LA71_2==RULE_SL||LA71_2==44) ) {
                            alt71=1;
                        }


                    }
                    else if ( (LA71_1==RULE_SL||LA71_1==51) ) {
                        alt71=1;
                    }


                }


                switch (alt71) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2979:8: this_SL_3= RULE_SL ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' )
            	    {
            	    this_SL_3=(Token)match(input,RULE_SL,FOLLOW_RULE_SL_in_rulePath6302); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_SL_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_SL_3, grammarAccess.getPathAccess().getSLTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2986:1: ( (this_ID_4= RULE_ID (kw= '-' )? )* | kw= '..' )
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==RULE_ID||LA70_0==RULE_SL) ) {
            	        alt70=1;
            	    }
            	    else if ( (LA70_0==51) ) {
            	        alt70=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 70, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2986:2: (this_ID_4= RULE_ID (kw= '-' )? )*
            	            {
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2986:2: (this_ID_4= RULE_ID (kw= '-' )? )*
            	            loop69:
            	            do {
            	                int alt69=2;
            	                int LA69_0 = input.LA(1);

            	                if ( (LA69_0==RULE_ID) ) {
            	                    alt69=1;
            	                }


            	                switch (alt69) {
            	            	case 1 :
            	            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2986:7: this_ID_4= RULE_ID (kw= '-' )?
            	            	    {
            	            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePath6324); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      		current.merge(this_ID_4);
            	            	          
            	            	    }
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	          newLeafNode(this_ID_4, grammarAccess.getPathAccess().getIDTerminalRuleCall_1_1_0_0()); 
            	            	          
            	            	    }
            	            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2993:1: (kw= '-' )?
            	            	    int alt68=2;
            	            	    int LA68_0 = input.LA(1);

            	            	    if ( (LA68_0==44) ) {
            	            	        alt68=1;
            	            	    }
            	            	    switch (alt68) {
            	            	        case 1 :
            	            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:2994:2: kw= '-'
            	            	            {
            	            	            kw=(Token)match(input,44,FOLLOW_44_in_rulePath6343); if (state.failed) return current;
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
            	            	    break loop69;
            	                }
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3001:2: kw= '..'
            	            {
            	            kw=(Token)match(input,51,FOLLOW_51_in_rulePath6366); if (state.failed) return current;
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
            	    break loop71;
                }
            } while (true);

            this_SL_7=(Token)match(input,RULE_SL,FOLLOW_RULE_SL_in_rulePath6384); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3021:1: entryRuleFileName returns [String current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final String entryRuleFileName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFileName = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3022:2: (iv_ruleFileName= ruleFileName EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3023:2: iv_ruleFileName= ruleFileName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileNameRule()); 
            }
            pushFollow(FOLLOW_ruleFileName_in_entryRuleFileName6430);
            iv_ruleFileName=ruleFileName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileName6441); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3030:1: ruleFileName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken ruleFileName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3033:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3034:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3034:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3034:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )?
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName6481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getFileNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3041:1: (kw= '.' this_ID_2= RULE_ID )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==37) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3042:2: kw= '.' this_ID_2= RULE_ID
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleFileName6500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFileNameAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFileName6515); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3062:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3063:2: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3064:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsListRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList6562);
            iv_ruleAnnotationsList=ruleAnnotationsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationsList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationsList6572); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3071:1: ruleAnnotationsList returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3074:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3075:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3075:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3075:2: ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3075:2: ( (lv_annotations_0_0= ruleAnnotation ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3076:1: (lv_annotations_0_0= ruleAnnotation )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3076:1: (lv_annotations_0_0= ruleAnnotation )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3077:3: lv_annotations_0_0= ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList6618);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3093:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==52) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3094:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3094:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3095:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnnotation_in_ruleAnnotationsList6639);
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
            	    break loop73;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3119:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3120:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3121:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation6676);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation6686); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3128:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? ) ;
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
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3131:28: ( (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3132:1: (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3132:1: (otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )? )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3132:3: otherlv_0= '@' ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) ) (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleAnnotation6723); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3136:1: ( ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3137:1: ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3137:1: ( (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3138:1: (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3138:1: (lv_name_1_1= 'Override' | lv_name_1_2= 'Singleton' | lv_name_1_3= 'LDFlags' | lv_name_1_4= 'CFlags' | lv_name_1_5= ruleQualifiedName )
            int alt74=5;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt74=1;
                }
                break;
            case 54:
                {
                alt74=2;
                }
                break;
            case 55:
                {
                alt74=3;
                }
                break;
            case 56:
                {
                alt74=4;
                }
                break;
            case RULE_ID:
                {
                alt74=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3139:3: lv_name_1_1= 'Override'
                    {
                    lv_name_1_1=(Token)match(input,53,FOLLOW_53_in_ruleAnnotation6743); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3151:8: lv_name_1_2= 'Singleton'
                    {
                    lv_name_1_2=(Token)match(input,54,FOLLOW_54_in_ruleAnnotation6772); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3163:8: lv_name_1_3= 'LDFlags'
                    {
                    lv_name_1_3=(Token)match(input,55,FOLLOW_55_in_ruleAnnotation6801); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3175:8: lv_name_1_4= 'CFlags'
                    {
                    lv_name_1_4=(Token)match(input,56,FOLLOW_56_in_ruleAnnotation6830); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3187:8: lv_name_1_5= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameQualifiedNameParserRuleCall_1_0_4()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAnnotation6862);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3205:2: (otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==33) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3205:4: otherlv_2= '(' ( (lv_annotationElements_3_0= ruleAnnotationElement ) ) (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleAnnotation6878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3209:1: ( (lv_annotationElements_3_0= ruleAnnotationElement ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3210:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3210:1: (lv_annotationElements_3_0= ruleAnnotationElement )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3211:3: lv_annotationElements_3_0= ruleAnnotationElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation6899);
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

                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3227:2: (otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==18) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3227:4: otherlv_4= ',' ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleAnnotation6912); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3231:1: ( (lv_annotationElements_5_0= ruleAnnotationElement ) )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3232:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    {
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3232:1: (lv_annotationElements_5_0= ruleAnnotationElement )
                    	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3233:3: lv_annotationElements_5_0= ruleAnnotationElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationElementsAnnotationElementParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAnnotationElement_in_ruleAnnotation6933);
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
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleAnnotation6947); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3261:1: entryRuleAnnotationElement returns [EObject current=null] : iv_ruleAnnotationElement= ruleAnnotationElement EOF ;
    public final EObject entryRuleAnnotationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationElement = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3262:2: (iv_ruleAnnotationElement= ruleAnnotationElement EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3263:2: iv_ruleAnnotationElement= ruleAnnotationElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationElementRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement6985);
            iv_ruleAnnotationElement=ruleAnnotationElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotationElement6995); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3270:1: ruleAnnotationElement returns [EObject current=null] : ( ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) ) ;
    public final EObject ruleAnnotationElement() throws RecognitionException {
        EObject current = null;

        Token lv_elementName_0_0=null;
        Token otherlv_1=null;
        EObject lv_elementValue_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3273:28: ( ( ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3274:1: ( ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3274:1: ( ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3274:2: ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_elementValue_2_0= ruleElementValue ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3274:2: ( ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3274:3: ( (lv_elementName_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3274:3: ( (lv_elementName_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3275:1: (lv_elementName_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3275:1: (lv_elementName_0_0= RULE_ID )
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3276:3: lv_elementName_0_0= RULE_ID
                    {
                    lv_elementName_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAnnotationElement7038); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleAnnotationElement7055); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAnnotationElementAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3296:3: ( (lv_elementValue_2_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3297:1: (lv_elementValue_2_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3297:1: (lv_elementValue_2_0= ruleElementValue )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3298:3: lv_elementValue_2_0= ruleElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationElementAccess().getElementValueElementValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElementValue_in_ruleAnnotationElement7078);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3322:1: entryRuleElementValue returns [EObject current=null] : iv_ruleElementValue= ruleElementValue EOF ;
    public final EObject entryRuleElementValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3323:2: (iv_ruleElementValue= ruleElementValue EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3324:2: iv_ruleElementValue= ruleElementValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementValueRule()); 
            }
            pushFollow(FOLLOW_ruleElementValue_in_entryRuleElementValue7114);
            iv_ruleElementValue=ruleElementValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValue7124); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3331:1: ruleElementValue returns [EObject current=null] : (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) ;
    public final EObject ruleElementValue() throws RecognitionException {
        EObject current = null;

        EObject this_ConstantValue_0 = null;

        EObject this_Annotation_1 = null;

        EObject this_ElementValueArrayInitializer_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3334:28: ( (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3335:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3335:1: (this_ConstantValue_0= ruleConstantValue | this_Annotation_1= ruleAnnotation | this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer )
            int alt78=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
                {
                alt78=1;
                }
                break;
            case 52:
                {
                alt78=2;
                }
                break;
            case 21:
                {
                alt78=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3336:2: this_ConstantValue_0= ruleConstantValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getConstantValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstantValue_in_ruleElementValue7174);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3349:2: this_Annotation_1= ruleAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getAnnotationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnnotation_in_ruleElementValue7204);
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
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3362:2: this_ElementValueArrayInitializer_2= ruleElementValueArrayInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getElementValueAccess().getElementValueArrayInitializerParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7234);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3381:1: entryRuleElementValueArrayInitializer returns [EObject current=null] : iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF ;
    public final EObject entryRuleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementValueArrayInitializer = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3382:2: (iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3383:2: iv_ruleElementValueArrayInitializer= ruleElementValueArrayInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getElementValueArrayInitializerRule()); 
            }
            pushFollow(FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer7269);
            iv_ruleElementValueArrayInitializer=ruleElementValueArrayInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleElementValueArrayInitializer; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementValueArrayInitializer7279); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3390:1: ruleElementValueArrayInitializer returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleElementValueArrayInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3393:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3394:1: (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3394:1: (otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3394:3: otherlv_0= '{' ( (lv_values_1_0= ruleElementValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleElementValueArrayInitializer7316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getElementValueArrayInitializerAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3398:1: ( (lv_values_1_0= ruleElementValue ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3399:1: (lv_values_1_0= ruleElementValue )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3399:1: (lv_values_1_0= ruleElementValue )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3400:3: lv_values_1_0= ruleElementValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7337);
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

            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3416:2: (otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==18) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3416:4: otherlv_2= ',' ( (lv_values_3_0= ruleElementValue ) )
            	    {
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleElementValueArrayInitializer7350); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getElementValueArrayInitializerAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3420:1: ( (lv_values_3_0= ruleElementValue ) )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3421:1: (lv_values_3_0= ruleElementValue )
            	    {
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3421:1: (lv_values_3_0= ruleElementValue )
            	    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3422:3: lv_values_3_0= ruleElementValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getElementValueArrayInitializerAccess().getValuesElementValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7371);
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
            	    break loop79;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleElementValueArrayInitializer7385); if (state.failed) return current;
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3450:1: entryRuleConstantValue returns [EObject current=null] : iv_ruleConstantValue= ruleConstantValue EOF ;
    public final EObject entryRuleConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantValue = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3451:2: (iv_ruleConstantValue= ruleConstantValue EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3452:2: iv_ruleConstantValue= ruleConstantValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantValueRule()); 
            }
            pushFollow(FOLLOW_ruleConstantValue_in_entryRuleConstantValue7421);
            iv_ruleConstantValue=ruleConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantValue7431); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3459:1: ruleConstantValue returns [EObject current=null] : ( (lv_value_0_0= ruleConstantFormat ) ) ;
    public final EObject ruleConstantValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3462:28: ( ( (lv_value_0_0= ruleConstantFormat ) ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3463:1: ( (lv_value_0_0= ruleConstantFormat ) )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3463:1: ( (lv_value_0_0= ruleConstantFormat ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3464:1: (lv_value_0_0= ruleConstantFormat )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3464:1: (lv_value_0_0= ruleConstantFormat )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3465:3: lv_value_0_0= ruleConstantFormat
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantValueAccess().getValueConstantFormatParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_ruleConstantValue7476);
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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3489:1: entryRuleConstantFormat returns [String current=null] : iv_ruleConstantFormat= ruleConstantFormat EOF ;
    public final String entryRuleConstantFormat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantFormat = null;


        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3490:2: (iv_ruleConstantFormat= ruleConstantFormat EOF )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3491:2: iv_ruleConstantFormat= ruleConstantFormat EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantFormatRule()); 
            }
            pushFollow(FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7512);
            iv_ruleConstantFormat=ruleConstantFormat();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantFormat.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantFormat7523); if (state.failed) return current;

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
    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3498:1: ruleConstantFormat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleConstantFormat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3501:28: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3502:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3502:1: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_INT) ) {
                alt80=1;
            }
            else if ( (LA80_0==RULE_STRING) ) {
                alt80=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3502:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstantFormat7563); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getConstantFormatAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:3510:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleConstantFormat7589); if (state.failed) return current;
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

    // $ANTLR start synpred2_InternalFractal
    public final void synpred2_InternalFractal_fragment() throws RecognitionException {   
        EObject this_CompositeDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:144:2: (this_CompositeDefinition_0= ruleCompositeDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:144:2: this_CompositeDefinition_0= ruleCompositeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleCompositeDefinition_in_synpred2_InternalFractal255);
        this_CompositeDefinition_0=ruleCompositeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalFractal

    // $ANTLR start synpred3_InternalFractal
    public final void synpred3_InternalFractal_fragment() throws RecognitionException {   
        EObject this_PrimitiveDefinition_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:157:2: (this_PrimitiveDefinition_1= rulePrimitiveDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:157:2: this_PrimitiveDefinition_1= rulePrimitiveDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulePrimitiveDefinition_in_synpred3_InternalFractal285);
        this_PrimitiveDefinition_1=rulePrimitiveDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalFractal

    // $ANTLR start synpred12_InternalFractal
    public final void synpred12_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_14_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:462:3: (lv_elements_14_1= ruleHostedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:462:3: lv_elements_14_1= ruleHostedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsHostedInterfaceDefinitionParserRuleCall_7_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_synpred12_InternalFractal925);
        lv_elements_14_1=ruleHostedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalFractal

    // $ANTLR start synpred13_InternalFractal
    public final void synpred13_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_14_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:477:8: (lv_elements_14_2= ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:477:8: lv_elements_14_2= ruleSubComponentDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCompositeDefinitionAccess().getElementsSubComponentDefinitionParserRuleCall_7_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleSubComponentDefinition_in_synpred13_InternalFractal944);
        lv_elements_14_2=ruleSubComponentDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalFractal

    // $ANTLR start synpred20_InternalFractal
    public final void synpred20_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_10_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:659:3: (lv_elements_10_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:659:3: lv_elements_10_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_7_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred20_InternalFractal1278);
        lv_elements_10_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalFractal

    // $ANTLR start synpred21_InternalFractal
    public final void synpred21_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_10_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:674:8: (lv_elements_10_2= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:674:8: lv_elements_10_2= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_7_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred21_InternalFractal1297);
        lv_elements_10_2=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_InternalFractal

    // $ANTLR start synpred22_InternalFractal
    public final void synpred22_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_10_3 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:689:8: (lv_elements_10_3= ruleImplementationDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:689:8: lv_elements_10_3= ruleImplementationDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsImplementationDefinitionParserRuleCall_7_0_2()); 
          	    
        }
        pushFollow(FOLLOW_ruleImplementationDefinition_in_synpred22_InternalFractal1316);
        lv_elements_10_3=ruleImplementationDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalFractal

    // $ANTLR start synpred23_InternalFractal
    public final void synpred23_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_10_4 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:704:8: (lv_elements_10_4= ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:704:8: lv_elements_10_4= ruleAttributeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getPrimitiveDefinitionAccess().getElementsAttributeDefinitionParserRuleCall_7_0_3()); 
          	    
        }
        pushFollow(FOLLOW_ruleAttributeDefinition_in_synpred23_InternalFractal1335);
        lv_elements_10_4=ruleAttributeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalFractal

    // $ANTLR start synpred28_InternalFractal
    public final void synpred28_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_8_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:853:3: (lv_elements_8_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:853:3: lv_elements_8_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_5_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred28_InternalFractal1615);
        lv_elements_8_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalFractal

    // $ANTLR start synpred30_InternalFractal
    public final void synpred30_InternalFractal_fragment() throws RecognitionException {   
        EObject this_ProvidedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:912:2: (this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:912:2: this_ProvidedInterfaceDefinition_0= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred30_InternalFractal1746);
        this_ProvidedInterfaceDefinition_0=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_InternalFractal

    // $ANTLR start synpred46_InternalFractal
    public final void synpred46_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1513:3: (lv_elements_2_1= ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1513:3: lv_elements_2_1= ruleSubComponentDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsSubComponentDefinitionParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleSubComponentDefinition_in_synpred46_InternalFractal2972);
        lv_elements_2_1=ruleSubComponentDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred46_InternalFractal

    // $ANTLR start synpred47_InternalFractal
    public final void synpred47_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1528:8: (lv_elements_2_2= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1528:8: lv_elements_2_2= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_2_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred47_InternalFractal2991);
        lv_elements_2_2=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_InternalFractal

    // $ANTLR start synpred48_InternalFractal
    public final void synpred48_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_3 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1543:8: (lv_elements_2_3= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1543:8: lv_elements_2_3= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentCompositeBodyAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_2_0_2()); 
          	    
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred48_InternalFractal3010);
        lv_elements_2_3=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalFractal

    // $ANTLR start synpred50_InternalFractal
    public final void synpred50_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1623:3: (lv_elements_2_1= ruleProvidedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1623:3: lv_elements_2_1= ruleProvidedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsProvidedInterfaceDefinitionParserRuleCall_2_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleProvidedInterfaceDefinition_in_synpred50_InternalFractal3182);
        lv_elements_2_1=ruleProvidedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred50_InternalFractal

    // $ANTLR start synpred51_InternalFractal
    public final void synpred51_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1638:8: (lv_elements_2_2= ruleRequiredInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1638:8: lv_elements_2_2= ruleRequiredInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsRequiredInterfaceDefinitionParserRuleCall_2_0_1()); 
          	    
        }
        pushFollow(FOLLOW_ruleRequiredInterfaceDefinition_in_synpred51_InternalFractal3201);
        lv_elements_2_2=ruleRequiredInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalFractal

    // $ANTLR start synpred52_InternalFractal
    public final void synpred52_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_3 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1653:8: (lv_elements_2_3= ruleImplementationDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1653:8: lv_elements_2_3= ruleImplementationDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsImplementationDefinitionParserRuleCall_2_0_2()); 
          	    
        }
        pushFollow(FOLLOW_ruleImplementationDefinition_in_synpred52_InternalFractal3220);
        lv_elements_2_3=ruleImplementationDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalFractal

    // $ANTLR start synpred53_InternalFractal
    public final void synpred53_InternalFractal_fragment() throws RecognitionException {   
        EObject lv_elements_2_4 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1668:8: (lv_elements_2_4= ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1668:8: lv_elements_2_4= ruleAttributeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getSubComponentPrimitiveBodyAccess().getElementsAttributeDefinitionParserRuleCall_2_0_3()); 
          	    
        }
        pushFollow(FOLLOW_ruleAttributeDefinition_in_synpred53_InternalFractal3239);
        lv_elements_2_4=ruleAttributeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalFractal

    // $ANTLR start synpred55_InternalFractal
    public final void synpred55_InternalFractal_fragment() throws RecognitionException {   
        EObject this_HostedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1729:2: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1729:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_synpred55_InternalFractal3372);
        this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalFractal

    // $ANTLR start synpred56_InternalFractal
    public final void synpred56_InternalFractal_fragment() throws RecognitionException {   
        EObject this_SubComponentDefinition_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1742:2: (this_SubComponentDefinition_1= ruleSubComponentDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1742:2: this_SubComponentDefinition_1= ruleSubComponentDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleSubComponentDefinition_in_synpred56_InternalFractal3402);
        this_SubComponentDefinition_1=ruleSubComponentDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalFractal

    // $ANTLR start synpred57_InternalFractal
    public final void synpred57_InternalFractal_fragment() throws RecognitionException {   
        EObject this_HostedInterfaceDefinition_0 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1788:2: (this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1788:2: this_HostedInterfaceDefinition_0= ruleHostedInterfaceDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleHostedInterfaceDefinition_in_synpred57_InternalFractal3527);
        this_HostedInterfaceDefinition_0=ruleHostedInterfaceDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalFractal

    // $ANTLR start synpred58_InternalFractal
    public final void synpred58_InternalFractal_fragment() throws RecognitionException {   
        EObject this_ImplementationDefinition_1 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1801:2: (this_ImplementationDefinition_1= ruleImplementationDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1801:2: this_ImplementationDefinition_1= ruleImplementationDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleImplementationDefinition_in_synpred58_InternalFractal3557);
        this_ImplementationDefinition_1=ruleImplementationDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalFractal

    // $ANTLR start synpred59_InternalFractal
    public final void synpred59_InternalFractal_fragment() throws RecognitionException {   
        EObject this_AttributeDefinition_2 = null;


        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1814:2: (this_AttributeDefinition_2= ruleAttributeDefinition )
        // ../org.ow2.mindEd.adl.textual/src-gen/org/ow2/mindEd/adl/textual/parser/antlr/internal/InternalFractal.g:1814:2: this_AttributeDefinition_2= ruleAttributeDefinition
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleAttributeDefinition_in_synpred59_InternalFractal3587);
        this_AttributeDefinition_2=ruleAttributeDefinition();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalFractal

    // Delegated rules

    public final boolean synpred30_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalFractal_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalFractal_fragment(); // can never throw exception
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
    public final boolean synpred53_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalFractal_fragment(); // can never throw exception
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
    public final boolean synpred48_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalFractal_fragment(); // can never throw exception
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
    public final boolean synpred2_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalFractal_fragment(); // can never throw exception
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
    public final boolean synpred28_InternalFractal() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalFractal_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleImportDefinition_in_ruleAdlDefinition137 = new BitSet(new long[]{0x0010000003812000L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_ruleAdlDefinition159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArchitectureDefinition_in_entryRuleArchitectureDefinition195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArchitectureDefinition205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_ruleArchitectureDefinition255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_ruleArchitectureDefinition285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleArchitectureDefinition315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_entryRuleImportDefinition350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportDefinition360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleImportDefinition406 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImportDefinition419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportDefinition440 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImportDefinition452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard547 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleQualifiedNameWithWildcard566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_entryRuleCompositeDefinition608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeDefinition618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleCompositeDefinition664 = new BitSet(new long[]{0x0000000000010000L});
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
    public static final BitSet FOLLOW_21_in_ruleCompositeDefinition902 = new BitSet(new long[]{0x0010000944400000L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeDefinition925 = new BitSet(new long[]{0x0010000944400000L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeDefinition944 = new BitSet(new long[]{0x0010000944400000L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeDefinition963 = new BitSet(new long[]{0x0010000944400000L});
    public static final BitSet FOLLOW_22_in_ruleCompositeDefinition979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_entryRulePrimitiveDefinition1015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveDefinition1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_rulePrimitiveDefinition1071 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_rulePrimitiveDefinition1090 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePrimitiveDefinition1116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1137 = new BitSet(new long[]{0x0000000200300000L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_rulePrimitiveDefinition1158 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_rulePrimitiveDefinition1172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1199 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_rulePrimitiveDefinition1212 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePrimitiveDefinition1239 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_rulePrimitiveDefinition1255 = new BitSet(new long[]{0x0017000044400000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_rulePrimitiveDefinition1278 = new BitSet(new long[]{0x0017000044400000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_rulePrimitiveDefinition1297 = new BitSet(new long[]{0x0017000044400000L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveDefinition1316 = new BitSet(new long[]{0x0017000044400000L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveDefinition1335 = new BitSet(new long[]{0x0017000044400000L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveDefinition1354 = new BitSet(new long[]{0x0017000044400000L});
    public static final BitSet FOLLOW_22_in_rulePrimitiveDefinition1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleTypeDefinition1462 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTypeDefinition1475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1496 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleTypeDefinition1509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1536 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_ruleTypeDefinition1549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeDefinition1576 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_ruleTypeDefinition1592 = new BitSet(new long[]{0x0010000044400000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleTypeDefinition1615 = new BitSet(new long[]{0x0010000044400000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleTypeDefinition1634 = new BitSet(new long[]{0x0010000044400000L});
    public static final BitSet FOLLOW_22_in_ruleTypeDefinition1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_entryRuleHostedInterfaceDefinition1686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHostedInterfaceDefinition1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleHostedInterfaceDefinition1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleHostedInterfaceDefinition1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_entryRuleProvidedInterfaceDefinition1811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvidedInterfaceDefinition1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleProvidedInterfaceDefinition1867 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleProvidedInterfaceDefinition1886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleProvidedInterfaceDefinition1926 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleProvidedInterfaceDefinition1938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleProvidedInterfaceDefinition1955 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_28_in_ruleProvidedInterfaceDefinition1979 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleProvidedInterfaceDefinition2009 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleProvidedInterfaceDefinition2027 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProvidedInterfaceDefinition2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_entryRuleRequiredInterfaceDefinition2077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequiredInterfaceDefinition2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleRequiredInterfaceDefinition2133 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleRequiredInterfaceDefinition2152 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_31_in_ruleRequiredInterfaceDefinition2183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRequiredInterfaceDefinition2224 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleRequiredInterfaceDefinition2236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequiredInterfaceDefinition2253 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_28_in_ruleRequiredInterfaceDefinition2277 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleRequiredInterfaceDefinition2307 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleRequiredInterfaceDefinition2325 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRequiredInterfaceDefinition2339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_entryRuleSubComponentDefinition2377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentDefinition2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleSubComponentDefinition2433 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleSubComponentDefinition2446 = new BitSet(new long[]{0x0000000208020010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSubComponentDefinition2473 = new BitSet(new long[]{0x0000000208020000L});
    public static final BitSet FOLLOW_17_in_ruleSubComponentDefinition2487 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleSubComponentDefinition2508 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleSubComponentDefinition2521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_ruleSubComponentDefinition2542 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleSubComponentDefinition2556 = new BitSet(new long[]{0x0000000208000000L});
    public static final BitSet FOLLOW_33_in_ruleSubComponentDefinition2571 = new BitSet(new long[]{0x0000780000000070L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2592 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_18_in_ruleSubComponentDefinition2605 = new BitSet(new long[]{0x0000780000000070L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_ruleSubComponentDefinition2626 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_34_in_ruleSubComponentDefinition2640 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSubComponentDefinition2654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSubComponentDefinition2671 = new BitSet(new long[]{0x0000000001014000L});
    public static final BitSet FOLLOW_ruleSubComponentBody_in_ruleSubComponentDefinition2697 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSubComponentDefinition2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentBody_in_entryRuleSubComponentBody2746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentBody2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_ruleSubComponentBody2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_ruleSubComponentBody2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentCompositeBody_in_entryRuleSubComponentCompositeBody2871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentCompositeBody2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleSubComponentCompositeBody2924 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSubComponentCompositeBody2949 = new BitSet(new long[]{0x0010000944400000L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleSubComponentCompositeBody2972 = new BitSet(new long[]{0x0010000944400000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleSubComponentCompositeBody2991 = new BitSet(new long[]{0x0010000944400000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleSubComponentCompositeBody3010 = new BitSet(new long[]{0x0010000944400000L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleSubComponentCompositeBody3029 = new BitSet(new long[]{0x0010000944400000L});
    public static final BitSet FOLLOW_22_in_ruleSubComponentCompositeBody3045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentPrimitiveBody_in_entryRuleSubComponentPrimitiveBody3081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubComponentPrimitiveBody3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSubComponentPrimitiveBody3134 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSubComponentPrimitiveBody3159 = new BitSet(new long[]{0x0017000044400000L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_ruleSubComponentPrimitiveBody3182 = new BitSet(new long[]{0x0017000044400000L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_ruleSubComponentPrimitiveBody3201 = new BitSet(new long[]{0x0017000044400000L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_ruleSubComponentPrimitiveBody3220 = new BitSet(new long[]{0x0017000044400000L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_ruleSubComponentPrimitiveBody3239 = new BitSet(new long[]{0x0017000044400000L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_ruleSubComponentPrimitiveBody3258 = new BitSet(new long[]{0x0017000044400000L});
    public static final BitSet FOLLOW_22_in_ruleSubComponentPrimitiveBody3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeElement_in_entryRuleCompositeElement3312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeElement3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_ruleCompositeElement3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_ruleCompositeElement3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_ruleCompositeElement3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveElement_in_entryRulePrimitiveElement3467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveElement3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_rulePrimitiveElement3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_rulePrimitiveElement3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_rulePrimitiveElement3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_rulePrimitiveElement3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindingDefinition_in_entryRuleBindingDefinition3652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindingDefinition3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleBindingDefinition3708 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleBindingDefinition3721 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3746 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36_in_ruleBindingDefinition3770 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleBindingDefinition3796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3820 = new BitSet(new long[]{0x0000004010000000L});
    public static final BitSet FOLLOW_28_in_ruleBindingDefinition3833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition3850 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleBindingDefinition3867 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleBindingDefinition3881 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3906 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36_in_ruleBindingDefinition3930 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleBindingDefinition3956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindingDefinition3980 = new BitSet(new long[]{0x0000000010004000L});
    public static final BitSet FOLLOW_28_in_ruleBindingDefinition3993 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleBindingDefinition4010 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleBindingDefinition4027 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBindingDefinition4041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_entryRuleFormalArgument4077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgument4087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFormalArgument4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormalArgumentsList_in_entryRuleFormalArgumentsList4168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormalArgumentsList4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleFormalArgumentsList4215 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4236 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_18_in_ruleFormalArgumentsList4249 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFormalArgument_in_ruleFormalArgumentsList4270 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_34_in_ruleFormalArgumentsList4284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_entryRuleTemplateSpecifier4320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateSpecifier4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplateSpecifier4372 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleTemplateSpecifier4389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateSpecifier4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType4453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType4464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleAttributeType4502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAttributeType4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAttributeType4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeType4561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT4607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesignedINT4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulesignedINT4657 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_44_in_rulesignedINT4676 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexadecimalType_in_entryRuleHexadecimalType4739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHexadecimalType4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleHexadecimalType4788 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHexadecimalType4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue4849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValue4900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesignedINT_in_ruleValue4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHexadecimalType_in_ruleValue4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue4992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleValue5016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateDefinition_in_entryRuleTemplateDefinition5056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplateDefinition5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplateSpecifier_in_ruleTemplateDefinition5113 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleTemplateDefinition5125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTemplateDefinition5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentDefinition_in_entryRuleArgumentDefinition5190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDefinition5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArgumentDefinition5243 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleArgumentDefinition5260 = new BitSet(new long[]{0x0000780000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArgumentDefinition5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_entryRuleAttributeDefinition5319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeDefinition5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleAttributeDefinition5375 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleAttributeDefinition5388 = new BitSet(new long[]{0x0000070000000010L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttributeDefinition5409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeDefinition5427 = new BitSet(new long[]{0x0000800000004000L});
    public static final BitSet FOLLOW_47_in_ruleAttributeDefinition5445 = new BitSet(new long[]{0x0000780000000070L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAttributeDefinition5466 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAttributeDefinition5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_entryRuleImplementationDefinition5516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplementationDefinition5526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleImplementationDefinition5572 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleImplementationDefinition5585 = new BitSet(new long[]{0x0008002000000190L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleImplementationDefinition5607 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleImplementationDefinition5634 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImplementationDefinition5647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataDefinition_in_entryRuleDataDefinition5683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataDefinition5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleDataDefinition5739 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleDataDefinition5752 = new BitSet(new long[]{0x0008002000000190L});
    public static final BitSet FOLLOW_ruleFileC_in_ruleDataDefinition5774 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_ruleDataDefinition5801 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDataDefinition5814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5902 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleQualifiedName5921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName5936 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleFileC_in_entryRuleFileC5983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileC5993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_ruleFileC6039 = new BitSet(new long[]{0x0008002000000110L});
    public static final BitSet FOLLOW_ruleFileName_in_ruleFileC6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInlineCodeC_in_entryRuleInlineCodeC6097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInlineCodeC6107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CODE_C_in_ruleInlineCodeC6148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath6189 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath6200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath6241 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_37_in_rulePath6265 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_51_in_rulePath6284 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SL_in_rulePath6302 = new BitSet(new long[]{0x0008000000000110L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePath6324 = new BitSet(new long[]{0x0000100000000110L});
    public static final BitSet FOLLOW_44_in_rulePath6343 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_51_in_rulePath6366 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_SL_in_rulePath6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileName_in_entryRuleFileName6430 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileName6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName6481 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleFileName6500 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFileName6515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList6562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList6572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList6618 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList6639 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation6676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAnnotation6723 = new BitSet(new long[]{0x01E0000000000010L});
    public static final BitSet FOLLOW_53_in_ruleAnnotation6743 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_54_in_ruleAnnotation6772 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_55_in_ruleAnnotation6801 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_56_in_ruleAnnotation6830 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotation6862 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleAnnotation6878 = new BitSet(new long[]{0x0010000000200070L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation6899 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_18_in_ruleAnnotation6912 = new BitSet(new long[]{0x0010000000200070L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_ruleAnnotation6933 = new BitSet(new long[]{0x0000000400040000L});
    public static final BitSet FOLLOW_34_in_ruleAnnotation6947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotationElement_in_entryRuleAnnotationElement6985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationElement6995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationElement7038 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleAnnotationElement7055 = new BitSet(new long[]{0x0010000000200070L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleAnnotationElement7078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValue_in_entryRuleElementValue7114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValue7124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_ruleElementValue7174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_ruleElementValue7204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_ruleElementValue7234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementValueArrayInitializer_in_entryRuleElementValueArrayInitializer7269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementValueArrayInitializer7279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleElementValueArrayInitializer7316 = new BitSet(new long[]{0x0010000000200070L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7337 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_18_in_ruleElementValueArrayInitializer7350 = new BitSet(new long[]{0x0010000000200070L});
    public static final BitSet FOLLOW_ruleElementValue_in_ruleElementValueArrayInitializer7371 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_22_in_ruleElementValueArrayInitializer7385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantValue_in_entryRuleConstantValue7421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantValue7431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_ruleConstantValue7476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantFormat_in_entryRuleConstantFormat7512 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantFormat7523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstantFormat7563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleConstantFormat7589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportDefinition_in_synpred1_InternalFractal137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeDefinition_in_synpred2_InternalFractal255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveDefinition_in_synpred3_InternalFractal285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_synpred12_InternalFractal925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred13_InternalFractal944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred20_InternalFractal1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred21_InternalFractal1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_synpred22_InternalFractal1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred23_InternalFractal1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred28_InternalFractal1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred30_InternalFractal1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred46_InternalFractal2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred47_InternalFractal2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred48_InternalFractal3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvidedInterfaceDefinition_in_synpred50_InternalFractal3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequiredInterfaceDefinition_in_synpred51_InternalFractal3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_synpred52_InternalFractal3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred53_InternalFractal3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_synpred55_InternalFractal3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubComponentDefinition_in_synpred56_InternalFractal3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHostedInterfaceDefinition_in_synpred57_InternalFractal3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplementationDefinition_in_synpred58_InternalFractal3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeDefinition_in_synpred59_InternalFractal3587 = new BitSet(new long[]{0x0000000000000002L});

}
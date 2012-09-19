package org.ow2.mindEd.idt.editor.textual.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.ow2.mindEd.idt.editor.textual.services.FractalIdtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFractalIdtParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INCLUDE_LIB", "RULE_BOOLEAN", "RULE_ADDITIVE_OPERATION", "RULE_INT", "RULE_SHIFT_OPERATION", "RULE_MUL_OPERATION", "RULE_UNARY_OPERATION", "RULE_FDSYMBOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#ifndef'", "'#endif'", "';'", "'typedef'", "'{'", "'}'", "'struct'", "'union'", "':'", "'enum'", "','", "'='", "'*'", "'('", "')'", "'['", "']'", "'.'", "'#define'", "'interface'", "'unmanaged'", "'void'", "'...'", "'#include'", "'@'", "'null'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'e'", "'E'", "'const'", "'volatile'", "'char'", "'short'", "'int'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'string'", "'int8_t'", "'uint8_t'", "'int16_t'", "'uint16_t'", "'int32_t'", "'uint32_t'", "'int64_t'", "'uint64_t'", "'intptr_t'", "'uintptr_t'", "'in'", "'out'"
    };
    public static final int T__68=68;
    public static final int RULE_MUL_OPERATION=11;
    public static final int RULE_BOOLEAN=7;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__19=19;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_UNARY_OPERATION=12;
    public static final int T__59=59;
    public static final int RULE_INT=9;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int RULE_FDSYMBOL=13;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=15;
    public static final int RULE_SHIFT_OPERATION=10;
    public static final int RULE_INCLUDE_LIB=6;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_ADDITIVE_OPERATION=8;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=16;
    public static final int T__73=73;

    // delegates
    // delegators


        public InternalFractalIdtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFractalIdtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFractalIdtParser.tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private FractalIdtGrammarAccess grammarAccess;
     	
        public InternalFractalIdtParser(TokenStream input, FractalIdtGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "IdtFile";	
       	}
       	
       	@Override
       	protected FractalIdtGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleIdtFile"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:74:1: entryRuleIdtFile returns [EObject current=null] : iv_ruleIdtFile= ruleIdtFile EOF ;
    public final EObject entryRuleIdtFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdtFile = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:75:2: (iv_ruleIdtFile= ruleIdtFile EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:76:2: iv_ruleIdtFile= ruleIdtFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdtFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIdtFile_in_entryRuleIdtFile81);
            iv_ruleIdtFile=ruleIdtFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdtFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIdtFile91); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdtFile"


    // $ANTLR start "ruleIdtFile"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:83:1: ruleIdtFile returns [EObject current=null] : ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) ) ) ;
    public final EObject ruleIdtFile() throws RecognitionException {
        EObject current = null;

        EObject lv_begindef_0_0 = null;

        EObject lv_def_1_0 = null;

        EObject lv_includes_2_0 = null;

        EObject lv_constant_3_0 = null;

        EObject lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_endDef_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:86:28: ( ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:87:1: ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:87:1: ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:87:2: ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:87:2: ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:88:1: (lv_begindef_0_0= ruleConstantDefinitionBegin )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:88:1: (lv_begindef_0_0= ruleConstantDefinitionBegin )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:89:3: lv_begindef_0_0= ruleConstantDefinitionBegin
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdtFileAccess().getBegindefConstantDefinitionBeginParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinitionBegin_in_ruleIdtFile137);
            lv_begindef_0_0=ruleConstantDefinitionBegin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIdtFileRule());
              	        }
                     		set(
                     			current, 
                     			"begindef",
                      		lv_begindef_0_0, 
                      		"ConstantDefinitionBegin");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:105:2: ( (lv_def_1_0= ruleConstantDefinition ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:106:1: (lv_def_1_0= ruleConstantDefinition )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:106:1: (lv_def_1_0= ruleConstantDefinition )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:107:3: lv_def_1_0= ruleConstantDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdtFileAccess().getDefConstantDefinitionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinition_in_ruleIdtFile158);
            lv_def_1_0=ruleConstantDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIdtFileRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_1_0, 
                      		"ConstantDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:123:2: ( (lv_includes_2_0= ruleIncludeDirective ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==41) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:124:1: (lv_includes_2_0= ruleIncludeDirective )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:124:1: (lv_includes_2_0= ruleIncludeDirective )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:125:3: lv_includes_2_0= ruleIncludeDirective
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIdtFileAccess().getIncludesIncludeDirectiveParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleIncludeDirective_in_ruleIdtFile179);
            	    lv_includes_2_0=ruleIncludeDirective();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIdtFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"includes",
            	              		lv_includes_2_0, 
            	              		"IncludeDirective");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:141:3: ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==36) ) {
                    alt2=1;
                }
                else if ( (LA2_0==21||(LA2_0>=24 && LA2_0<=25)||LA2_0==27) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:141:4: ( (lv_constant_3_0= ruleConstantDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:141:4: ( (lv_constant_3_0= ruleConstantDefinition ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:142:1: (lv_constant_3_0= ruleConstantDefinition )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:142:1: (lv_constant_3_0= ruleConstantDefinition )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:143:3: lv_constant_3_0= ruleConstantDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIdtFileAccess().getConstantConstantDefinitionParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleConstantDefinition_in_ruleIdtFile202);
            	    lv_constant_3_0=ruleConstantDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIdtFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constant",
            	              		lv_constant_3_0, 
            	              		"ConstantDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:160:6: ( (lv_type_4_0= ruleTypeDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:160:6: ( (lv_type_4_0= ruleTypeDefinition ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:161:1: (lv_type_4_0= ruleTypeDefinition )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:161:1: (lv_type_4_0= ruleTypeDefinition )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:162:3: lv_type_4_0= ruleTypeDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIdtFileAccess().getTypeTypeDefinitionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeDefinition_in_ruleIdtFile229);
            	    lv_type_4_0=ruleTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIdtFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"type",
            	              		lv_type_4_0, 
            	              		"TypeDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:178:4: ( (lv_endDef_5_0= ruleConstantDefinitionEnd ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:179:1: (lv_endDef_5_0= ruleConstantDefinitionEnd )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:179:1: (lv_endDef_5_0= ruleConstantDefinitionEnd )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:180:3: lv_endDef_5_0= ruleConstantDefinitionEnd
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIdtFileAccess().getEndDefConstantDefinitionEndParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinitionEnd_in_ruleIdtFile252);
            lv_endDef_5_0=ruleConstantDefinitionEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIdtFileRule());
              	        }
                     		set(
                     			current, 
                     			"endDef",
                      		lv_endDef_5_0, 
                      		"ConstantDefinitionEnd");
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
    // $ANTLR end "ruleIdtFile"


    // $ANTLR start "entryRuleConstantDefinitionBegin"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:204:1: entryRuleConstantDefinitionBegin returns [EObject current=null] : iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF ;
    public final EObject entryRuleConstantDefinitionBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinitionBegin = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:205:2: (iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:206:2: iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDefinitionBeginRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin288);
            iv_ruleConstantDefinitionBegin=ruleConstantDefinitionBegin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDefinitionBegin; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantDefinitionBegin298); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantDefinitionBegin"


    // $ANTLR start "ruleConstantDefinitionBegin"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:213:1: ruleConstantDefinitionBegin returns [EObject current=null] : (otherlv_0= '#ifndef' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConstantDefinitionBegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:216:28: ( (otherlv_0= '#ifndef' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:217:1: (otherlv_0= '#ifndef' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:217:1: (otherlv_0= '#ifndef' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:217:3: otherlv_0= '#ifndef' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstantDefinitionBegin335); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDefinitionBeginAccess().getIfndefKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:221:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:222:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:222:1: (lv_name_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:223:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstantDefinitionBegin352); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getConstantDefinitionBeginAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantDefinitionBeginRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleConstantDefinitionBegin"


    // $ANTLR start "entryRuleConstantDefinitionEnd"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:247:1: entryRuleConstantDefinitionEnd returns [String current=null] : iv_ruleConstantDefinitionEnd= ruleConstantDefinitionEnd EOF ;
    public final String entryRuleConstantDefinitionEnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstantDefinitionEnd = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:248:2: (iv_ruleConstantDefinitionEnd= ruleConstantDefinitionEnd EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:249:2: iv_ruleConstantDefinitionEnd= ruleConstantDefinitionEnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDefinitionEndRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinitionEnd_in_entryRuleConstantDefinitionEnd394);
            iv_ruleConstantDefinitionEnd=ruleConstantDefinitionEnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDefinitionEnd.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantDefinitionEnd405); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantDefinitionEnd"


    // $ANTLR start "ruleConstantDefinitionEnd"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:256:1: ruleConstantDefinitionEnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '#endif' ;
    public final AntlrDatatypeRuleToken ruleConstantDefinitionEnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:259:28: (kw= '#endif' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:261:2: kw= '#endif'
            {
            kw=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConstantDefinitionEnd442); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getConstantDefinitionEndAccess().getEndifKeyword()); 
                  
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
    // $ANTLR end "ruleConstantDefinitionEnd"


    // $ANTLR start "entryRuleTypeDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:276:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:277:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:278:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition483);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeDefinition493); if (state.failed) return current;

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:285:1: ruleTypeDefinition returns [EObject current=null] : ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_TypedefSpecification_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:288:28: ( ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:289:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:289:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:289:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:289:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 24:
            case 25:
                {
                alt3=2;
                }
                break;
            case 27:
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:290:2: this_TypedefSpecification_0= ruleTypedefSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition544);
                    this_TypedefSpecification_0=ruleTypedefSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypedefSpecification_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:303:2: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition574);
                    this_StructOrUnionSpecification_1=ruleStructOrUnionSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StructOrUnionSpecification_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:316:2: this_EnumSpecification_2= ruleEnumSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getEnumSpecificationParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition604);
                    this_EnumSpecification_2=ruleEnumSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumSpecification_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTypeDefinition616); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTypeDefinitionAccess().getSemicolonKeyword_1());
                  
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


    // $ANTLR start "entryRuleTypedefSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:339:1: entryRuleTypedefSpecification returns [EObject current=null] : iv_ruleTypedefSpecification= ruleTypedefSpecification EOF ;
    public final EObject entryRuleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedefSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:340:2: (iv_ruleTypedefSpecification= ruleTypedefSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:341:2: iv_ruleTypedefSpecification= ruleTypedefSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedefSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification652);
            iv_ruleTypedefSpecification=ruleTypedefSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedefSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedefSpecification662); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypedefSpecification"


    // $ANTLR start "ruleTypedefSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:348:1: ruleTypedefSpecification returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) ;
    public final EObject ruleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_qualifedType_1_0 = null;

        EObject lv_dec_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:351:28: ( (otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:352:1: (otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:352:1: (otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:352:3: otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTypedefSpecification699); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:356:1: ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:357:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:357:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:358:3: lv_qualifedType_1_0= ruleQualifiedTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification720);
            lv_qualifedType_1_0=ruleQualifiedTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedefSpecificationRule());
              	        }
                     		set(
                     			current, 
                     			"qualifedType",
                      		lv_qualifedType_1_0, 
                      		"QualifiedTypeSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:374:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:375:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:375:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:376:3: lv_dec_2_0= ruleDeclarators
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_ruleTypedefSpecification741);
            lv_dec_2_0=ruleDeclarators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypedefSpecificationRule());
              	        }
                     		set(
                     			current, 
                     			"dec",
                      		lv_dec_2_0, 
                      		"Declarators");
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
    // $ANTLR end "ruleTypedefSpecification"


    // $ANTLR start "entryRuleQualifiedTypeSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:400:1: entryRuleQualifiedTypeSpecification returns [EObject current=null] : iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF ;
    public final EObject entryRuleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedTypeSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:401:2: (iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:402:2: iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedTypeSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification777);
            iv_ruleQualifiedTypeSpecification=ruleQualifiedTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedTypeSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification787); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedTypeSpecification"


    // $ANTLR start "ruleQualifiedTypeSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:409:1: ruleQualifiedTypeSpecification returns [EObject current=null] : ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) ;
    public final EObject ruleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeQualifier_0_0 = null;

        EObject lv_typeSpec_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:412:28: ( ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:413:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:413:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:413:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:413:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=51 && LA4_0<=52)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:414:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:414:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:415:3: lv_typeQualifier_0_0= ruleTypeQualifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification833);
            	    lv_typeQualifier_0_0=ruleTypeQualifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQualifiedTypeSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"typeQualifier",
            	              		lv_typeQualifier_0_0, 
            	              		"TypeQualifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:431:3: ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:432:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:432:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:433:3: lv_typeSpec_1_0= ruleTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification855);
            lv_typeSpec_1_0=ruleTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQualifiedTypeSpecificationRule());
              	        }
                     		set(
                     			current, 
                     			"typeSpec",
                      		lv_typeSpec_1_0, 
                      		"TypeSpecification");
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
    // $ANTLR end "ruleQualifiedTypeSpecification"


    // $ANTLR start "entryRuleTypeSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:457:1: entryRuleTypeSpecification returns [EObject current=null] : iv_ruleTypeSpecification= ruleTypeSpecification EOF ;
    public final EObject entryRuleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:458:2: (iv_ruleTypeSpecification= ruleTypeSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:459:2: iv_ruleTypeSpecification= ruleTypeSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification891);
            iv_ruleTypeSpecification=ruleTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeSpecification901); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTypeSpecification"


    // $ANTLR start "ruleTypeSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:466:1: ruleTypeSpecification returns [EObject current=null] : ( ( (lv_typeDefName_0_0= ruleQualifiedName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) ) ;
    public final EObject ruleTypeSpecification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_typeDefName_0_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;

        Enumerator lv_typeSpecifier_3_0 = null;

        Enumerator lv_typeSpecifier_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:469:28: ( ( ( (lv_typeDefName_0_0= ruleQualifiedName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:470:1: ( ( (lv_typeDefName_0_0= ruleQualifiedName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:470:1: ( ( (lv_typeDefName_0_0= ruleQualifiedName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt6=1;
                }
                break;
            case 24:
            case 25:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 39:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:470:2: ( (lv_typeDefName_0_0= ruleQualifiedName ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:470:2: ( (lv_typeDefName_0_0= ruleQualifiedName ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:471:1: (lv_typeDefName_0_0= ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:471:1: (lv_typeDefName_0_0= ruleQualifiedName )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:472:3: lv_typeDefName_0_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeDefNameQualifiedNameParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTypeSpecification947);
                    lv_typeDefName_0_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeSpecificationRule());
                      	        }
                             		set(
                             			current, 
                             			"typeDefName",
                              		lv_typeDefName_0_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:490:2: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification978);
                    this_StructOrUnionSpecification_1=ruleStructOrUnionSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StructOrUnionSpecification_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:503:2: this_EnumSpecification_2= ruleEnumSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification1008);
                    this_EnumSpecification_2=ruleEnumSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumSpecification_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:515:6: ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:515:6: ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:515:7: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )*
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:515:7: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:516:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:516:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:517:3: lv_typeSpecifier_3_0= ruleTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification1035);
                    lv_typeSpecifier_3_0=ruleTypeSpecifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeSpecificationRule());
                      	        }
                             		add(
                             			current, 
                             			"typeSpecifier",
                              		lv_typeSpecifier_3_0, 
                              		"TypeSpecifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:533:2: ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==39||(LA5_0>=53 && LA5_0<=71)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:534:1: (lv_typeSpecifier_4_0= ruleTypeSpecifier )
                    	    {
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:534:1: (lv_typeSpecifier_4_0= ruleTypeSpecifier )
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:535:3: lv_typeSpecifier_4_0= ruleTypeSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification1056);
                    	    lv_typeSpecifier_4_0=ruleTypeSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTypeSpecificationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeSpecifier",
                    	              		lv_typeSpecifier_4_0, 
                    	              		"TypeSpecifier");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


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
    // $ANTLR end "ruleTypeSpecification"


    // $ANTLR start "entryRuleStructOrUnionSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:559:1: entryRuleStructOrUnionSpecification returns [EObject current=null] : iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF ;
    public final EObject entryRuleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:560:2: (iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:561:2: iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructOrUnionSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification1094);
            iv_ruleStructOrUnionSpecification=ruleStructOrUnionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructOrUnionSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnionSpecification1104); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStructOrUnionSpecification"


    // $ANTLR start "ruleStructOrUnionSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:568:1: ruleStructOrUnionSpecification returns [EObject current=null] : (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) ;
    public final EObject ruleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StructOrUnionDefinition_0 = null;

        EObject this_StructorUnionReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:571:28: ( (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:572:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:572:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==22) ) {
                        alt7=1;
                    }
                    else if ( (LA7_3==EOF||LA7_3==RULE_ID||LA7_3==20||(LA7_3>=30 && LA7_3<=32)) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==22) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==25) ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==22) ) {
                        alt7=1;
                    }
                    else if ( (LA7_3==EOF||LA7_3==RULE_ID||LA7_3==20||(LA7_3>=30 && LA7_3<=32)) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_2==22) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:573:2: this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification1154);
                    this_StructOrUnionDefinition_0=ruleStructOrUnionDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StructOrUnionDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:586:2: this_StructorUnionReference_1= ruleStructorUnionReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructorUnionReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification1184);
                    this_StructorUnionReference_1=ruleStructorUnionReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StructorUnionReference_1; 
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
    // $ANTLR end "ruleStructOrUnionSpecification"


    // $ANTLR start "entryRuleStructOrUnionDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:605:1: entryRuleStructOrUnionDefinition returns [EObject current=null] : iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF ;
    public final EObject entryRuleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:606:2: (iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:607:2: iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructOrUnionDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1219);
            iv_ruleStructOrUnionDefinition=ruleStructOrUnionDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructOrUnionDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1229); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStructOrUnionDefinition"


    // $ANTLR start "ruleStructOrUnionDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:614:1: ruleStructOrUnionDefinition returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}' ) ;
    public final EObject ruleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;

        EObject lv_structMember_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:617:28: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:618:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:618:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:618:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:618:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:619:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:619:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:620:3: lv_struct_0_0= ruleStructOrUnion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1275);
            lv_struct_0_0=ruleStructOrUnion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStructOrUnionDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"struct",
                      		lv_struct_0_0, 
                      		"StructOrUnion");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:636:2: ( (lv_name_1_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:637:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:637:1: (lv_name_1_0= RULE_ID )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:638:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1292); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_1_0, grammarAccess.getStructOrUnionDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStructOrUnionDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStructOrUnionDefinition1310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:658:1: ( (lv_structMember_3_0= ruleStructMember ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=24 && LA9_0<=25)||LA9_0==27||LA9_0==39||LA9_0==42||(LA9_0>=51 && LA9_0<=71)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:659:1: (lv_structMember_3_0= ruleStructMember )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:659:1: (lv_structMember_3_0= ruleStructMember )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:660:3: lv_structMember_3_0= ruleStructMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1331);
            	    lv_structMember_3_0=ruleStructMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStructOrUnionDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"structMember",
            	              		lv_structMember_3_0, 
            	              		"StructMember");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleStructOrUnionDefinition1344); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getStructOrUnionDefinitionAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleStructOrUnionDefinition"


    // $ANTLR start "entryRuleStructorUnionReference"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:688:1: entryRuleStructorUnionReference returns [EObject current=null] : iv_ruleStructorUnionReference= ruleStructorUnionReference EOF ;
    public final EObject entryRuleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructorUnionReference = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:689:2: (iv_ruleStructorUnionReference= ruleStructorUnionReference EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:690:2: iv_ruleStructorUnionReference= ruleStructorUnionReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructorUnionReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1380);
            iv_ruleStructorUnionReference=ruleStructorUnionReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructorUnionReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructorUnionReference1390); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStructorUnionReference"


    // $ANTLR start "ruleStructorUnionReference"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:697:1: ruleStructorUnionReference returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:700:28: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:701:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:701:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:701:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:701:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:702:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:702:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:703:3: lv_struct_0_0= ruleStructOrUnion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1436);
            lv_struct_0_0=ruleStructOrUnion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStructorUnionReferenceRule());
              	        }
                     		set(
                     			current, 
                     			"struct",
                      		lv_struct_0_0, 
                      		"StructOrUnion");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:719:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:720:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:720:1: (lv_name_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:721:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStructorUnionReference1453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getStructorUnionReferenceAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStructorUnionReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleStructorUnionReference"


    // $ANTLR start "entryRuleStructOrUnion"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:745:1: entryRuleStructOrUnion returns [String current=null] : iv_ruleStructOrUnion= ruleStructOrUnion EOF ;
    public final String entryRuleStructOrUnion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructOrUnion = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:746:2: (iv_ruleStructOrUnion= ruleStructOrUnion EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:747:2: iv_ruleStructOrUnion= ruleStructOrUnion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructOrUnionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1495);
            iv_ruleStructOrUnion=ruleStructOrUnion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructOrUnion.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnion1506); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStructOrUnion"


    // $ANTLR start "ruleStructOrUnion"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:754:1: ruleStructOrUnion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'struct' | kw= 'union' ) ;
    public final AntlrDatatypeRuleToken ruleStructOrUnion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:757:28: ( (kw= 'struct' | kw= 'union' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:758:1: (kw= 'struct' | kw= 'union' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:758:1: (kw= 'struct' | kw= 'union' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            else if ( (LA10_0==25) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:759:2: kw= 'struct'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleStructOrUnion1544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStructOrUnionAccess().getStructKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:766:2: kw= 'union'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleStructOrUnion1563); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStructOrUnionAccess().getUnionKeyword_1()); 
                          
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
    // $ANTLR end "ruleStructOrUnion"


    // $ANTLR start "entryRuleStructMember"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:779:1: entryRuleStructMember returns [EObject current=null] : iv_ruleStructMember= ruleStructMember EOF ;
    public final EObject entryRuleStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructMember = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:780:2: (iv_ruleStructMember= ruleStructMember EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:781:2: iv_ruleStructMember= ruleStructMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructMemberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructMember_in_entryRuleStructMember1603);
            iv_ruleStructMember=ruleStructMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructMember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructMember1613); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStructMember"


    // $ANTLR start "ruleStructMember"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:788:1: ruleStructMember returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_qualType_1_0 = null;

        EObject lv_dec_2_0 = null;

        EObject lv_constExpr_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:791:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:792:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:792:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:792:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:792:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:793:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:793:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:794:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStructMemberAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleStructMember1659);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStructMemberRule());
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:810:3: ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:811:1: (lv_qualType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:811:1: (lv_qualType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:812:3: lv_qualType_1_0= ruleQualifiedTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1681);
            lv_qualType_1_0=ruleQualifiedTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStructMemberRule());
              	        }
                     		set(
                     			current, 
                     			"qualType",
                      		lv_qualType_1_0, 
                      		"QualifiedTypeSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:828:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:829:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:829:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:830:3: lv_dec_2_0= ruleDeclarators
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_ruleStructMember1702);
            lv_dec_2_0=ruleDeclarators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getStructMemberRule());
              	        }
                     		set(
                     			current, 
                     			"dec",
                      		lv_dec_2_0, 
                      		"Declarators");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:846:2: (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:846:4: otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) )
                    {
                    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleStructMember1715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStructMemberAccess().getColonKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:850:1: ( (lv_constExpr_4_0= ruleConstantExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:851:1: (lv_constExpr_4_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:851:1: (lv_constExpr_4_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:852:3: lv_constExpr_4_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStructMemberAccess().getConstExprConstantExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleStructMember1736);
                    lv_constExpr_4_0=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStructMemberRule());
                      	        }
                             		set(
                             			current, 
                             			"constExpr",
                              		lv_constExpr_4_0, 
                              		"ConstantExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStructMember1750); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getStructMemberAccess().getSemicolonKeyword_4());
                  
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
    // $ANTLR end "ruleStructMember"


    // $ANTLR start "entryRuleEnumSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:880:1: entryRuleEnumSpecification returns [EObject current=null] : iv_ruleEnumSpecification= ruleEnumSpecification EOF ;
    public final EObject entryRuleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:881:2: (iv_ruleEnumSpecification= ruleEnumSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:882:2: iv_ruleEnumSpecification= ruleEnumSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1786);
            iv_ruleEnumSpecification=ruleEnumSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumSpecification1796); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumSpecification"


    // $ANTLR start "ruleEnumSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:889:1: ruleEnumSpecification returns [EObject current=null] : (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) ;
    public final EObject ruleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDefinition_0 = null;

        EObject this_EnumReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:892:28: ( (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:893:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:893:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==EOF||LA13_2==RULE_ID||LA13_2==20||(LA13_2>=30 && LA13_2<=32)) ) {
                        alt13=2;
                    }
                    else if ( (LA13_2==22) ) {
                        alt13=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA13_1==22) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:894:2: this_EnumDefinition_0= ruleEnumDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1846);
                    this_EnumDefinition_0=ruleEnumDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:907:2: this_EnumReference_1= ruleEnumReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumReference_in_ruleEnumSpecification1876);
                    this_EnumReference_1=ruleEnumReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumReference_1; 
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
    // $ANTLR end "ruleEnumSpecification"


    // $ANTLR start "entryRuleEnumDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:926:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:927:2: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:928:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1911);
            iv_ruleEnumDefinition=ruleEnumDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumDefinition1921); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumDefinition"


    // $ANTLR start "ruleEnumDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:935:1: ruleEnumDefinition returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}' ) ;
    public final EObject ruleEnumDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_enumMemberList_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:938:28: ( (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:939:1: (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:939:1: (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:939:3: otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEnumDefinition1958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:943:1: ( (lv_id_1_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:944:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:944:1: (lv_id_1_0= RULE_ID )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:945:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumDefinition1975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_id_1_0, grammarAccess.getEnumDefinitionAccess().getIdIDTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEnumDefinitionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"id",
                              		lv_id_1_0, 
                              		"ID");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEnumDefinition1993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:965:1: ( (lv_enumMemberList_3_0= ruleEnumMemberList ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:966:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:966:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:967:3: lv_enumMemberList_3_0= ruleEnumMemberList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition2014);
            lv_enumMemberList_3_0=ruleEnumMemberList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnumDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"enumMemberList",
                      		lv_enumMemberList_3_0, 
                      		"EnumMemberList");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEnumDefinition2026); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEnumDefinitionAccess().getRightCurlyBracketKeyword_4());
                  
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
    // $ANTLR end "ruleEnumDefinition"


    // $ANTLR start "entryRuleEnumReference"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:995:1: entryRuleEnumReference returns [EObject current=null] : iv_ruleEnumReference= ruleEnumReference EOF ;
    public final EObject entryRuleEnumReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumReference = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:996:2: (iv_ruleEnumReference= ruleEnumReference EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:997:2: iv_ruleEnumReference= ruleEnumReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumReference_in_entryRuleEnumReference2062);
            iv_ruleEnumReference=ruleEnumReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumReference2072); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumReference"


    // $ANTLR start "ruleEnumReference"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1004:1: ruleEnumReference returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1007:28: ( (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1008:1: (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1008:1: (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1008:3: otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEnumReference2109); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumReferenceAccess().getEnumKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1012:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1013:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1013:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1014:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumReference2126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_1_0, grammarAccess.getEnumReferenceAccess().getIdIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumReferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_1_0, 
                      		"ID");
              	    
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
    // $ANTLR end "ruleEnumReference"


    // $ANTLR start "entryRuleEnumMemberList"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1038:1: entryRuleEnumMemberList returns [EObject current=null] : iv_ruleEnumMemberList= ruleEnumMemberList EOF ;
    public final EObject entryRuleEnumMemberList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMemberList = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1039:2: (iv_ruleEnumMemberList= ruleEnumMemberList EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1040:2: iv_ruleEnumMemberList= ruleEnumMemberList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumMemberListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList2167);
            iv_ruleEnumMemberList=ruleEnumMemberList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumMemberList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumMemberList2177); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumMemberList"


    // $ANTLR start "ruleEnumMemberList"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1047:1: ruleEnumMemberList returns [EObject current=null] : ( ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) ;
    public final EObject ruleEnumMemberList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_enumMember_0_0 = null;

        EObject lv_enumMember_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1050:28: ( ( ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1051:1: ( ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1051:1: ( ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1051:2: ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1051:2: ( (lv_enumMember_0_0= ruleEnumMember ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1052:1: (lv_enumMember_0_0= ruleEnumMember )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1052:1: (lv_enumMember_0_0= ruleEnumMember )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1053:3: lv_enumMember_0_0= ruleEnumMember
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_ruleEnumMemberList2223);
            lv_enumMember_0_0=ruleEnumMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnumMemberListRule());
              	        }
                     		add(
                     			current, 
                     			"enumMember",
                      		lv_enumMember_0_0, 
                      		"EnumMember");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1069:2: (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1069:4: otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEnumMemberList2236); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1073:1: ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1074:1: (lv_enumMember_2_0= ruleEnumMember )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1074:1: (lv_enumMember_2_0= ruleEnumMember )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1075:3: lv_enumMember_2_0= ruleEnumMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_ruleEnumMemberList2257);
            	    lv_enumMember_2_0=ruleEnumMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumMemberListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"enumMember",
            	              		lv_enumMember_2_0, 
            	              		"EnumMember");
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
    // $ANTLR end "ruleEnumMemberList"


    // $ANTLR start "entryRuleEnumMember"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1099:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1100:2: (iv_ruleEnumMember= ruleEnumMember EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1101:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumMemberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_entryRuleEnumMember2295);
            iv_ruleEnumMember=ruleEnumMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumMember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumMember2305); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEnumMember"


    // $ANTLR start "ruleEnumMember"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1108:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )? ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_constExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1111:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1112:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1112:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1112:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1112:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1113:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1113:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1114:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumMember2347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getEnumMemberAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumMemberRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1130:2: (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1130:4: otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) )
                    {
                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEnumMember2365); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1134:1: ( (lv_constExpr_2_0= ruleConstantExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1135:1: (lv_constExpr_2_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1135:1: (lv_constExpr_2_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1136:3: lv_constExpr_2_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumMemberAccess().getConstExprConstantExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleEnumMember2386);
                    lv_constExpr_2_0=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEnumMemberRule());
                      	        }
                             		set(
                             			current, 
                             			"constExpr",
                              		lv_constExpr_2_0, 
                              		"ConstantExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleEnumMember"


    // $ANTLR start "entryRuleDeclarators"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1160:1: entryRuleDeclarators returns [EObject current=null] : iv_ruleDeclarators= ruleDeclarators EOF ;
    public final EObject entryRuleDeclarators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarators = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1161:2: (iv_ruleDeclarators= ruleDeclarators EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1162:2: iv_ruleDeclarators= ruleDeclarators EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaratorsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_entryRuleDeclarators2424);
            iv_ruleDeclarators=ruleDeclarators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarators; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclarators2434); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDeclarators"


    // $ANTLR start "ruleDeclarators"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1169:1: ruleDeclarators returns [EObject current=null] : ( ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) ;
    public final EObject ruleDeclarators() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dec_0_0 = null;

        EObject lv_declaratorList_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1172:28: ( ( ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1173:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1173:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1173:2: ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1173:2: ( (lv_dec_0_0= ruleDeclarator ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1174:1: (lv_dec_0_0= ruleDeclarator )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1174:1: (lv_dec_0_0= ruleDeclarator )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1175:3: lv_dec_0_0= ruleDeclarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleDeclarators2480);
            lv_dec_0_0=ruleDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclaratorsRule());
              	        }
                     		set(
                     			current, 
                     			"dec",
                      		lv_dec_0_0, 
                      		"Declarator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1191:2: (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1191:4: otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDeclarators2493); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1195:1: ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1196:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1196:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1197:3: lv_declaratorList_2_0= ruleDeclarator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleDeclarators2514);
            	    lv_declaratorList_2_0=ruleDeclarator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDeclaratorsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declaratorList",
            	              		lv_declaratorList_2_0, 
            	              		"Declarator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // $ANTLR end "ruleDeclarators"


    // $ANTLR start "entryRuleDeclarator"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1221:1: entryRuleDeclarator returns [EObject current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final EObject entryRuleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarator = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1222:2: (iv_ruleDeclarator= ruleDeclarator EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1223:2: iv_ruleDeclarator= ruleDeclarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaratorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_entryRuleDeclarator2552);
            iv_ruleDeclarator=ruleDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclarator2562); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDeclarator"


    // $ANTLR start "ruleDeclarator"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1230:1: ruleDeclarator returns [EObject current=null] : ( ( (lv_pointer_0_0= ruleQualifiedPointerSpecification ) )* ( (lv_dc_1_0= ruleDirectDeclarator ) ) ) ;
    public final EObject ruleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject lv_pointer_0_0 = null;

        EObject lv_dc_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1233:28: ( ( ( (lv_pointer_0_0= ruleQualifiedPointerSpecification ) )* ( (lv_dc_1_0= ruleDirectDeclarator ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1234:1: ( ( (lv_pointer_0_0= ruleQualifiedPointerSpecification ) )* ( (lv_dc_1_0= ruleDirectDeclarator ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1234:1: ( ( (lv_pointer_0_0= ruleQualifiedPointerSpecification ) )* ( (lv_dc_1_0= ruleDirectDeclarator ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1234:2: ( (lv_pointer_0_0= ruleQualifiedPointerSpecification ) )* ( (lv_dc_1_0= ruleDirectDeclarator ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1234:2: ( (lv_pointer_0_0= ruleQualifiedPointerSpecification ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1235:1: (lv_pointer_0_0= ruleQualifiedPointerSpecification )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1235:1: (lv_pointer_0_0= ruleQualifiedPointerSpecification )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1236:3: lv_pointer_0_0= ruleQualifiedPointerSpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclaratorAccess().getPointerQualifiedPointerSpecificationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedPointerSpecification_in_ruleDeclarator2608);
            	    lv_pointer_0_0=ruleQualifiedPointerSpecification();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDeclaratorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pointer",
            	              		lv_pointer_0_0, 
            	              		"QualifiedPointerSpecification");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1252:3: ( (lv_dc_1_0= ruleDirectDeclarator ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1253:1: (lv_dc_1_0= ruleDirectDeclarator )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1253:1: (lv_dc_1_0= ruleDirectDeclarator )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1254:3: lv_dc_1_0= ruleDirectDeclarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclaratorAccess().getDcDirectDeclaratorParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2630);
            lv_dc_1_0=ruleDirectDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclaratorRule());
              	        }
                     		set(
                     			current, 
                     			"dc",
                      		lv_dc_1_0, 
                      		"DirectDeclarator");
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
    // $ANTLR end "ruleDeclarator"


    // $ANTLR start "entryRuleQualifiedPointerSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1278:1: entryRuleQualifiedPointerSpecification returns [EObject current=null] : iv_ruleQualifiedPointerSpecification= ruleQualifiedPointerSpecification EOF ;
    public final EObject entryRuleQualifiedPointerSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedPointerSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1279:2: (iv_ruleQualifiedPointerSpecification= ruleQualifiedPointerSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1280:2: iv_ruleQualifiedPointerSpecification= ruleQualifiedPointerSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedPointerSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedPointerSpecification_in_entryRuleQualifiedPointerSpecification2666);
            iv_ruleQualifiedPointerSpecification=ruleQualifiedPointerSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedPointerSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedPointerSpecification2676); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedPointerSpecification"


    // $ANTLR start "ruleQualifiedPointerSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1287:1: ruleQualifiedPointerSpecification returns [EObject current=null] : ( () otherlv_1= '*' ( (lv_typeQualifiers_2_0= ruleTypeQualifier ) )* ) ;
    public final EObject ruleQualifiedPointerSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_typeQualifiers_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1290:28: ( ( () otherlv_1= '*' ( (lv_typeQualifiers_2_0= ruleTypeQualifier ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1291:1: ( () otherlv_1= '*' ( (lv_typeQualifiers_2_0= ruleTypeQualifier ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1291:1: ( () otherlv_1= '*' ( (lv_typeQualifiers_2_0= ruleTypeQualifier ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1291:2: () otherlv_1= '*' ( (lv_typeQualifiers_2_0= ruleTypeQualifier ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1291:2: ()
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1292:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getQualifiedPointerSpecificationAccess().getQualifiedPointerSpecificationAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleQualifiedPointerSpecification2725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getQualifiedPointerSpecificationAccess().getAsteriskKeyword_1());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1304:1: ( (lv_typeQualifiers_2_0= ruleTypeQualifier ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=51 && LA19_0<=52)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1305:1: (lv_typeQualifiers_2_0= ruleTypeQualifier )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1305:1: (lv_typeQualifiers_2_0= ruleTypeQualifier )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1306:3: lv_typeQualifiers_2_0= ruleTypeQualifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQualifiedPointerSpecificationAccess().getTypeQualifiersTypeQualifierEnumRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeQualifier_in_ruleQualifiedPointerSpecification2746);
            	    lv_typeQualifiers_2_0=ruleTypeQualifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQualifiedPointerSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"typeQualifiers",
            	              		lv_typeQualifiers_2_0, 
            	              		"TypeQualifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // $ANTLR end "ruleQualifiedPointerSpecification"


    // $ANTLR start "entryRuleDirectDeclarator"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1330:1: entryRuleDirectDeclarator returns [EObject current=null] : iv_ruleDirectDeclarator= ruleDirectDeclarator EOF ;
    public final EObject entryRuleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectDeclarator = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1331:2: (iv_ruleDirectDeclarator= ruleDirectDeclarator EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1332:2: iv_ruleDirectDeclarator= ruleDirectDeclarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirectDeclaratorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2783);
            iv_ruleDirectDeclarator=ruleDirectDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDirectDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDirectDeclarator2793); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDirectDeclarator"


    // $ANTLR start "ruleDirectDeclarator"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1339:1: ruleDirectDeclarator returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_dec_2_0= ruleDeclarator ) ) otherlv_3= ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )* ) ;
    public final EObject ruleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_dec_2_0 = null;

        EObject lv_array_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1342:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_dec_2_0= ruleDeclarator ) ) otherlv_3= ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1343:1: ( ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_dec_2_0= ruleDeclarator ) ) otherlv_3= ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1343:1: ( ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_dec_2_0= ruleDeclarator ) ) otherlv_3= ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1343:2: ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_dec_2_0= ruleDeclarator ) ) otherlv_3= ')' ) ) ( (lv_array_4_0= ruleArraySpecification ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1343:2: ( ( (lv_name_0_0= RULE_ID ) ) | (otherlv_1= '(' ( (lv_dec_2_0= ruleDeclarator ) ) otherlv_3= ')' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==31) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1343:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1343:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1344:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1344:1: (lv_name_0_0= RULE_ID )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1345:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDirectDeclarator2836); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getDirectDeclaratorAccess().getNameIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDirectDeclaratorRule());
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
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1362:6: (otherlv_1= '(' ( (lv_dec_2_0= ruleDeclarator ) ) otherlv_3= ')' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1362:6: (otherlv_1= '(' ( (lv_dec_2_0= ruleDeclarator ) ) otherlv_3= ')' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1362:8: otherlv_1= '(' ( (lv_dec_2_0= ruleDeclarator ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDirectDeclarator2860); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDirectDeclaratorAccess().getLeftParenthesisKeyword_0_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1366:1: ( (lv_dec_2_0= ruleDeclarator ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1367:1: (lv_dec_2_0= ruleDeclarator )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1367:1: (lv_dec_2_0= ruleDeclarator )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1368:3: lv_dec_2_0= ruleDeclarator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDirectDeclaratorAccess().getDecDeclaratorParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleDirectDeclarator2881);
                    lv_dec_2_0=ruleDeclarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDirectDeclaratorRule());
                      	        }
                             		set(
                             			current, 
                             			"dec",
                              		lv_dec_2_0, 
                              		"Declarator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDirectDeclarator2893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getDirectDeclaratorAccess().getRightParenthesisKeyword_0_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1388:3: ( (lv_array_4_0= ruleArraySpecification ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1389:1: (lv_array_4_0= ruleArraySpecification )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1389:1: (lv_array_4_0= ruleArraySpecification )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1390:3: lv_array_4_0= ruleArraySpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDirectDeclaratorAccess().getArrayArraySpecificationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator2916);
            	    lv_array_4_0=ruleArraySpecification();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDirectDeclaratorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"array",
            	              		lv_array_4_0, 
            	              		"ArraySpecification");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // $ANTLR end "ruleDirectDeclarator"


    // $ANTLR start "entryRuleArraySpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1414:1: entryRuleArraySpecification returns [EObject current=null] : iv_ruleArraySpecification= ruleArraySpecification EOF ;
    public final EObject entryRuleArraySpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1415:2: (iv_ruleArraySpecification= ruleArraySpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1416:2: iv_ruleArraySpecification= ruleArraySpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification2953);
            iv_ruleArraySpecification=ruleArraySpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArraySpecification2963); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArraySpecification"


    // $ANTLR start "ruleArraySpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1423:1: ruleArraySpecification returns [EObject current=null] : ( ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' ) | (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' ) ) ;
    public final EObject ruleArraySpecification() throws RecognitionException {
        EObject current = null;

        Token lv_unspecifiedSize_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fixedSize_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1426:28: ( ( ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' ) | (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1427:1: ( ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' ) | (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1427:1: ( ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' ) | (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==34) ) {
                    alt22=1;
                }
                else if ( ((LA22_1>=RULE_ID && LA22_1<=RULE_STRING)||(LA22_1>=RULE_ADDITIVE_OPERATION && LA22_1<=RULE_INT)||LA22_1==RULE_UNARY_OPERATION||LA22_1==31||LA22_1==35) ) {
                    alt22=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1427:2: ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1427:2: ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1427:3: ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']'
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1427:3: ( (lv_unspecifiedSize_0_0= '[' ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1428:1: (lv_unspecifiedSize_0_0= '[' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1428:1: (lv_unspecifiedSize_0_0= '[' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1429:3: lv_unspecifiedSize_0_0= '['
                    {
                    lv_unspecifiedSize_0_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleArraySpecification3007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_unspecifiedSize_0_0, grammarAccess.getArraySpecificationAccess().getUnspecifiedSizeLeftSquareBracketKeyword_0_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArraySpecificationRule());
                      	        }
                             		setWithLastConsumed(current, "unspecifiedSize", true, "[");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleArraySpecification3032); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1447:6: (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1447:6: (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1447:8: otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleArraySpecification3052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1451:1: ( (lv_fixedSize_3_0= ruleConstantExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1452:1: (lv_fixedSize_3_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1452:1: (lv_fixedSize_3_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1453:3: lv_fixedSize_3_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArraySpecificationAccess().getFixedSizeConstantExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleArraySpecification3073);
                    lv_fixedSize_3_0=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArraySpecificationRule());
                      	        }
                             		set(
                             			current, 
                             			"fixedSize",
                              		lv_fixedSize_3_0, 
                              		"ConstantExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleArraySpecification3085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

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
    // $ANTLR end "ruleArraySpecification"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1481:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1482:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1483:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3123);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName3134); if (state.failed) return current;

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1490:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1493:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1494:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1494:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1494:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName3174); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1501:1: (kw= '.' this_ID_2= RULE_ID )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1502:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleQualifiedName3193); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName3208); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
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


    // $ANTLR start "entryRuleConstantDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1522:1: entryRuleConstantDefinition returns [EObject current=null] : iv_ruleConstantDefinition= ruleConstantDefinition EOF ;
    public final EObject entryRuleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1523:2: (iv_ruleConstantDefinition= ruleConstantDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1524:2: iv_ruleConstantDefinition= ruleConstantDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition3255);
            iv_ruleConstantDefinition=ruleConstantDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantDefinition3265); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantDefinition"


    // $ANTLR start "ruleConstantDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1531:1: ruleConstantDefinition returns [EObject current=null] : (otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? ) ;
    public final EObject ruleConstantDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1534:28: ( (otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1535:1: (otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1535:1: (otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1535:3: otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )?
            {
            otherlv_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleConstantDefinition3302); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1539:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1540:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1540:1: (lv_name_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1541:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstantDefinition3319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getConstantDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1557:2: ( (lv_expr_2_0= ruleConstantExpression ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_STRING)||(LA24_0>=RULE_ADDITIVE_OPERATION && LA24_0<=RULE_INT)||LA24_0==RULE_UNARY_OPERATION||LA24_0==31||LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1558:1: (lv_expr_2_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1558:1: (lv_expr_2_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1559:3: lv_expr_2_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantDefinitionAccess().getExprConstantExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleConstantDefinition3345);
                    lv_expr_2_0=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstantDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_2_0, 
                              		"ConstantExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleConstantDefinition"


    // $ANTLR start "entryRuleInterfaceDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1583:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1584:2: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1585:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition3382);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfaceDefinition3392); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInterfaceDefinition"


    // $ANTLR start "ruleInterfaceDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1592:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}' ) ;
    public final EObject ruleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_annotationsList_0_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_fqn2_5_0 = null;

        EObject lv_methodDef_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1595:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1596:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1596:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1596:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1596:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1597:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1597:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1598:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleInterfaceDefinition3438);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
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

            otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleInterfaceDefinition3451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1618:1: (otherlv_2= 'unmanaged' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==38) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1618:3: otherlv_2= 'unmanaged'
                    {
                    otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleInterfaceDefinition3464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_2());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1622:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1623:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1623:1: (lv_name_3_0= ruleQualifiedName )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1624:3: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getNameQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition3487);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1640:2: (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1640:4: otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInterfaceDefinition3500); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1644:1: ( (lv_fqn2_5_0= ruleQualifiedName ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1645:1: (lv_fqn2_5_0= ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1645:1: (lv_fqn2_5_0= ruleQualifiedName )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1646:3: lv_fqn2_5_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFqn2QualifiedNameParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition3521);
                    lv_fqn2_5_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"fqn2",
                              		lv_fqn2_5_0, 
                              		"QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInterfaceDefinition3535); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1666:1: ( (lv_methodDef_7_0= ruleMethodDefinition ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||(LA28_0>=24 && LA28_0<=25)||LA28_0==27||LA28_0==39||LA28_0==42||(LA28_0>=51 && LA28_0<=71)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1667:1: (lv_methodDef_7_0= ruleMethodDefinition )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1667:1: (lv_methodDef_7_0= ruleMethodDefinition )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1668:3: lv_methodDef_7_0= ruleMethodDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3556);
            	    lv_methodDef_7_0=ruleMethodDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInterfaceDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"methodDef",
            	              		lv_methodDef_7_0, 
            	              		"MethodDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInterfaceDefinition3569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getInterfaceDefinitionAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleInterfaceDefinition"


    // $ANTLR start "entryRuleMethodDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1696:1: entryRuleMethodDefinition returns [EObject current=null] : iv_ruleMethodDefinition= ruleMethodDefinition EOF ;
    public final EObject entryRuleMethodDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1697:2: (iv_ruleMethodDefinition= ruleMethodDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1698:2: iv_ruleMethodDefinition= ruleMethodDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3605);
            iv_ruleMethodDefinition=ruleMethodDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethodDefinition3615); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMethodDefinition"


    // $ANTLR start "ruleMethodDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1705:1: ruleMethodDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification ) )* ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';' ) ;
    public final EObject ruleMethodDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_annotationsList_0_0 = null;

        EObject lv_qualifiedTypeSpec_1_0 = null;

        EObject lv_pointerSpecification_2_0 = null;

        EObject lv_ParameterList_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1708:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification ) )* ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1709:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification ) )* ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1709:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification ) )* ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1709:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification ) )* ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1709:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1710:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1710:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1711:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleMethodDefinition3661);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodDefinitionRule());
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1727:3: ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1728:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1728:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1729:3: lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3683);
            lv_qualifiedTypeSpec_1_0=ruleQualifiedTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"qualifiedTypeSpec",
                      		lv_qualifiedTypeSpec_1_0, 
                      		"QualifiedTypeSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1745:2: ( (lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1746:1: (lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1746:1: (lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1747:3: lv_pointerSpecification_2_0= ruleQualifiedPointerSpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethodDefinitionAccess().getPointerSpecificationQualifiedPointerSpecificationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleQualifiedPointerSpecification_in_ruleMethodDefinition3704);
            	    lv_pointerSpecification_2_0=ruleQualifiedPointerSpecification();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMethodDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pointerSpecification",
            	              		lv_pointerSpecification_2_0, 
            	              		"QualifiedPointerSpecification");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1763:3: ( (lv_name_3_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1764:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1764:1: (lv_name_3_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1765:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMethodDefinition3722); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_3_0, grammarAccess.getMethodDefinitionAccess().getNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMethodDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_3_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1781:2: ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                switch ( input.LA(2) ) {
                case RULE_ID:
                case 24:
                case 25:
                case 27:
                case 42:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                    {
                    alt32=2;
                    }
                    break;
                case 39:
                    {
                    int LA32_3 = input.LA(3);

                    if ( (LA32_3==32) ) {
                        alt32=1;
                    }
                    else if ( (LA32_3==RULE_ID||(LA32_3>=30 && LA32_3<=31)||LA32_3==39||(LA32_3>=53 && LA32_3<=71)) ) {
                        alt32=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 32:
                    {
                    alt32=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1781:3: (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1781:3: (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1781:5: otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMethodDefinition3741); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_4_0_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1785:1: (otherlv_5= 'void' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==39) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1785:3: otherlv_5= 'void'
                            {
                            otherlv_5=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMethodDefinition3754); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getMethodDefinitionAccess().getVoidKeyword_4_0_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMethodDefinition3768); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_4_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1794:6: (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1794:6: (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1794:8: otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMethodDefinition3788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_4_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1798:1: ( (lv_ParameterList_8_0= ruleParameterList ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1799:1: (lv_ParameterList_8_0= ruleParameterList )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1799:1: (lv_ParameterList_8_0= ruleParameterList )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1800:3: lv_ParameterList_8_0= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_4_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterList_in_ruleMethodDefinition3809);
                    lv_ParameterList_8_0=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMethodDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"ParameterList",
                              		lv_ParameterList_8_0, 
                              		"ParameterList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleMethodDefinition3821); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_4_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMethodDefinition3835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getMethodDefinitionAccess().getSemicolonKeyword_5());
                  
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
    // $ANTLR end "ruleMethodDefinition"


    // $ANTLR start "entryRuleParameterList"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1832:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1833:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1834:2: iv_ruleParameterList= ruleParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameterList_in_entryRuleParameterList3871);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterList3881); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1841:1: ruleParameterList returns [EObject current=null] : ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )? ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_param_0_0 = null;

        EObject lv_params_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1844:28: ( ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1845:1: ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1845:1: ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1845:2: ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1845:2: ( (lv_param_0_0= ruleParameter ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1846:1: (lv_param_0_0= ruleParameter )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1846:1: (lv_param_0_0= ruleParameter )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1847:3: lv_param_0_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleParameterList3927);
            lv_param_0_0=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterListRule());
              	        }
                     		set(
                     			current, 
                     			"param",
                      		lv_param_0_0, 
                      		"Parameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1863:2: (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==28) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_ID||(LA33_1>=24 && LA33_1<=25)||LA33_1==27||LA33_1==39||LA33_1==42||(LA33_1>=51 && LA33_1<=73)) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1863:4: otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleParameterList3940); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1867:1: ( (lv_params_2_0= ruleParameter ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1868:1: (lv_params_2_0= ruleParameter )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1868:1: (lv_params_2_0= ruleParameter )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1869:3: lv_params_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleParameterList3961);
            	    lv_params_2_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParameterListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"params",
            	              		lv_params_2_0, 
            	              		"Parameter");
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1885:4: (otherlv_3= ',' otherlv_4= '...' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1885:6: otherlv_3= ',' otherlv_4= '...'
                    {
                    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleParameterList3976); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_2_0());
                          
                    }
                    otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleParameterList3988); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getParameterListAccess().getFullStopFullStopFullStopKeyword_2_1());
                          
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
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameter"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1901:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1902:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1903:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter4026);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter4036); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1910:1: ruleParameter returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_annotationsList_0_0 = null;

        Enumerator lv_ParameterQualifier_1_0 = null;

        EObject lv_qualifiedTypeSpec_2_0 = null;

        EObject lv_dec_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1913:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1914:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1914:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1914:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1914:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1915:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1915:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1916:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleParameter4082);
                    lv_annotationsList_0_0=ruleAnnotationsList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParameterRule());
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1932:3: ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=72 && LA36_0<=73)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1933:1: (lv_ParameterQualifier_1_0= ruleParameterQualifier )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1933:1: (lv_ParameterQualifier_1_0= ruleParameterQualifier )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1934:3: lv_ParameterQualifier_1_0= ruleParameterQualifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleParameterQualifier_in_ruleParameter4104);
            	    lv_ParameterQualifier_1_0=ruleParameterQualifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"ParameterQualifier",
            	              		lv_ParameterQualifier_1_0, 
            	              		"ParameterQualifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1950:3: ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1951:1: (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1951:1: (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1952:3: lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter4126);
            lv_qualifiedTypeSpec_2_0=ruleQualifiedTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"qualifiedTypeSpec",
                      		lv_qualifiedTypeSpec_2_0, 
                      		"QualifiedTypeSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1968:2: ( (lv_dec_3_0= ruleDeclarator ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1969:1: (lv_dec_3_0= ruleDeclarator )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1969:1: (lv_dec_3_0= ruleDeclarator )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1970:3: lv_dec_3_0= ruleDeclarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleParameter4147);
            lv_dec_3_0=ruleDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"dec",
                      		lv_dec_3_0, 
                      		"Declarator");
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleIncludeDirective"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1994:1: entryRuleIncludeDirective returns [EObject current=null] : iv_ruleIncludeDirective= ruleIncludeDirective EOF ;
    public final EObject entryRuleIncludeDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeDirective = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1995:2: (iv_ruleIncludeDirective= ruleIncludeDirective EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1996:2: iv_ruleIncludeDirective= ruleIncludeDirective EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeDirectiveRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective4183);
            iv_ruleIncludeDirective=ruleIncludeDirective();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIncludeDirective; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIncludeDirective4193); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIncludeDirective"


    // $ANTLR start "ruleIncludeDirective"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2003:1: ruleIncludeDirective returns [EObject current=null] : (otherlv_0= '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) ) ) ;
    public final EObject ruleIncludeDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importedURI_1_0=null;
        Token lv_includeID_2_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2006:28: ( (otherlv_0= '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2007:1: (otherlv_0= '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2007:1: (otherlv_0= '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2007:3: otherlv_0= '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) )
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleIncludeDirective4230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2011:1: ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_INCLUDE_LIB) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2011:2: ( (lv_importedURI_1_0= RULE_STRING ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2011:2: ( (lv_importedURI_1_0= RULE_STRING ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2012:1: (lv_importedURI_1_0= RULE_STRING )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2012:1: (lv_importedURI_1_0= RULE_STRING )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2013:3: lv_importedURI_1_0= RULE_STRING
                    {
                    lv_importedURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleIncludeDirective4248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_importedURI_1_0, grammarAccess.getIncludeDirectiveAccess().getImportedURISTRINGTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIncludeDirectiveRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"importedURI",
                              		lv_importedURI_1_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2030:6: ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2030:6: ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2031:1: (lv_includeID_2_0= RULE_INCLUDE_LIB )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2031:1: (lv_includeID_2_0= RULE_INCLUDE_LIB )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2032:3: lv_includeID_2_0= RULE_INCLUDE_LIB
                    {
                    lv_includeID_2_0=(Token)match(input,RULE_INCLUDE_LIB,FollowSets000.FOLLOW_RULE_INCLUDE_LIB_in_ruleIncludeDirective4276); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_includeID_2_0, grammarAccess.getIncludeDirectiveAccess().getIncludeIDINCLUDE_LIBTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getIncludeDirectiveRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"includeID",
                              		lv_includeID_2_0, 
                              		"INCLUDE_LIB");
                      	    
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
    // $ANTLR end "ruleIncludeDirective"


    // $ANTLR start "entryRuleAnnotationsList"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2056:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2057:2: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2058:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList4318);
            iv_ruleAnnotationsList=ruleAnnotationsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationsList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationsList4328); if (state.failed) return current;

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2065:1: ruleAnnotationsList returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2068:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2069:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2069:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2069:2: ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2069:2: ( (lv_annotations_0_0= ruleAnnotation ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2070:1: (lv_annotations_0_0= ruleAnnotation )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2070:1: (lv_annotations_0_0= ruleAnnotation )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2071:3: lv_annotations_0_0= ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotationsList4374);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2087:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==42) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2088:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2088:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2089:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotationsList4395);
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
            	    break loop38;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2113:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2114:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2115:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation4432);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation4442); if (state.failed) return current;

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2122:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_annotationParametersList_3_0 = null;

        EObject lv_annotationParametersList_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2125:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2126:1: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2126:1: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2126:3: otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAnnotation4479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2130:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2131:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2131:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2132:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleAnnotation4500);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2148:2: (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==31) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2148:4: otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAnnotation4513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2152:1: ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2153:1: (lv_annotationParametersList_3_0= ruleAnnotationValuePair )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2153:1: (lv_annotationParametersList_3_0= ruleAnnotationValuePair )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2154:3: lv_annotationParametersList_3_0= ruleAnnotationValuePair
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationParametersListAnnotationValuePairParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_ruleAnnotation4534);
                    lv_annotationParametersList_3_0=ruleAnnotationValuePair();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                      	        }
                             		add(
                             			current, 
                             			"annotationParametersList",
                              		lv_annotationParametersList_3_0, 
                              		"AnnotationValuePair");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2170:2: (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==28) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2170:4: otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAnnotation4547); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2174:1: ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) )
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2175:1: (lv_annotationParametersList_5_0= ruleAnnotationValuePair )
                    	    {
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2175:1: (lv_annotationParametersList_5_0= ruleAnnotationValuePair )
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2176:3: lv_annotationParametersList_5_0= ruleAnnotationValuePair
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationParametersListAnnotationValuePairParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_ruleAnnotation4568);
                    	    lv_annotationParametersList_5_0=ruleAnnotationValuePair();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAnnotationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"annotationParametersList",
                    	              		lv_annotationParametersList_5_0, 
                    	              		"AnnotationValuePair");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAnnotation4582); if (state.failed) return current;
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


    // $ANTLR start "entryRuleAnnotationValuePair"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2204:1: entryRuleAnnotationValuePair returns [EObject current=null] : iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF ;
    public final EObject entryRuleAnnotationValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValuePair = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2205:2: (iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2206:2: iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationValuePairRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_entryRuleAnnotationValuePair4620);
            iv_ruleAnnotationValuePair=ruleAnnotationValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationValuePair; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationValuePair4630); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotationValuePair"


    // $ANTLR start "ruleAnnotationValuePair"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2213:1: ruleAnnotationValuePair returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) ) ) ;
    public final EObject ruleAnnotationValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2216:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2217:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2217:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2217:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2217:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==29) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2217:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2217:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2218:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2218:1: (lv_name_0_0= RULE_ID )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2219:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotationValuePair4673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_0_0, grammarAccess.getAnnotationValuePairAccess().getNameIDTerminalRuleCall_0_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAnnotationValuePairRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAnnotationValuePair4690); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAnnotationValuePairAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2239:3: ( (lv_value_2_0= ruleAnnotationValue ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2240:1: (lv_value_2_0= ruleAnnotationValue )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2240:1: (lv_value_2_0= ruleAnnotationValue )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2241:3: lv_value_2_0= ruleAnnotationValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationValuePairAccess().getValueAnnotationValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_ruleAnnotationValuePair4713);
            lv_value_2_0=ruleAnnotationValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAnnotationValuePairRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"AnnotationValue");
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
    // $ANTLR end "ruleAnnotationValuePair"


    // $ANTLR start "entryRuleAnnotationValue"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2265:1: entryRuleAnnotationValue returns [EObject current=null] : iv_ruleAnnotationValue= ruleAnnotationValue EOF ;
    public final EObject entryRuleAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValue = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2266:2: (iv_ruleAnnotationValue= ruleAnnotationValue EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2267:2: iv_ruleAnnotationValue= ruleAnnotationValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue4749);
            iv_ruleAnnotationValue=ruleAnnotationValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationValue4759); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnnotationValue"


    // $ANTLR start "ruleAnnotationValue"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2274:1: ruleAnnotationValue returns [EObject current=null] : ( ( ( (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING ) ) ) | ( (lv_arrayValue_1_0= ruleArrayAnnotationValue ) ) ) ;
    public final EObject ruleAnnotationValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_5=null;
        AntlrDatatypeRuleToken lv_value_0_1 = null;

        AntlrDatatypeRuleToken lv_value_0_4 = null;

        EObject lv_arrayValue_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2277:28: ( ( ( ( (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING ) ) ) | ( (lv_arrayValue_1_0= ruleArrayAnnotationValue ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2278:1: ( ( ( (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING ) ) ) | ( (lv_arrayValue_1_0= ruleArrayAnnotationValue ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2278:1: ( ( ( (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING ) ) ) | ( (lv_arrayValue_1_0= ruleArrayAnnotationValue ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ID && LA43_0<=RULE_STRING)||(LA43_0>=RULE_BOOLEAN && LA43_0<=RULE_INT)||LA43_0==43) ) {
                alt43=1;
            }
            else if ( (LA43_0==22) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2278:2: ( ( (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING ) ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2278:2: ( ( (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING ) ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2279:1: ( (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2279:1: ( (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2280:1: (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2280:1: (lv_value_0_1= rulesignedINT | lv_value_0_2= 'null' | lv_value_0_3= RULE_BOOLEAN | lv_value_0_4= ruleQualifiedName | lv_value_0_5= RULE_STRING )
                    int alt42=5;
                    switch ( input.LA(1) ) {
                    case RULE_ADDITIVE_OPERATION:
                    case RULE_INT:
                        {
                        alt42=1;
                        }
                        break;
                    case 43:
                        {
                        alt42=2;
                        }
                        break;
                    case RULE_BOOLEAN:
                        {
                        alt42=3;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt42=4;
                        }
                        break;
                    case RULE_STRING:
                        {
                        alt42=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }

                    switch (alt42) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2281:3: lv_value_0_1= rulesignedINT
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAnnotationValueAccess().getValueSignedINTParserRuleCall_0_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleAnnotationValue4807);
                            lv_value_0_1=rulesignedINT();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAnnotationValueRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_0_1, 
                                      		"signedINT");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2296:8: lv_value_0_2= 'null'
                            {
                            lv_value_0_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleAnnotationValue4823); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_value_0_2, grammarAccess.getAnnotationValueAccess().getValueNullKeyword_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAnnotationValueRule());
                              	        }
                                     		setWithLastConsumed(current, "value", lv_value_0_2, null);
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2308:8: lv_value_0_3= RULE_BOOLEAN
                            {
                            lv_value_0_3=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleAnnotationValue4851); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_value_0_3, grammarAccess.getAnnotationValueAccess().getValueBOOLEANTerminalRuleCall_0_0_2()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAnnotationValueRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"value",
                                      		lv_value_0_3, 
                                      		"BOOLEAN");
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2323:8: lv_value_0_4= ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAnnotationValueAccess().getValueQualifiedNameParserRuleCall_0_0_3()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleAnnotationValue4875);
                            lv_value_0_4=ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAnnotationValueRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_0_4, 
                                      		"QualifiedName");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 5 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2338:8: lv_value_0_5= RULE_STRING
                            {
                            lv_value_0_5=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAnnotationValue4890); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_value_0_5, grammarAccess.getAnnotationValueAccess().getValueSTRINGTerminalRuleCall_0_0_4()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAnnotationValueRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"value",
                                      		lv_value_0_5, 
                                      		"STRING");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2357:6: ( (lv_arrayValue_1_0= ruleArrayAnnotationValue ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2357:6: ( (lv_arrayValue_1_0= ruleArrayAnnotationValue ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2358:1: (lv_arrayValue_1_0= ruleArrayAnnotationValue )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2358:1: (lv_arrayValue_1_0= ruleArrayAnnotationValue )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2359:3: lv_arrayValue_1_0= ruleArrayAnnotationValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationValueAccess().getArrayValueArrayAnnotationValueParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleArrayAnnotationValue_in_ruleAnnotationValue4925);
                    lv_arrayValue_1_0=ruleArrayAnnotationValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAnnotationValueRule());
                      	        }
                             		set(
                             			current, 
                             			"arrayValue",
                              		lv_arrayValue_1_0, 
                              		"ArrayAnnotationValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleAnnotationValue"


    // $ANTLR start "entryRuleArrayAnnotationValue"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2383:1: entryRuleArrayAnnotationValue returns [EObject current=null] : iv_ruleArrayAnnotationValue= ruleArrayAnnotationValue EOF ;
    public final EObject entryRuleArrayAnnotationValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayAnnotationValue = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2384:2: (iv_ruleArrayAnnotationValue= ruleArrayAnnotationValue EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2385:2: iv_ruleArrayAnnotationValue= ruleArrayAnnotationValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayAnnotationValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArrayAnnotationValue_in_entryRuleArrayAnnotationValue4961);
            iv_ruleArrayAnnotationValue=ruleArrayAnnotationValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayAnnotationValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArrayAnnotationValue4971); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArrayAnnotationValue"


    // $ANTLR start "ruleArrayAnnotationValue"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2392:1: ruleArrayAnnotationValue returns [EObject current=null] : (otherlv_0= '{' ( (lv_values_1_0= ruleAnnotationValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleArrayAnnotationValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2395:28: ( (otherlv_0= '{' ( (lv_values_1_0= ruleAnnotationValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2396:1: (otherlv_0= '{' ( (lv_values_1_0= ruleAnnotationValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2396:1: (otherlv_0= '{' ( (lv_values_1_0= ruleAnnotationValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2396:3: otherlv_0= '{' ( (lv_values_1_0= ruleAnnotationValue ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleArrayAnnotationValue5008); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayAnnotationValueAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2400:1: ( (lv_values_1_0= ruleAnnotationValue ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2401:1: (lv_values_1_0= ruleAnnotationValue )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2401:1: (lv_values_1_0= ruleAnnotationValue )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2402:3: lv_values_1_0= ruleAnnotationValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayAnnotationValueAccess().getValuesAnnotationValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5029);
            lv_values_1_0=ruleAnnotationValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayAnnotationValueRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_1_0, 
                      		"AnnotationValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2418:2: (otherlv_2= ',' ( (lv_values_3_0= ruleAnnotationValue ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==28) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2418:4: otherlv_2= ',' ( (lv_values_3_0= ruleAnnotationValue ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleArrayAnnotationValue5042); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getArrayAnnotationValueAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2422:1: ( (lv_values_3_0= ruleAnnotationValue ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2423:1: (lv_values_3_0= ruleAnnotationValue )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2423:1: (lv_values_3_0= ruleAnnotationValue )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2424:3: lv_values_3_0= ruleAnnotationValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayAnnotationValueAccess().getValuesAnnotationValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5063);
            	    lv_values_3_0=ruleAnnotationValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArrayAnnotationValueRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_3_0, 
            	              		"AnnotationValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleArrayAnnotationValue5077); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayAnnotationValueAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleArrayAnnotationValue"


    // $ANTLR start "entryRulesignedINT"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2452:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2453:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2454:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedINTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_entryRulesignedINT5114);
            iv_rulesignedINT=rulesignedINT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignedINT5125); if (state.failed) return current;

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2461:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ADDITIVE_OPERATION_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2464:28: ( ( (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2465:1: ( (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2465:1: ( (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2465:2: (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2465:2: (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ADDITIVE_OPERATION) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2465:7: this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION
                    {
                    this_ADDITIVE_OPERATION_0=(Token)match(input,RULE_ADDITIVE_OPERATION,FollowSets000.FOLLOW_RULE_ADDITIVE_OPERATION_in_rulesignedINT5166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ADDITIVE_OPERATION_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ADDITIVE_OPERATION_0, grammarAccess.getSignedINTAccess().getADDITIVE_OPERATIONTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulesignedINT5188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getSignedINTAccess().getINTTerminalRuleCall_1()); 
                  
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


    // $ANTLR start "entryRuleConstantExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2487:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2488:2: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2489:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression5233);
            iv_ruleConstantExpression=ruleConstantExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantExpression5243); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstantExpression"


    // $ANTLR start "ruleConstantExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2496:1: ruleConstantExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2499:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2501:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConstantExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleConstantExpression5292);
            this_LogicalOrExpression_0=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_LogicalOrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
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
    // $ANTLR end "ruleConstantExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2520:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2521:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2522:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression5326);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalOrExpression5336); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2529:1: ruleLogicalOrExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2532:28: ( ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2533:1: ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2533:1: ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2533:2: ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2533:2: ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2534:1: (lv_leftExpr_0_0= ruleLogicalAndExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2534:1: (lv_leftExpr_0_0= ruleLogicalAndExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2535:3: lv_leftExpr_0_0= ruleLogicalAndExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLeftExprLogicalAndExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5382);
            lv_leftExpr_0_0=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"leftExpr",
                      		lv_leftExpr_0_0, 
                      		"LogicalAndExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2551:2: (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2551:4: otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) )
                    {
                    otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleLogicalOrExpression5395); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2555:1: ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2556:1: (lv_rightExpr_2_0= ruleLogicalOrExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2556:1: (lv_rightExpr_2_0= ruleLogicalOrExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2557:3: lv_rightExpr_2_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightExprLogicalOrExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleLogicalOrExpression5416);
                    lv_rightExpr_2_0=ruleLogicalOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicalOrExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_2_0, 
                              		"LogicalOrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2581:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2582:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2583:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression5454);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalAndExpression5464); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2590:1: ruleLogicalAndExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2593:28: ( ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2594:1: ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2594:1: ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2594:2: ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2594:2: ( (lv_leftExpr_0_0= ruleOrExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2595:1: (lv_leftExpr_0_0= ruleOrExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2595:1: (lv_leftExpr_0_0= ruleOrExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2596:3: lv_leftExpr_0_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLeftExprOrExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleLogicalAndExpression5510);
            lv_leftExpr_0_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"leftExpr",
                      		lv_leftExpr_0_0, 
                      		"OrExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2612:2: (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==45) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2612:4: otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) )
                    {
                    otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleLogicalAndExpression5523); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2616:1: ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2617:1: (lv_rightExpr_2_0= ruleLogicalAndExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2617:1: (lv_rightExpr_2_0= ruleLogicalAndExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2618:3: lv_rightExpr_2_0= ruleLogicalAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightExprLogicalAndExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalAndExpression5544);
                    lv_rightExpr_2_0=ruleLogicalAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLogicalAndExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_2_0, 
                              		"LogicalAndExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2642:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2643:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2644:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression5582);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression5592); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2651:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2654:28: ( ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2655:1: ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2655:1: ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2655:2: ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2655:2: ( (lv_leftExpr_0_0= ruleXorExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2656:1: (lv_leftExpr_0_0= ruleXorExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2656:1: (lv_leftExpr_0_0= ruleXorExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2657:3: lv_leftExpr_0_0= ruleXorExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrExpressionAccess().getLeftExprXorExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_ruleOrExpression5638);
            lv_leftExpr_0_0=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"leftExpr",
                      		lv_leftExpr_0_0, 
                      		"XorExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2673:2: (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==46) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2673:4: otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) )
                    {
                    otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleOrExpression5651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2677:1: ( (lv_rightExpr_2_0= ruleOrExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2678:1: (lv_rightExpr_2_0= ruleOrExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2678:1: (lv_rightExpr_2_0= ruleOrExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2679:3: lv_rightExpr_2_0= ruleOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightExprOrExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleOrExpression5672);
                    lv_rightExpr_2_0=ruleOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_2_0, 
                              		"OrExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleXorExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2703:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2704:2: (iv_ruleXorExpression= ruleXorExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2705:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXorExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_entryRuleXorExpression5710);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXorExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXorExpression5720); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2712:1: ruleXorExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2715:28: ( ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2716:1: ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2716:1: ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2716:2: ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2716:2: ( (lv_leftExpr_0_0= ruleAndExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2717:1: (lv_leftExpr_0_0= ruleAndExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2717:1: (lv_leftExpr_0_0= ruleAndExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2718:3: lv_leftExpr_0_0= ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXorExpressionAccess().getLeftExprAndExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleXorExpression5766);
            lv_leftExpr_0_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXorExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"leftExpr",
                      		lv_leftExpr_0_0, 
                      		"AndExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2734:2: (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==47) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2734:4: otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) )
                    {
                    otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleXorExpression5779); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXorExpressionAccess().getCircumflexAccentKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2738:1: ( (lv_rightExpr_2_0= ruleXorExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2739:1: (lv_rightExpr_2_0= ruleXorExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2739:1: (lv_rightExpr_2_0= ruleXorExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2740:3: lv_rightExpr_2_0= ruleXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXorExpressionAccess().getRightExprXorExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_ruleXorExpression5800);
                    lv_rightExpr_2_0=ruleXorExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXorExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_2_0, 
                              		"XorExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2764:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2765:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2766:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression5838);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression5848); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2773:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2776:28: ( ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2777:1: ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2777:1: ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2777:2: ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2777:2: ( (lv_leftExpr_0_0= ruleShiftExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2778:1: (lv_leftExpr_0_0= ruleShiftExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2778:1: (lv_leftExpr_0_0= ruleShiftExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2779:3: lv_leftExpr_0_0= ruleShiftExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAndExpressionAccess().getLeftExprShiftExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_ruleAndExpression5894);
            lv_leftExpr_0_0=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"leftExpr",
                      		lv_leftExpr_0_0, 
                      		"ShiftExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2795:2: (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==48) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2795:4: otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) )
                    {
                    otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleAndExpression5907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2799:1: ( (lv_rightExpr_2_0= ruleAndExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2800:1: (lv_rightExpr_2_0= ruleAndExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2800:1: (lv_rightExpr_2_0= ruleAndExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2801:3: lv_rightExpr_2_0= ruleAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightExprAndExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleAndExpression5928);
                    lv_rightExpr_2_0=ruleAndExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_2_0, 
                              		"AndExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleShiftExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2825:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2826:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2827:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression5966);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShiftExpression5976); if (state.failed) return current;

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
    // $ANTLR end "entryRuleShiftExpression"


    // $ANTLR start "ruleShiftExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2834:1: ruleShiftExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2837:28: ( ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2838:1: ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2838:1: ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2838:2: ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2838:2: ( (lv_leftExpr_0_0= ruleAdditiveExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2839:1: (lv_leftExpr_0_0= ruleAdditiveExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2839:1: (lv_leftExpr_0_0= ruleAdditiveExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2840:3: lv_leftExpr_0_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getLeftExprAdditiveExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression6022);
            lv_leftExpr_0_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"leftExpr",
                      		lv_leftExpr_0_0, 
                      		"AdditiveExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2856:2: ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_SHIFT_OPERATION) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2856:3: ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2856:3: ( (lv_op_1_0= RULE_SHIFT_OPERATION ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2857:1: (lv_op_1_0= RULE_SHIFT_OPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2857:1: (lv_op_1_0= RULE_SHIFT_OPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2858:3: lv_op_1_0= RULE_SHIFT_OPERATION
                    {
                    lv_op_1_0=(Token)match(input,RULE_SHIFT_OPERATION,FollowSets000.FOLLOW_RULE_SHIFT_OPERATION_in_ruleShiftExpression6040); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_op_1_0, grammarAccess.getShiftExpressionAccess().getOpSHIFT_OPERATIONTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getShiftExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"op",
                              		lv_op_1_0, 
                              		"SHIFT_OPERATION");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2874:2: ( (lv_rightExpr_2_0= ruleShiftExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2875:1: (lv_rightExpr_2_0= ruleShiftExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2875:1: (lv_rightExpr_2_0= ruleShiftExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2876:3: lv_rightExpr_2_0= ruleShiftExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightExprShiftExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_ruleShiftExpression6066);
                    lv_rightExpr_2_0=ruleShiftExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getShiftExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_2_0, 
                              		"ShiftExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleShiftExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2900:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2901:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2902:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression6104);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditiveExpression6114); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2909:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2912:28: ( ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2913:1: ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2913:1: ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2913:2: ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2913:2: ( (lv_leftExpr_0_0= ruleMulExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2914:1: (lv_leftExpr_0_0= ruleMulExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2914:1: (lv_leftExpr_0_0= ruleMulExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2915:3: lv_leftExpr_0_0= ruleMulExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getLeftExprMulExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_ruleAdditiveExpression6160);
            lv_leftExpr_0_0=ruleMulExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"leftExpr",
                      		lv_leftExpr_0_0, 
                      		"MulExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2931:2: ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ADDITIVE_OPERATION) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2931:3: ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2931:3: ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2932:1: (lv_op_1_0= RULE_ADDITIVE_OPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2932:1: (lv_op_1_0= RULE_ADDITIVE_OPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2933:3: lv_op_1_0= RULE_ADDITIVE_OPERATION
                    {
                    lv_op_1_0=(Token)match(input,RULE_ADDITIVE_OPERATION,FollowSets000.FOLLOW_RULE_ADDITIVE_OPERATION_in_ruleAdditiveExpression6178); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_op_1_0, grammarAccess.getAdditiveExpressionAccess().getOpADDITIVE_OPERATIONTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAdditiveExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"op",
                              		lv_op_1_0, 
                              		"ADDITIVE_OPERATION");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2949:2: ( (lv_rightExpr_2_0= ruleAdditiveExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2950:1: (lv_rightExpr_2_0= ruleAdditiveExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2950:1: (lv_rightExpr_2_0= ruleAdditiveExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2951:3: lv_rightExpr_2_0= ruleAdditiveExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_ruleAdditiveExpression6204);
                    lv_rightExpr_2_0=ruleAdditiveExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_2_0, 
                              		"AdditiveExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMulExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2975:1: entryRuleMulExpression returns [EObject current=null] : iv_ruleMulExpression= ruleMulExpression EOF ;
    public final EObject entryRuleMulExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2976:2: (iv_ruleMulExpression= ruleMulExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2977:2: iv_ruleMulExpression= ruleMulExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_entryRuleMulExpression6242);
            iv_ruleMulExpression=ruleMulExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMulExpression6252); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMulExpression"


    // $ANTLR start "ruleMulExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2984:1: ruleMulExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? ) ;
    public final EObject ruleMulExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2987:28: ( ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2988:1: ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2988:1: ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2988:2: ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2988:2: ( (lv_leftExpr_0_0= ruleCastExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2989:1: (lv_leftExpr_0_0= ruleCastExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2989:1: (lv_leftExpr_0_0= ruleCastExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2990:3: lv_leftExpr_0_0= ruleCastExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMulExpressionAccess().getLeftExprCastExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_ruleMulExpression6298);
            lv_leftExpr_0_0=ruleCastExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMulExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"leftExpr",
                      		lv_leftExpr_0_0, 
                      		"CastExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3006:2: ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_MUL_OPERATION) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3006:3: ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3006:3: ( (lv_op_1_0= RULE_MUL_OPERATION ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3007:1: (lv_op_1_0= RULE_MUL_OPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3007:1: (lv_op_1_0= RULE_MUL_OPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3008:3: lv_op_1_0= RULE_MUL_OPERATION
                    {
                    lv_op_1_0=(Token)match(input,RULE_MUL_OPERATION,FollowSets000.FOLLOW_RULE_MUL_OPERATION_in_ruleMulExpression6316); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_op_1_0, grammarAccess.getMulExpressionAccess().getOpMUL_OPERATIONTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMulExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"op",
                              		lv_op_1_0, 
                              		"MUL_OPERATION");
                      	    
                    }

                    }


                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3024:2: ( (lv_rightExpr_2_0= ruleMulExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3025:1: (lv_rightExpr_2_0= ruleMulExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3025:1: (lv_rightExpr_2_0= ruleMulExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3026:3: lv_rightExpr_2_0= ruleMulExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMulExpressionAccess().getRightExprMulExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_ruleMulExpression6342);
                    lv_rightExpr_2_0=ruleMulExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMulExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightExpr",
                              		lv_rightExpr_2_0, 
                              		"MulExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "ruleMulExpression"


    // $ANTLR start "entryRuleCastExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3050:1: entryRuleCastExpression returns [EObject current=null] : iv_ruleCastExpression= ruleCastExpression EOF ;
    public final EObject entryRuleCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3051:2: (iv_ruleCastExpression= ruleCastExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3052:2: iv_ruleCastExpression= ruleCastExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCastExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_entryRuleCastExpression6380);
            iv_ruleCastExpression=ruleCastExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCastExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCastExpression6390); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCastExpression"


    // $ANTLR start "ruleCastExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3059:1: ruleCastExpression returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_unaryExpr_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3062:28: ( ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3063:1: ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3063:1: ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==31) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                case RULE_ADDITIVE_OPERATION:
                case RULE_INT:
                case RULE_UNARY_OPERATION:
                case 31:
                case 35:
                    {
                    alt54=2;
                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_ADDITIVE_OPERATION:
                    case RULE_SHIFT_OPERATION:
                    case RULE_MUL_OPERATION:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                        {
                        alt54=2;
                        }
                        break;
                    case 32:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case RULE_SHIFT_OPERATION:
                        case RULE_MUL_OPERATION:
                        case 19:
                        case 20:
                        case 21:
                        case 23:
                        case 24:
                        case 25:
                        case 27:
                        case 28:
                        case 32:
                        case 34:
                        case 36:
                        case 41:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                            {
                            alt54=2;
                            }
                            break;
                        case RULE_ADDITIVE_OPERATION:
                            {
                            int LA54_6 = input.LA(5);

                            if ( (LA54_6==RULE_INT) ) {
                                int LA54_7 = input.LA(6);

                                if ( (synpred61_InternalFractalIdt()) ) {
                                    alt54=1;
                                }
                                else if ( (true) ) {
                                    alt54=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 54, 7, input);

                                    throw nvae;
                                }
                            }
                            else if ( ((LA54_6>=RULE_ID && LA54_6<=RULE_STRING)||LA54_6==RULE_ADDITIVE_OPERATION||LA54_6==RULE_UNARY_OPERATION||LA54_6==31||LA54_6==35) ) {
                                alt54=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 54, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                        case RULE_STRING:
                        case RULE_INT:
                        case RULE_UNARY_OPERATION:
                        case 31:
                        case 35:
                            {
                            alt54=1;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 54, 5, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 35:
                        {
                        alt54=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 54, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 24:
                case 25:
                case 27:
                case 39:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                    {
                    alt54=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_STRING)||(LA54_0>=RULE_ADDITIVE_OPERATION && LA54_0<=RULE_INT)||LA54_0==RULE_UNARY_OPERATION||LA54_0==35) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3063:2: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3063:2: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3063:4: otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) )
                    {
                    otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCastExpression6428); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCastExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3067:1: ( (lv_type_1_0= ruleQualifiedTypeSpecification ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3068:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3068:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3069:3: lv_type_1_0= ruleQualifiedTypeSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCastExpressionAccess().getTypeQualifiedTypeSpecificationParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleCastExpression6449);
                    lv_type_1_0=ruleQualifiedTypeSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCastExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_1_0, 
                              		"QualifiedTypeSpecification");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCastExpression6461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCastExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3089:1: ( (lv_expr_3_0= ruleCastExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3090:1: (lv_expr_3_0= ruleCastExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3090:1: (lv_expr_3_0= ruleCastExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3091:3: lv_expr_3_0= ruleCastExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCastExpressionAccess().getExprCastExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_ruleCastExpression6482);
                    lv_expr_3_0=ruleCastExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCastExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_3_0, 
                              		"CastExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3108:6: ( (lv_unaryExpr_4_0= ruleUnaryExpression ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3108:6: ( (lv_unaryExpr_4_0= ruleUnaryExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3109:1: (lv_unaryExpr_4_0= ruleUnaryExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3109:1: (lv_unaryExpr_4_0= ruleUnaryExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3110:3: lv_unaryExpr_4_0= ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCastExpressionAccess().getUnaryExprUnaryExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleCastExpression6510);
                    lv_unaryExpr_4_0=ruleUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCastExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"unaryExpr",
                              		lv_unaryExpr_4_0, 
                              		"UnaryExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


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
    // $ANTLR end "ruleCastExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3134:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3135:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3136:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression6546);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression6556); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3143:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_unaryExpr_0_0=null;
        EObject lv_primaryExpr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3146:28: ( ( ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3147:1: ( ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3147:1: ( ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3147:2: ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3147:2: ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_UNARY_OPERATION) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3148:1: (lv_unaryExpr_0_0= RULE_UNARY_OPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3148:1: (lv_unaryExpr_0_0= RULE_UNARY_OPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3149:3: lv_unaryExpr_0_0= RULE_UNARY_OPERATION
                    {
                    lv_unaryExpr_0_0=(Token)match(input,RULE_UNARY_OPERATION,FollowSets000.FOLLOW_RULE_UNARY_OPERATION_in_ruleUnaryExpression6598); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_unaryExpr_0_0, grammarAccess.getUnaryExpressionAccess().getUnaryExprUNARY_OPERATIONTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getUnaryExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"unaryExpr",
                              		lv_unaryExpr_0_0, 
                              		"UNARY_OPERATION");
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3165:3: ( (lv_primaryExpr_1_0= rulePrimaryExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3166:1: (lv_primaryExpr_1_0= rulePrimaryExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3166:1: (lv_primaryExpr_1_0= rulePrimaryExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3167:3: lv_primaryExpr_1_0= rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExprPrimaryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression6625);
            lv_primaryExpr_1_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"primaryExpr",
                      		lv_primaryExpr_1_0, 
                      		"PrimaryExpression");
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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3191:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3192:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3193:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6661);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression6671); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3200:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_literal_0_0 = null;

        EObject this_ConstantExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3203:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3204:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3204:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_ID && LA56_0<=RULE_STRING)||(LA56_0>=RULE_ADDITIVE_OPERATION && LA56_0<=RULE_INT)||LA56_0==35) ) {
                alt56=1;
            }
            else if ( (LA56_0==31) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3204:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3204:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3205:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3205:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3206:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rulePrimaryExpression6717);
                    lv_literal_0_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"literal",
                              		lv_literal_0_0, 
                              		"Literal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3223:6: (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3223:6: (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3223:8: otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_rulePrimaryExpression6736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstantExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_rulePrimaryExpression6761);
                    this_ConstantExpression_2=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulePrimaryExpression6772); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_2());
                          
                    }

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleLiteral"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3251:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3252:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3253:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral6810);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral6821); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3260:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_FloatingPointLiteral_2= ruleFloatingPointLiteral ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_FloatingPointLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3263:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_FloatingPointLiteral_2= ruleFloatingPointLiteral ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3264:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_FloatingPointLiteral_2= ruleFloatingPointLiteral )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3264:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_FloatingPointLiteral_2= ruleFloatingPointLiteral )
            int alt57=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt57=1;
                }
                break;
            case RULE_STRING:
                {
                alt57=2;
                }
                break;
            case RULE_ADDITIVE_OPERATION:
            case RULE_INT:
            case 35:
                {
                alt57=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3264:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLiteral6861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getLiteralAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3272:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLiteral6887); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3281:5: this_FloatingPointLiteral_2= ruleFloatingPointLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatingPointLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatingPointLiteral_in_ruleLiteral6920);
                    this_FloatingPointLiteral_2=ruleFloatingPointLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FloatingPointLiteral_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleFloatingPointLiteral"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3299:1: entryRuleFloatingPointLiteral returns [String current=null] : iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF ;
    public final String entryRuleFloatingPointLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPointLiteral = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3300:2: (iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3301:2: iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatingPointLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral6966);
            iv_ruleFloatingPointLiteral=ruleFloatingPointLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatingPointLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatingPointLiteral6977); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFloatingPointLiteral"


    // $ANTLR start "ruleFloatingPointLiteral"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3308:1: ruleFloatingPointLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) ) ;
    public final AntlrDatatypeRuleToken ruleFloatingPointLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_FDSYMBOL_4=null;
        Token this_FDSYMBOL_8=null;
        Token this_FDSYMBOL_11=null;
        Token this_FDSYMBOL_14=null;
        AntlrDatatypeRuleToken this_signedINT_0 = null;

        AntlrDatatypeRuleToken this_signedINT_2 = null;

        AntlrDatatypeRuleToken this_Exponent_3 = null;

        AntlrDatatypeRuleToken this_signedINT_6 = null;

        AntlrDatatypeRuleToken this_Exponent_7 = null;

        AntlrDatatypeRuleToken this_signedINT_9 = null;

        AntlrDatatypeRuleToken this_Exponent_10 = null;

        AntlrDatatypeRuleToken this_signedINT_12 = null;

        AntlrDatatypeRuleToken this_Exponent_13 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3311:28: ( ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3312:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3312:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) )
            int alt70=4;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3312:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3312:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3312:3: (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3312:3: (this_signedINT_0= rulesignedINT )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( ((LA58_0>=RULE_ADDITIVE_OPERATION && LA58_0<=RULE_INT)) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3313:5: this_signedINT_0= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_0()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7026);
                    	    this_signedINT_0=rulesignedINT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_signedINT_0);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt58 >= 1 ) break loop58;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
                    } while (true);

                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleFloatingPointLiteral7046); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatingPointLiteralAccess().getFullStopKeyword_0_1()); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3329:1: (this_signedINT_2= rulesignedINT )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_INT) ) {
                            int LA59_2 = input.LA(2);

                            if ( (synpred67_InternalFractalIdt()) ) {
                                alt59=1;
                            }


                        }
                        else if ( (LA59_0==RULE_ADDITIVE_OPERATION) ) {
                            int LA59_3 = input.LA(2);

                            if ( (LA59_3==RULE_INT) ) {
                                int LA59_5 = input.LA(3);

                                if ( (synpred67_InternalFractalIdt()) ) {
                                    alt59=1;
                                }


                            }


                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3330:5: this_signedINT_2= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_2()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7069);
                    	    this_signedINT_2=rulesignedINT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_signedINT_2);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3340:3: (this_Exponent_3= ruleExponent )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==RULE_INT||(LA60_0>=49 && LA60_0<=50)) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3341:5: this_Exponent_3= ruleExponent
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_0_3()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7099);
                            this_Exponent_3=ruleExponent();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Exponent_3);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3351:3: (this_FDSYMBOL_4= RULE_FDSYMBOL )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_FDSYMBOL) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3351:8: this_FDSYMBOL_4= RULE_FDSYMBOL
                            {
                            this_FDSYMBOL_4=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7122); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_FDSYMBOL_4);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_FDSYMBOL_4, grammarAccess.getFloatingPointLiteralAccess().getFDSYMBOLTerminalRuleCall_0_4()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3359:6: (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3359:6: (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3360:2: kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )?
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleFloatingPointLiteral7150); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatingPointLiteralAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3365:1: (this_signedINT_6= rulesignedINT )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==RULE_INT) ) {
                            int LA62_2 = input.LA(2);

                            if ( (synpred71_InternalFractalIdt()) ) {
                                alt62=1;
                            }


                        }
                        else if ( (LA62_0==RULE_ADDITIVE_OPERATION) ) {
                            int LA62_3 = input.LA(2);

                            if ( (LA62_3==RULE_INT) ) {
                                int LA62_5 = input.LA(3);

                                if ( (synpred71_InternalFractalIdt()) ) {
                                    alt62=1;
                                }


                            }


                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3366:5: this_signedINT_6= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7173);
                    	    this_signedINT_6=rulesignedINT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_signedINT_6);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt62 >= 1 ) break loop62;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
                    } while (true);

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3376:3: (this_Exponent_7= ruleExponent )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_INT||(LA63_0>=49 && LA63_0<=50)) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3377:5: this_Exponent_7= ruleExponent
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_1_2()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7203);
                            this_Exponent_7=ruleExponent();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Exponent_7);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3387:3: (this_FDSYMBOL_8= RULE_FDSYMBOL )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==RULE_FDSYMBOL) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3387:8: this_FDSYMBOL_8= RULE_FDSYMBOL
                            {
                            this_FDSYMBOL_8=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7226); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_FDSYMBOL_8);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_FDSYMBOL_8, grammarAccess.getFloatingPointLiteralAccess().getFDSYMBOLTerminalRuleCall_1_3()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3395:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3395:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3395:7: (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3395:7: (this_signedINT_9= rulesignedINT )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==RULE_INT) ) {
                            int LA65_2 = input.LA(2);

                            if ( (synpred75_InternalFractalIdt()) ) {
                                alt65=1;
                            }


                        }
                        else if ( (LA65_0==RULE_ADDITIVE_OPERATION) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3396:5: this_signedINT_9= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_2_0()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7264);
                    	    this_signedINT_9=rulesignedINT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_signedINT_9);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7293);
                    this_Exponent_10=ruleExponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Exponent_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3417:1: (this_FDSYMBOL_11= RULE_FDSYMBOL )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_FDSYMBOL) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3417:6: this_FDSYMBOL_11= RULE_FDSYMBOL
                            {
                            this_FDSYMBOL_11=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7314); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_FDSYMBOL_11);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_FDSYMBOL_11, grammarAccess.getFloatingPointLiteralAccess().getFDSYMBOLTerminalRuleCall_2_2()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3425:6: ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3425:6: ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3425:7: (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3425:7: (this_signedINT_12= rulesignedINT )+
                    int cnt67=0;
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==RULE_INT) ) {
                            int LA67_2 = input.LA(2);

                            if ( (synpred78_InternalFractalIdt()) ) {
                                alt67=1;
                            }


                        }
                        else if ( (LA67_0==RULE_ADDITIVE_OPERATION) ) {
                            int LA67_3 = input.LA(2);

                            if ( (synpred78_InternalFractalIdt()) ) {
                                alt67=1;
                            }


                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3426:5: this_signedINT_12= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_3_0()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7352);
                    	    this_signedINT_12=rulesignedINT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_signedINT_12);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt67 >= 1 ) break loop67;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(67, input);
                                throw eee;
                        }
                        cnt67++;
                    } while (true);

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3436:3: (this_Exponent_13= ruleExponent )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==RULE_INT||(LA68_0>=49 && LA68_0<=50)) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3437:5: this_Exponent_13= ruleExponent
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_3_1()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7382);
                            this_Exponent_13=ruleExponent();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_Exponent_13);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3447:3: (this_FDSYMBOL_14= RULE_FDSYMBOL )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_FDSYMBOL) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3447:8: this_FDSYMBOL_14= RULE_FDSYMBOL
                            {
                            this_FDSYMBOL_14=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7405); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_FDSYMBOL_14);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_FDSYMBOL_14, grammarAccess.getFloatingPointLiteralAccess().getFDSYMBOLTerminalRuleCall_3_2()); 
                                  
                            }

                            }
                            break;

                    }


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
    // $ANTLR end "ruleFloatingPointLiteral"


    // $ANTLR start "entryRuleExponent"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3462:1: entryRuleExponent returns [String current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final String entryRuleExponent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponent = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3463:2: (iv_ruleExponent= ruleExponent EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3464:2: iv_ruleExponent= ruleExponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_entryRuleExponent7454);
            iv_ruleExponent=ruleExponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponent.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExponent7465); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExponent"


    // $ANTLR start "ruleExponent"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3471:1: ruleExponent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+ ) ;
    public final AntlrDatatypeRuleToken ruleExponent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ADDITIVE_OPERATION_2=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3474:28: ( ( (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+ ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3475:1: ( (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+ )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3475:1: ( (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+ )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3475:2: (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3475:2: (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )?
            int alt71=3;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==49) ) {
                alt71=1;
            }
            else if ( (LA71_0==50) ) {
                alt71=2;
            }
            switch (alt71) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3476:2: kw= 'e'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleExponent7504); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExponentAccess().getEKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3482:6: (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3482:6: (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3483:2: kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleExponent7524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExponentAccess().getEKeyword_0_1_0()); 
                          
                    }
                    this_ADDITIVE_OPERATION_2=(Token)match(input,RULE_ADDITIVE_OPERATION,FollowSets000.FOLLOW_RULE_ADDITIVE_OPERATION_in_ruleExponent7539); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ADDITIVE_OPERATION_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ADDITIVE_OPERATION_2, grammarAccess.getExponentAccess().getADDITIVE_OPERATIONTerminalRuleCall_0_1_1()); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3495:4: (this_INT_3= RULE_INT )+
            int cnt72=0;
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_INT) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3495:9: this_INT_3= RULE_INT
            	    {
            	    this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleExponent7563); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_INT_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_INT_3, grammarAccess.getExponentAccess().getINTTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
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
    // $ANTLR end "ruleExponent"


    // $ANTLR start "ruleTypeQualifier"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3510:1: ruleTypeQualifier returns [Enumerator current=null] : ( (enumLiteral_0= 'const' ) | (enumLiteral_1= 'volatile' ) ) ;
    public final Enumerator ruleTypeQualifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3512:28: ( ( (enumLiteral_0= 'const' ) | (enumLiteral_1= 'volatile' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3513:1: ( (enumLiteral_0= 'const' ) | (enumLiteral_1= 'volatile' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3513:1: ( (enumLiteral_0= 'const' ) | (enumLiteral_1= 'volatile' ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==51) ) {
                alt73=1;
            }
            else if ( (LA73_0==52) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3513:2: (enumLiteral_0= 'const' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3513:2: (enumLiteral_0= 'const' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3513:4: enumLiteral_0= 'const'
                    {
                    enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTypeQualifier7624); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3519:6: (enumLiteral_1= 'volatile' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3519:6: (enumLiteral_1= 'volatile' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3519:8: enumLiteral_1= 'volatile'
                    {
                    enumLiteral_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTypeQualifier7641); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeQualifierAccess().getVolatileEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTypeQualifierAccess().getVolatileEnumLiteralDeclaration_1()); 
                          
                    }

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
    // $ANTLR end "ruleTypeQualifier"


    // $ANTLR start "ruleTypeSpecifier"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3529:1: ruleTypeSpecifier returns [Enumerator current=null] : ( (enumLiteral_0= 'void' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'signed' ) | (enumLiteral_8= 'unsigned' ) | (enumLiteral_9= 'string' ) | (enumLiteral_10= 'int8_t' ) | (enumLiteral_11= 'uint8_t' ) | (enumLiteral_12= 'int16_t' ) | (enumLiteral_13= 'uint16_t' ) | (enumLiteral_14= 'int32_t' ) | (enumLiteral_15= 'uint32_t' ) | (enumLiteral_16= 'int64_t' ) | (enumLiteral_17= 'uint64_t' ) | (enumLiteral_18= 'intptr_t' ) | (enumLiteral_19= 'uintptr_t' ) ) ;
    public final Enumerator ruleTypeSpecifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;

         enterRule(); 
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3531:28: ( ( (enumLiteral_0= 'void' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'signed' ) | (enumLiteral_8= 'unsigned' ) | (enumLiteral_9= 'string' ) | (enumLiteral_10= 'int8_t' ) | (enumLiteral_11= 'uint8_t' ) | (enumLiteral_12= 'int16_t' ) | (enumLiteral_13= 'uint16_t' ) | (enumLiteral_14= 'int32_t' ) | (enumLiteral_15= 'uint32_t' ) | (enumLiteral_16= 'int64_t' ) | (enumLiteral_17= 'uint64_t' ) | (enumLiteral_18= 'intptr_t' ) | (enumLiteral_19= 'uintptr_t' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3532:1: ( (enumLiteral_0= 'void' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'signed' ) | (enumLiteral_8= 'unsigned' ) | (enumLiteral_9= 'string' ) | (enumLiteral_10= 'int8_t' ) | (enumLiteral_11= 'uint8_t' ) | (enumLiteral_12= 'int16_t' ) | (enumLiteral_13= 'uint16_t' ) | (enumLiteral_14= 'int32_t' ) | (enumLiteral_15= 'uint32_t' ) | (enumLiteral_16= 'int64_t' ) | (enumLiteral_17= 'uint64_t' ) | (enumLiteral_18= 'intptr_t' ) | (enumLiteral_19= 'uintptr_t' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3532:1: ( (enumLiteral_0= 'void' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'signed' ) | (enumLiteral_8= 'unsigned' ) | (enumLiteral_9= 'string' ) | (enumLiteral_10= 'int8_t' ) | (enumLiteral_11= 'uint8_t' ) | (enumLiteral_12= 'int16_t' ) | (enumLiteral_13= 'uint16_t' ) | (enumLiteral_14= 'int32_t' ) | (enumLiteral_15= 'uint32_t' ) | (enumLiteral_16= 'int64_t' ) | (enumLiteral_17= 'uint64_t' ) | (enumLiteral_18= 'intptr_t' ) | (enumLiteral_19= 'uintptr_t' ) )
            int alt74=20;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt74=1;
                }
                break;
            case 53:
                {
                alt74=2;
                }
                break;
            case 54:
                {
                alt74=3;
                }
                break;
            case 55:
                {
                alt74=4;
                }
                break;
            case 56:
                {
                alt74=5;
                }
                break;
            case 57:
                {
                alt74=6;
                }
                break;
            case 58:
                {
                alt74=7;
                }
                break;
            case 59:
                {
                alt74=8;
                }
                break;
            case 60:
                {
                alt74=9;
                }
                break;
            case 61:
                {
                alt74=10;
                }
                break;
            case 62:
                {
                alt74=11;
                }
                break;
            case 63:
                {
                alt74=12;
                }
                break;
            case 64:
                {
                alt74=13;
                }
                break;
            case 65:
                {
                alt74=14;
                }
                break;
            case 66:
                {
                alt74=15;
                }
                break;
            case 67:
                {
                alt74=16;
                }
                break;
            case 68:
                {
                alt74=17;
                }
                break;
            case 69:
                {
                alt74=18;
                }
                break;
            case 70:
                {
                alt74=19;
                }
                break;
            case 71:
                {
                alt74=20;
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3532:2: (enumLiteral_0= 'void' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3532:2: (enumLiteral_0= 'void' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3532:4: enumLiteral_0= 'void'
                    {
                    enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleTypeSpecifier7686); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3538:6: (enumLiteral_1= 'char' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3538:6: (enumLiteral_1= 'char' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3538:8: enumLiteral_1= 'char'
                    {
                    enumLiteral_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTypeSpecifier7703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3544:6: (enumLiteral_2= 'short' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3544:6: (enumLiteral_2= 'short' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3544:8: enumLiteral_2= 'short'
                    {
                    enumLiteral_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTypeSpecifier7720); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3550:6: (enumLiteral_3= 'int' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3550:6: (enumLiteral_3= 'int' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3550:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleTypeSpecifier7737); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3556:6: (enumLiteral_4= 'long' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3556:6: (enumLiteral_4= 'long' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3556:8: enumLiteral_4= 'long'
                    {
                    enumLiteral_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTypeSpecifier7754); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3562:6: (enumLiteral_5= 'float' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3562:6: (enumLiteral_5= 'float' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3562:8: enumLiteral_5= 'float'
                    {
                    enumLiteral_5=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleTypeSpecifier7771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3568:6: (enumLiteral_6= 'double' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3568:6: (enumLiteral_6= 'double' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3568:8: enumLiteral_6= 'double'
                    {
                    enumLiteral_6=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTypeSpecifier7788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3574:6: (enumLiteral_7= 'signed' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3574:6: (enumLiteral_7= 'signed' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3574:8: enumLiteral_7= 'signed'
                    {
                    enumLiteral_7=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleTypeSpecifier7805); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3580:6: (enumLiteral_8= 'unsigned' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3580:6: (enumLiteral_8= 'unsigned' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3580:8: enumLiteral_8= 'unsigned'
                    {
                    enumLiteral_8=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleTypeSpecifier7822); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3586:6: (enumLiteral_9= 'string' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3586:6: (enumLiteral_9= 'string' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3586:8: enumLiteral_9= 'string'
                    {
                    enumLiteral_9=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleTypeSpecifier7839); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3592:6: (enumLiteral_10= 'int8_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3592:6: (enumLiteral_10= 'int8_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3592:8: enumLiteral_10= 'int8_t'
                    {
                    enumLiteral_10=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleTypeSpecifier7856); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3598:6: (enumLiteral_11= 'uint8_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3598:6: (enumLiteral_11= 'uint8_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3598:8: enumLiteral_11= 'uint8_t'
                    {
                    enumLiteral_11=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleTypeSpecifier7873); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3604:6: (enumLiteral_12= 'int16_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3604:6: (enumLiteral_12= 'int16_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3604:8: enumLiteral_12= 'int16_t'
                    {
                    enumLiteral_12=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleTypeSpecifier7890); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3610:6: (enumLiteral_13= 'uint16_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3610:6: (enumLiteral_13= 'uint16_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3610:8: enumLiteral_13= 'uint16_t'
                    {
                    enumLiteral_13=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleTypeSpecifier7907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3616:6: (enumLiteral_14= 'int32_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3616:6: (enumLiteral_14= 'int32_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3616:8: enumLiteral_14= 'int32_t'
                    {
                    enumLiteral_14=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleTypeSpecifier7924); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3622:6: (enumLiteral_15= 'uint32_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3622:6: (enumLiteral_15= 'uint32_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3622:8: enumLiteral_15= 'uint32_t'
                    {
                    enumLiteral_15=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleTypeSpecifier7941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_15, grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15()); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3628:6: (enumLiteral_16= 'int64_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3628:6: (enumLiteral_16= 'int64_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3628:8: enumLiteral_16= 'int64_t'
                    {
                    enumLiteral_16=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleTypeSpecifier7958); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_16, grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16()); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3634:6: (enumLiteral_17= 'uint64_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3634:6: (enumLiteral_17= 'uint64_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3634:8: enumLiteral_17= 'uint64_t'
                    {
                    enumLiteral_17=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleTypeSpecifier7975); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_17, grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17()); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3640:6: (enumLiteral_18= 'intptr_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3640:6: (enumLiteral_18= 'intptr_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3640:8: enumLiteral_18= 'intptr_t'
                    {
                    enumLiteral_18=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleTypeSpecifier7992); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_18, grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18()); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3646:6: (enumLiteral_19= 'uintptr_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3646:6: (enumLiteral_19= 'uintptr_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3646:8: enumLiteral_19= 'uintptr_t'
                    {
                    enumLiteral_19=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleTypeSpecifier8009); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUintptr_tEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_19, grammarAccess.getTypeSpecifierAccess().getUintptr_tEnumLiteralDeclaration_19()); 
                          
                    }

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
    // $ANTLR end "ruleTypeSpecifier"


    // $ANTLR start "ruleParameterQualifier"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3656:1: ruleParameterQualifier returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleParameterQualifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3658:28: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3659:1: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3659:1: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==72) ) {
                alt75=1;
            }
            else if ( (LA75_0==73) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3659:2: (enumLiteral_0= 'in' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3659:2: (enumLiteral_0= 'in' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3659:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleParameterQualifier8054); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3665:6: (enumLiteral_1= 'out' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3665:6: (enumLiteral_1= 'out' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3665:8: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleParameterQualifier8071); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterQualifierAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getParameterQualifierAccess().getOutEnumLiteralDeclaration_1()); 
                          
                    }

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
    // $ANTLR end "ruleParameterQualifier"

    // $ANTLR start synpred61_InternalFractalIdt
    public final void synpred61_InternalFractalIdt_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;

        EObject lv_expr_3_0 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3063:2: ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3063:2: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3063:2: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3063:4: otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) )
        {
        otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_synpred61_InternalFractalIdt6428); if (state.failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3067:1: ( (lv_type_1_0= ruleQualifiedTypeSpecification ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3068:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3068:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3069:3: lv_type_1_0= ruleQualifiedTypeSpecification
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCastExpressionAccess().getTypeQualifiedTypeSpecificationParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_synpred61_InternalFractalIdt6449);
        lv_type_1_0=ruleQualifiedTypeSpecification();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_synpred61_InternalFractalIdt6461); if (state.failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3089:1: ( (lv_expr_3_0= ruleCastExpression ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3090:1: (lv_expr_3_0= ruleCastExpression )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3090:1: (lv_expr_3_0= ruleCastExpression )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3091:3: lv_expr_3_0= ruleCastExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCastExpressionAccess().getExprCastExpressionParserRuleCall_0_3_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_synpred61_InternalFractalIdt6482);
        lv_expr_3_0=ruleCastExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred61_InternalFractalIdt

    // $ANTLR start synpred67_InternalFractalIdt
    public final void synpred67_InternalFractalIdt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_signedINT_2 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3330:5: (this_signedINT_2= rulesignedINT )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3330:5: this_signedINT_2= rulesignedINT
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_2()); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred67_InternalFractalIdt7069);
        this_signedINT_2=rulesignedINT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_InternalFractalIdt

    // $ANTLR start synpred70_InternalFractalIdt
    public final void synpred70_InternalFractalIdt_fragment() throws RecognitionException {   
        Token kw=null;
        Token this_FDSYMBOL_4=null;
        AntlrDatatypeRuleToken this_signedINT_0 = null;

        AntlrDatatypeRuleToken this_signedINT_2 = null;

        AntlrDatatypeRuleToken this_Exponent_3 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3312:2: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3312:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3312:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3312:3: (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )?
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3312:3: (this_signedINT_0= rulesignedINT )+
        int cnt79=0;
        loop79:
        do {
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=RULE_ADDITIVE_OPERATION && LA79_0<=RULE_INT)) ) {
                alt79=1;
            }


            switch (alt79) {
        	case 1 :
        	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3313:5: this_signedINT_0= rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred70_InternalFractalIdt7026);
        	    this_signedINT_0=rulesignedINT();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt79 >= 1 ) break loop79;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(79, input);
                    throw eee;
            }
            cnt79++;
        } while (true);

        kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_synpred70_InternalFractalIdt7046); if (state.failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3329:1: (this_signedINT_2= rulesignedINT )*
        loop80:
        do {
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_INT) ) {
                int LA80_2 = input.LA(2);

                if ( (synpred67_InternalFractalIdt()) ) {
                    alt80=1;
                }


            }
            else if ( (LA80_0==RULE_ADDITIVE_OPERATION) ) {
                alt80=1;
            }


            switch (alt80) {
        	case 1 :
        	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3330:5: this_signedINT_2= rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred70_InternalFractalIdt7069);
        	    this_signedINT_2=rulesignedINT();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop80;
            }
        } while (true);

        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3340:3: (this_Exponent_3= ruleExponent )?
        int alt81=2;
        int LA81_0 = input.LA(1);

        if ( (LA81_0==RULE_INT||(LA81_0>=49 && LA81_0<=50)) ) {
            alt81=1;
        }
        switch (alt81) {
            case 1 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3341:5: this_Exponent_3= ruleExponent
                {
                pushFollow(FollowSets000.FOLLOW_ruleExponent_in_synpred70_InternalFractalIdt7099);
                this_Exponent_3=ruleExponent();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3351:3: (this_FDSYMBOL_4= RULE_FDSYMBOL )?
        int alt82=2;
        int LA82_0 = input.LA(1);

        if ( (LA82_0==RULE_FDSYMBOL) ) {
            alt82=1;
        }
        switch (alt82) {
            case 1 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3351:8: this_FDSYMBOL_4= RULE_FDSYMBOL
                {
                this_FDSYMBOL_4=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_synpred70_InternalFractalIdt7122); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred70_InternalFractalIdt

    // $ANTLR start synpred71_InternalFractalIdt
    public final void synpred71_InternalFractalIdt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_signedINT_6 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3366:5: (this_signedINT_6= rulesignedINT )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3366:5: this_signedINT_6= rulesignedINT
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_1_1()); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred71_InternalFractalIdt7173);
        this_signedINT_6=rulesignedINT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_InternalFractalIdt

    // $ANTLR start synpred75_InternalFractalIdt
    public final void synpred75_InternalFractalIdt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_signedINT_9 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3396:5: (this_signedINT_9= rulesignedINT )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3396:5: this_signedINT_9= rulesignedINT
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_2_0()); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred75_InternalFractalIdt7264);
        this_signedINT_9=rulesignedINT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred75_InternalFractalIdt

    // $ANTLR start synpred77_InternalFractalIdt
    public final void synpred77_InternalFractalIdt_fragment() throws RecognitionException {   
        Token this_FDSYMBOL_11=null;
        AntlrDatatypeRuleToken this_signedINT_9 = null;

        AntlrDatatypeRuleToken this_Exponent_10 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3395:6: ( ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3395:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3395:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3395:7: (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )?
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3395:7: (this_signedINT_9= rulesignedINT )+
        int cnt86=0;
        loop86:
        do {
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_INT) ) {
                int LA86_2 = input.LA(2);

                if ( (synpred75_InternalFractalIdt()) ) {
                    alt86=1;
                }


            }
            else if ( (LA86_0==RULE_ADDITIVE_OPERATION) ) {
                alt86=1;
            }


            switch (alt86) {
        	case 1 :
        	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3396:5: this_signedINT_9= rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred77_InternalFractalIdt7264);
        	    this_signedINT_9=rulesignedINT();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt86 >= 1 ) break loop86;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(86, input);
                    throw eee;
            }
            cnt86++;
        } while (true);

        pushFollow(FollowSets000.FOLLOW_ruleExponent_in_synpred77_InternalFractalIdt7293);
        this_Exponent_10=ruleExponent();

        state._fsp--;
        if (state.failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3417:1: (this_FDSYMBOL_11= RULE_FDSYMBOL )?
        int alt87=2;
        int LA87_0 = input.LA(1);

        if ( (LA87_0==RULE_FDSYMBOL) ) {
            alt87=1;
        }
        switch (alt87) {
            case 1 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3417:6: this_FDSYMBOL_11= RULE_FDSYMBOL
                {
                this_FDSYMBOL_11=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_synpred77_InternalFractalIdt7314); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred77_InternalFractalIdt

    // $ANTLR start synpred78_InternalFractalIdt
    public final void synpred78_InternalFractalIdt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_signedINT_12 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3426:5: (this_signedINT_12= rulesignedINT )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3426:5: this_signedINT_12= rulesignedINT
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_3_0()); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred78_InternalFractalIdt7352);
        this_signedINT_12=rulesignedINT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred78_InternalFractalIdt

    // Delegated rules

    public final boolean synpred67_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred77_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred77_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA70 dfa70 = new DFA70(this);
    static final String DFA70_eotS =
        "\15\uffff";
    static final String DFA70_eofS =
        "\2\uffff\1\11\12\uffff";
    static final String DFA70_minS =
        "\1\10\1\11\1\10\1\uffff\1\11\2\10\1\0\2\uffff\1\0\1\11\1\uffff";
    static final String DFA70_maxS =
        "\1\43\1\11\1\62\1\uffff\1\11\1\10\1\43\1\0\2\uffff\1\0\1\11\1\uffff";
    static final String DFA70_acceptS =
        "\3\uffff\1\2\4\uffff\1\1\1\4\2\uffff\1\3";
    static final String DFA70_specialS =
        "\6\uffff\1\2\1\0\2\uffff\1\1\2\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\1\1\2\31\uffff\1\3",
            "\1\2",
            "\1\7\1\6\2\11\1\uffff\1\11\5\uffff\3\11\1\uffff\3\11\1\uffff"+
            "\2\11\3\uffff\1\11\1\uffff\1\11\1\10\1\11\4\uffff\1\11\2\uffff"+
            "\5\11\1\4\1\5",
            "",
            "\1\12",
            "\1\13",
            "\2\10\31\uffff\1\10",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\12",
            ""
    };

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "3312:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA70_7 = input.LA(1);

                         
                        int index70_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalFractalIdt()) ) {s = 8;}

                        else if ( (synpred77_InternalFractalIdt()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index70_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA70_10 = input.LA(1);

                         
                        int index70_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred77_InternalFractalIdt()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index70_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA70_6 = input.LA(1);

                         
                        int index70_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA70_6>=RULE_ADDITIVE_OPERATION && LA70_6<=RULE_INT)||LA70_6==35) ) {s = 8;}

                        else if ( (synpred77_InternalFractalIdt()) ) {s = 12;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index70_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 70, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleIdtFile_in_entryRuleIdtFile81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdtFile91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_ruleIdtFile137 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleIdtFile158 = new BitSet(new long[]{0x000002100B280000L});
        public static final BitSet FOLLOW_ruleIncludeDirective_in_ruleIdtFile179 = new BitSet(new long[]{0x000002100B280000L});
        public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleIdtFile202 = new BitSet(new long[]{0x000002100B280000L});
        public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleIdtFile229 = new BitSet(new long[]{0x000002100B280000L});
        public static final BitSet FOLLOW_ruleConstantDefinitionEnd_in_ruleIdtFile252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin288 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionBegin298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleConstantDefinitionBegin335 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinitionBegin352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantDefinitionEnd_in_entryRuleConstantDefinitionEnd394 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionEnd405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleConstantDefinitionEnd442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition483 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition544 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition574 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition604 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTypeDefinition616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification652 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedefSpecification662 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleTypedefSpecification699 = new BitSet(new long[]{0xFFF800900B200010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification720 = new BitSet(new long[]{0x00000000C0000010L});
        public static final BitSet FOLLOW_ruleDeclarators_in_ruleTypedefSpecification741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification777 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification833 = new BitSet(new long[]{0xFFF800900B200010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification891 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecification901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeSpecification947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification1008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification1035 = new BitSet(new long[]{0xFFF800900B200012L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification1056 = new BitSet(new long[]{0xFFF800900B200012L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification1094 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionSpecification1104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification1184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1219 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1275 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1292 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStructOrUnionDefinition1310 = new BitSet(new long[]{0xFFF804900BA00010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1331 = new BitSet(new long[]{0xFFF804900BA00010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_23_in_ruleStructOrUnionDefinition1344 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1380 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructorUnionReference1390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1436 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStructorUnionReference1453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1495 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnion1506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleStructOrUnion1544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleStructOrUnion1563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructMember_in_entryRuleStructMember1603 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructMember1613 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleStructMember1659 = new BitSet(new long[]{0xFFF800900B200010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1681 = new BitSet(new long[]{0x00000000C0000010L});
        public static final BitSet FOLLOW_ruleDeclarators_in_ruleStructMember1702 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_26_in_ruleStructMember1715 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleStructMember1736 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleStructMember1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1786 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecification1796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumReference_in_ruleEnumSpecification1876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1911 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumDefinition1921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEnumDefinition1958 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDefinition1975 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleEnumDefinition1993 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition2014 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleEnumDefinition2026 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumReference_in_entryRuleEnumReference2062 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumReference2072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEnumReference2109 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumReference2126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList2167 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumMemberList2177 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2223 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleEnumMemberList2236 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2257 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember2295 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember2305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumMember2347 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleEnumMember2365 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleEnumMember2386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclarators_in_entryRuleDeclarators2424 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclarators2434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2480 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleDeclarators2493 = new BitSet(new long[]{0x00000000C0000010L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2514 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator2552 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator2562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedPointerSpecification_in_ruleDeclarator2608 = new BitSet(new long[]{0x00000000C0000010L});
        public static final BitSet FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedPointerSpecification_in_entryRuleQualifiedPointerSpecification2666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedPointerSpecification2676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleQualifiedPointerSpecification2725 = new BitSet(new long[]{0x0018000000000002L});
        public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleQualifiedPointerSpecification2746 = new BitSet(new long[]{0x0018000000000002L});
        public static final BitSet FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDirectDeclarator2793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDirectDeclarator2836 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_31_in_ruleDirectDeclarator2860 = new BitSet(new long[]{0x00000000C0000010L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleDirectDeclarator2881 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleDirectDeclarator2893 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator2916 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification2953 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArraySpecification2963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleArraySpecification3007 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleArraySpecification3032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleArraySpecification3052 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleArraySpecification3073 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleArraySpecification3085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3123 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3174 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_35_in_ruleQualifiedName3193 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3208 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition3255 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition3265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleConstantDefinition3302 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinition3319 = new BitSet(new long[]{0x0000000880001332L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleConstantDefinition3345 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition3382 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition3392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleInterfaceDefinition3438 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleInterfaceDefinition3451 = new BitSet(new long[]{0x0000004000000010L});
        public static final BitSet FOLLOW_38_in_ruleInterfaceDefinition3464 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition3487 = new BitSet(new long[]{0x0000000004400000L});
        public static final BitSet FOLLOW_26_in_ruleInterfaceDefinition3500 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition3521 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInterfaceDefinition3535 = new BitSet(new long[]{0xFFF804900BA00010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3556 = new BitSet(new long[]{0xFFF804900BA00010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_23_in_ruleInterfaceDefinition3569 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3605 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethodDefinition3615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleMethodDefinition3661 = new BitSet(new long[]{0xFFF800900B200010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3683 = new BitSet(new long[]{0x0000000040000010L});
        public static final BitSet FOLLOW_ruleQualifiedPointerSpecification_in_ruleMethodDefinition3704 = new BitSet(new long[]{0x0000000040000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMethodDefinition3722 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMethodDefinition3741 = new BitSet(new long[]{0x0000008100000000L});
        public static final BitSet FOLLOW_39_in_ruleMethodDefinition3754 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleMethodDefinition3768 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_31_in_ruleMethodDefinition3788 = new BitSet(new long[]{0xFFF804900B200010L,0x00000000000003FFL});
        public static final BitSet FOLLOW_ruleParameterList_in_ruleMethodDefinition3809 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleMethodDefinition3821 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleMethodDefinition3835 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList3871 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterList3881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList3927 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleParameterList3940 = new BitSet(new long[]{0xFFF804900B200010L,0x00000000000003FFL});
        public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList3961 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleParameterList3976 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleParameterList3988 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter4026 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter4036 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleParameter4082 = new BitSet(new long[]{0xFFF800900B200010L,0x00000000000003FFL});
        public static final BitSet FOLLOW_ruleParameterQualifier_in_ruleParameter4104 = new BitSet(new long[]{0xFFF800900B200010L,0x00000000000003FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter4126 = new BitSet(new long[]{0x00000000C0000010L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleParameter4147 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective4183 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDirective4193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleIncludeDirective4230 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludeDirective4248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INCLUDE_LIB_in_ruleIncludeDirective4276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList4318 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList4328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList4374 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList4395 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4432 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleAnnotation4479 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotation4500 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleAnnotation4513 = new BitSet(new long[]{0x00000800004003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_ruleAnnotation4534 = new BitSet(new long[]{0x0000000110000000L});
        public static final BitSet FOLLOW_28_in_ruleAnnotation4547 = new BitSet(new long[]{0x00000800004003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_ruleAnnotation4568 = new BitSet(new long[]{0x0000000110000000L});
        public static final BitSet FOLLOW_32_in_ruleAnnotation4582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_entryRuleAnnotationValuePair4620 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValuePair4630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationValuePair4673 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAnnotationValuePair4690 = new BitSet(new long[]{0x00000800004003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleAnnotationValuePair4713 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue4749 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValue4759 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleAnnotationValue4807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleAnnotationValue4823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleAnnotationValue4851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotationValue4875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAnnotationValue4890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayAnnotationValue_in_ruleAnnotationValue4925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayAnnotationValue_in_entryRuleArrayAnnotationValue4961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArrayAnnotationValue4971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleArrayAnnotationValue5008 = new BitSet(new long[]{0x00000800004003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5029 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_28_in_ruleArrayAnnotationValue5042 = new BitSet(new long[]{0x00000800004003B0L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleArrayAnnotationValue5063 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_23_in_ruleArrayAnnotationValue5077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT5114 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignedINT5125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ADDITIVE_OPERATION_in_rulesignedINT5166 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT5188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression5233 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression5243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConstantExpression5292 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression5326 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression5336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5382 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_44_in_ruleLogicalOrExpression5395 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleLogicalOrExpression5416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression5454 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression5464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleLogicalAndExpression5510 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleLogicalAndExpression5523 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalAndExpression5544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression5582 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression5592 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXorExpression_in_ruleOrExpression5638 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_46_in_ruleOrExpression5651 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleOrExpression5672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXorExpression_in_entryRuleXorExpression5710 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXorExpression5720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleXorExpression5766 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_47_in_ruleXorExpression5779 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleXorExpression_in_ruleXorExpression5800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression5838 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression5848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_ruleAndExpression5894 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_48_in_ruleAndExpression5907 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleAndExpression5928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression5966 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression5976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression6022 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_RULE_SHIFT_OPERATION_in_ruleShiftExpression6040 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_ruleShiftExpression6066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression6104 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression6114 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMulExpression_in_ruleAdditiveExpression6160 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_RULE_ADDITIVE_OPERATION_in_ruleAdditiveExpression6178 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleAdditiveExpression6204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMulExpression_in_entryRuleMulExpression6242 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMulExpression6252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCastExpression_in_ruleMulExpression6298 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_RULE_MUL_OPERATION_in_ruleMulExpression6316 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleMulExpression_in_ruleMulExpression6342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCastExpression_in_entryRuleCastExpression6380 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCastExpression6390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCastExpression6428 = new BitSet(new long[]{0xFFF800900B200010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleCastExpression6449 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleCastExpression6461 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleCastExpression_in_ruleCastExpression6482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleCastExpression6510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression6546 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression6556 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_UNARY_OPERATION_in_ruleUnaryExpression6598 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression6625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6661 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression6671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression6717 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rulePrimaryExpression6736 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_rulePrimaryExpression6761 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_rulePrimaryExpression6772 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6810 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral6861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral6887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_ruleLiteral6920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral6966 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointLiteral6977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7026 = new BitSet(new long[]{0x0000000800000300L});
        public static final BitSet FOLLOW_35_in_ruleFloatingPointLiteral7046 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7069 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7099 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleFloatingPointLiteral7150 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7173 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7203 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7264 = new BitSet(new long[]{0x0006000000000300L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7293 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral7352 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7382 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExponent_in_entryRuleExponent7454 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExponent7465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleExponent7504 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_50_in_ruleExponent7524 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_ADDITIVE_OPERATION_in_ruleExponent7539 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleExponent7563 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_51_in_ruleTypeQualifier7624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTypeQualifier7641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleTypeSpecifier7686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTypeSpecifier7703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTypeSpecifier7720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleTypeSpecifier7737 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleTypeSpecifier7754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleTypeSpecifier7771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleTypeSpecifier7788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleTypeSpecifier7805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleTypeSpecifier7822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleTypeSpecifier7839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleTypeSpecifier7856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleTypeSpecifier7873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleTypeSpecifier7890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleTypeSpecifier7907 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleTypeSpecifier7924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleTypeSpecifier7941 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleTypeSpecifier7958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleTypeSpecifier7975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleTypeSpecifier7992 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleTypeSpecifier8009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleParameterQualifier8054 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleParameterQualifier8071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_synpred61_InternalFractalIdt6428 = new BitSet(new long[]{0xFFF800900B200010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_synpred61_InternalFractalIdt6449 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_synpred61_InternalFractalIdt6461 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleCastExpression_in_synpred61_InternalFractalIdt6482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred67_InternalFractalIdt7069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred70_InternalFractalIdt7026 = new BitSet(new long[]{0x0000000800000300L});
        public static final BitSet FOLLOW_35_in_synpred70_InternalFractalIdt7046 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred70_InternalFractalIdt7069 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_synpred70_InternalFractalIdt7099 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_synpred70_InternalFractalIdt7122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred71_InternalFractalIdt7173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred75_InternalFractalIdt7264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred77_InternalFractalIdt7264 = new BitSet(new long[]{0x0006000000000300L});
        public static final BitSet FOLLOW_ruleExponent_in_synpred77_InternalFractalIdt7293 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_synpred77_InternalFractalIdt7314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred78_InternalFractalIdt7352 = new BitSet(new long[]{0x0000000000000002L});
    }


}
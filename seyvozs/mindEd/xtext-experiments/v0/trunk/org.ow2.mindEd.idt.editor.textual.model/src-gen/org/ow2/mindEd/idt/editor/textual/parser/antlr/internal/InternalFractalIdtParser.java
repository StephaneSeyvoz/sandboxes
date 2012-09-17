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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INCLUDE_LIB", "RULE_BOOLEAN", "RULE_ADDITIVE_OPERATION", "RULE_INT", "RULE_SHIFT_OPERATION", "RULE_MUL_OPERATION", "RULE_UNARY_OPERATION", "RULE_FDSYMBOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#endif'", "'#ifndef'", "';'", "'typedef'", "'{'", "'}'", "'struct'", "'union'", "':'", "'enum'", "','", "'='", "'*'", "'['", "']'", "'.'", "'#define'", "'interface'", "'unmanaged'", "'('", "'void'", "')'", "'...'", "'#include'", "'@'", "'null'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'e'", "'E'", "'const'", "'volatile'", "'char'", "'short'", "'int'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'string'", "'int8_t'", "'uint8_t'", "'int16_t'", "'uint16_t'", "'int32_t'", "'uint32_t'", "'int64_t'", "'uint64_t'", "'intptr_t'", "'uintptr_t'", "'in'", "'out'"
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:83:1: ruleIdtFile returns [EObject current=null] : ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* otherlv_5= '#endif' ) ;
    public final EObject ruleIdtFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        EObject lv_begindef_0_0 = null;

        EObject lv_def_1_0 = null;

        EObject lv_includes_2_0 = null;

        EObject lv_constant_3_0 = null;

        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:86:28: ( ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* otherlv_5= '#endif' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:87:1: ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* otherlv_5= '#endif' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:87:1: ( ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* otherlv_5= '#endif' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:87:2: ( (lv_begindef_0_0= ruleConstantDefinitionBegin ) ) ( (lv_def_1_0= ruleConstantDefinition ) ) ( (lv_includes_2_0= ruleIncludeDirective ) )* ( ( (lv_constant_3_0= ruleConstantDefinition ) ) | ( (lv_type_4_0= ruleTypeDefinition ) ) )* otherlv_5= '#endif'
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

                if ( (LA2_0==34) ) {
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

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleIdtFile243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIdtFileAccess().getEndifKeyword_4());
                  
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:190:1: entryRuleConstantDefinitionBegin returns [EObject current=null] : iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF ;
    public final EObject entryRuleConstantDefinitionBegin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinitionBegin = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:191:2: (iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:192:2: iv_ruleConstantDefinitionBegin= ruleConstantDefinitionBegin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDefinitionBeginRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin279);
            iv_ruleConstantDefinitionBegin=ruleConstantDefinitionBegin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDefinitionBegin; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantDefinitionBegin289); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:199:1: ruleConstantDefinitionBegin returns [EObject current=null] : (otherlv_0= '#ifndef' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConstantDefinitionBegin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:202:28: ( (otherlv_0= '#ifndef' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:203:1: (otherlv_0= '#ifndef' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:203:1: (otherlv_0= '#ifndef' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:203:3: otherlv_0= '#ifndef' ( (lv_id_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConstantDefinitionBegin326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDefinitionBeginAccess().getIfndefKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:207:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:208:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:208:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:209:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstantDefinitionBegin343); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_1_0, grammarAccess.getConstantDefinitionBeginAccess().getIdIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantDefinitionBeginRule());
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
    // $ANTLR end "ruleConstantDefinitionBegin"


    // $ANTLR start "entryRuleTypeDefinition"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:235:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:236:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:237:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition386);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeDefinition396); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:244:1: ruleTypeDefinition returns [EObject current=null] : ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_TypedefSpecification_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:247:28: ( ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:248:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:248:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:248:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:248:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification )
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:249:2: this_TypedefSpecification_0= ruleTypedefSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition447);
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:262:2: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition477);
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:275:2: this_EnumSpecification_2= ruleEnumSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getEnumSpecificationParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition507);
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

            otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleTypeDefinition519); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:298:1: entryRuleTypedefSpecification returns [EObject current=null] : iv_ruleTypedefSpecification= ruleTypedefSpecification EOF ;
    public final EObject entryRuleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedefSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:299:2: (iv_ruleTypedefSpecification= ruleTypedefSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:300:2: iv_ruleTypedefSpecification= ruleTypedefSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedefSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification555);
            iv_ruleTypedefSpecification=ruleTypedefSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedefSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedefSpecification565); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:307:1: ruleTypedefSpecification returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) ;
    public final EObject ruleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_qualifedType_1_0 = null;

        EObject lv_dec_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:310:28: ( (otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:311:1: (otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:311:1: (otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:311:3: otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleTypedefSpecification602); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:315:1: ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:316:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:316:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:317:3: lv_qualifedType_1_0= ruleQualifiedTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification623);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:333:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:334:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:334:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:335:3: lv_dec_2_0= ruleDeclarators
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_ruleTypedefSpecification644);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:359:1: entryRuleQualifiedTypeSpecification returns [EObject current=null] : iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF ;
    public final EObject entryRuleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedTypeSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:360:2: (iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:361:2: iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedTypeSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification680);
            iv_ruleQualifiedTypeSpecification=ruleQualifiedTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedTypeSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification690); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:368:1: ruleQualifiedTypeSpecification returns [EObject current=null] : ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) ;
    public final EObject ruleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeQualifier_0_0 = null;

        EObject lv_typeSpec_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:371:28: ( ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:372:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:372:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:372:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:372:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=51 && LA4_0<=52)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:373:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:373:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:374:3: lv_typeQualifier_0_0= ruleTypeQualifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification736);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:390:3: ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:391:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:391:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:392:3: lv_typeSpec_1_0= ruleTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification758);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:416:1: entryRuleTypeSpecification returns [EObject current=null] : iv_ruleTypeSpecification= ruleTypeSpecification EOF ;
    public final EObject entryRuleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:417:2: (iv_ruleTypeSpecification= ruleTypeSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:418:2: iv_ruleTypeSpecification= ruleTypeSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification794);
            iv_ruleTypeSpecification=ruleTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeSpecification804); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:425:1: ruleTypeSpecification returns [EObject current=null] : ( ( (lv_typeDefName_0_0= ruleQualifiedName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) ) ;
    public final EObject ruleTypeSpecification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_typeDefName_0_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;

        Enumerator lv_typeSpecifier_3_0 = null;

        Enumerator lv_typeSpecifier_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:428:28: ( ( ( (lv_typeDefName_0_0= ruleQualifiedName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:429:1: ( ( (lv_typeDefName_0_0= ruleQualifiedName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:429:1: ( ( (lv_typeDefName_0_0= ruleQualifiedName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) )
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
            case 38:
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:429:2: ( (lv_typeDefName_0_0= ruleQualifiedName ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:429:2: ( (lv_typeDefName_0_0= ruleQualifiedName ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:430:1: (lv_typeDefName_0_0= ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:430:1: (lv_typeDefName_0_0= ruleQualifiedName )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:431:3: lv_typeDefName_0_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeDefNameQualifiedNameParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTypeSpecification850);
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:449:2: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification881);
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:462:2: this_EnumSpecification_2= ruleEnumSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification911);
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:474:6: ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:474:6: ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:474:7: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )*
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:474:7: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:475:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:475:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:476:3: lv_typeSpecifier_3_0= ruleTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification938);
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

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:492:2: ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==38||(LA5_0>=53 && LA5_0<=71)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:493:1: (lv_typeSpecifier_4_0= ruleTypeSpecifier )
                    	    {
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:493:1: (lv_typeSpecifier_4_0= ruleTypeSpecifier )
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:494:3: lv_typeSpecifier_4_0= ruleTypeSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification959);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:518:1: entryRuleStructOrUnionSpecification returns [EObject current=null] : iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF ;
    public final EObject entryRuleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:519:2: (iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:520:2: iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructOrUnionSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification997);
            iv_ruleStructOrUnionSpecification=ruleStructOrUnionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructOrUnionSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnionSpecification1007); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:527:1: ruleStructOrUnionSpecification returns [EObject current=null] : (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) ;
    public final EObject ruleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StructOrUnionDefinition_0 = null;

        EObject this_StructorUnionReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:530:28: ( (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:531:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:531:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==22) ) {
                        alt7=1;
                    }
                    else if ( (LA7_3==EOF||LA7_3==20||LA7_3==30||LA7_3==39) ) {
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
                    else if ( (LA7_3==EOF||LA7_3==20||LA7_3==30||LA7_3==39) ) {
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:532:2: this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification1057);
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:545:2: this_StructorUnionReference_1= ruleStructorUnionReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructorUnionReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification1087);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:564:1: entryRuleStructOrUnionDefinition returns [EObject current=null] : iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF ;
    public final EObject entryRuleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:565:2: (iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:566:2: iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructOrUnionDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1122);
            iv_ruleStructOrUnionDefinition=ruleStructOrUnionDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructOrUnionDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1132); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:573:1: ruleStructOrUnionDefinition returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}' ) ;
    public final EObject ruleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;

        EObject lv_structMember_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:576:28: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:577:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:577:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:577:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:577:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:578:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:578:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:579:3: lv_struct_0_0= ruleStructOrUnion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1178);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:595:2: ( (lv_name_1_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:596:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:596:1: (lv_name_1_0= RULE_ID )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:597:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1195); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStructOrUnionDefinition1213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:617:1: ( (lv_structMember_3_0= ruleStructMember ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||(LA9_0>=24 && LA9_0<=25)||LA9_0==27||LA9_0==38||LA9_0==42||(LA9_0>=51 && LA9_0<=71)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:618:1: (lv_structMember_3_0= ruleStructMember )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:618:1: (lv_structMember_3_0= ruleStructMember )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:619:3: lv_structMember_3_0= ruleStructMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1234);
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

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleStructOrUnionDefinition1247); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:647:1: entryRuleStructorUnionReference returns [EObject current=null] : iv_ruleStructorUnionReference= ruleStructorUnionReference EOF ;
    public final EObject entryRuleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructorUnionReference = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:648:2: (iv_ruleStructorUnionReference= ruleStructorUnionReference EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:649:2: iv_ruleStructorUnionReference= ruleStructorUnionReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructorUnionReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1283);
            iv_ruleStructorUnionReference=ruleStructorUnionReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructorUnionReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructorUnionReference1293); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:656:1: ruleStructorUnionReference returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:659:28: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:660:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:660:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:660:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:660:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:661:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:661:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:662:3: lv_struct_0_0= ruleStructOrUnion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1339);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:678:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:679:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:679:1: (lv_name_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:680:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStructorUnionReference1356); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:704:1: entryRuleStructOrUnion returns [String current=null] : iv_ruleStructOrUnion= ruleStructOrUnion EOF ;
    public final String entryRuleStructOrUnion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructOrUnion = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:705:2: (iv_ruleStructOrUnion= ruleStructOrUnion EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:706:2: iv_ruleStructOrUnion= ruleStructOrUnion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructOrUnionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1398);
            iv_ruleStructOrUnion=ruleStructOrUnion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructOrUnion.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnion1409); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:713:1: ruleStructOrUnion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'struct' | kw= 'union' ) ;
    public final AntlrDatatypeRuleToken ruleStructOrUnion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:716:28: ( (kw= 'struct' | kw= 'union' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:717:1: (kw= 'struct' | kw= 'union' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:717:1: (kw= 'struct' | kw= 'union' )
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:718:2: kw= 'struct'
                    {
                    kw=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleStructOrUnion1447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStructOrUnionAccess().getStructKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:725:2: kw= 'union'
                    {
                    kw=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleStructOrUnion1466); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:738:1: entryRuleStructMember returns [EObject current=null] : iv_ruleStructMember= ruleStructMember EOF ;
    public final EObject entryRuleStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructMember = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:739:2: (iv_ruleStructMember= ruleStructMember EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:740:2: iv_ruleStructMember= ruleStructMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructMemberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructMember_in_entryRuleStructMember1506);
            iv_ruleStructMember=ruleStructMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructMember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructMember1516); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:747:1: ruleStructMember returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';' ) ;
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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:750:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:751:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:751:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:751:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:751:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:752:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:752:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:753:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStructMemberAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleStructMember1562);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:769:3: ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:770:1: (lv_qualType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:770:1: (lv_qualType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:771:3: lv_qualType_1_0= ruleQualifiedTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1584);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:787:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:788:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:788:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:789:3: lv_dec_2_0= ruleDeclarators
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_ruleStructMember1605);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:805:2: (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:805:4: otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) )
                    {
                    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleStructMember1618); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStructMemberAccess().getColonKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:809:1: ( (lv_constExpr_4_0= ruleConstantExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:810:1: (lv_constExpr_4_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:810:1: (lv_constExpr_4_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:811:3: lv_constExpr_4_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStructMemberAccess().getConstExprConstantExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleStructMember1639);
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

            otherlv_5=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStructMember1653); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:839:1: entryRuleEnumSpecification returns [EObject current=null] : iv_ruleEnumSpecification= ruleEnumSpecification EOF ;
    public final EObject entryRuleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:840:2: (iv_ruleEnumSpecification= ruleEnumSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:841:2: iv_ruleEnumSpecification= ruleEnumSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1689);
            iv_ruleEnumSpecification=ruleEnumSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumSpecification1699); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:848:1: ruleEnumSpecification returns [EObject current=null] : (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) ;
    public final EObject ruleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDefinition_0 = null;

        EObject this_EnumReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:851:28: ( (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:852:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:852:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_ID) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==EOF||LA13_2==20||LA13_2==30||LA13_2==39) ) {
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:853:2: this_EnumDefinition_0= ruleEnumDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1749);
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:866:2: this_EnumReference_1= ruleEnumReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumReference_in_ruleEnumSpecification1779);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:885:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:886:2: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:887:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1814);
            iv_ruleEnumDefinition=ruleEnumDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumDefinition1824); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:894:1: ruleEnumDefinition returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}' ) ;
    public final EObject ruleEnumDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_enumMemberList_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:897:28: ( (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:898:1: (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:898:1: (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:898:3: otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEnumDefinition1861); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:902:1: ( (lv_id_1_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:903:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:903:1: (lv_id_1_0= RULE_ID )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:904:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumDefinition1878); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleEnumDefinition1896); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:924:1: ( (lv_enumMemberList_3_0= ruleEnumMemberList ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:925:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:925:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:926:3: lv_enumMemberList_3_0= ruleEnumMemberList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition1917);
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

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleEnumDefinition1929); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:954:1: entryRuleEnumReference returns [EObject current=null] : iv_ruleEnumReference= ruleEnumReference EOF ;
    public final EObject entryRuleEnumReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumReference = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:955:2: (iv_ruleEnumReference= ruleEnumReference EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:956:2: iv_ruleEnumReference= ruleEnumReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumReference_in_entryRuleEnumReference1965);
            iv_ruleEnumReference=ruleEnumReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumReference1975); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:963:1: ruleEnumReference returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:966:28: ( (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:967:1: (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:967:1: (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:967:3: otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEnumReference2012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumReferenceAccess().getEnumKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:971:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:972:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:972:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:973:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumReference2029); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:997:1: entryRuleEnumMemberList returns [EObject current=null] : iv_ruleEnumMemberList= ruleEnumMemberList EOF ;
    public final EObject entryRuleEnumMemberList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMemberList = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:998:2: (iv_ruleEnumMemberList= ruleEnumMemberList EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:999:2: iv_ruleEnumMemberList= ruleEnumMemberList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumMemberListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList2070);
            iv_ruleEnumMemberList=ruleEnumMemberList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumMemberList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumMemberList2080); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1006:1: ruleEnumMemberList returns [EObject current=null] : ( ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) ;
    public final EObject ruleEnumMemberList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_enumMember_0_0 = null;

        EObject lv_enumMember_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1009:28: ( ( ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1010:1: ( ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1010:1: ( ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1010:2: ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1010:2: ( (lv_enumMember_0_0= ruleEnumMember ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1011:1: (lv_enumMember_0_0= ruleEnumMember )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1011:1: (lv_enumMember_0_0= ruleEnumMember )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1012:3: lv_enumMember_0_0= ruleEnumMember
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_ruleEnumMemberList2126);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1028:2: (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1028:4: otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleEnumMemberList2139); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1032:1: ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1033:1: (lv_enumMember_2_0= ruleEnumMember )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1033:1: (lv_enumMember_2_0= ruleEnumMember )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1034:3: lv_enumMember_2_0= ruleEnumMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_ruleEnumMemberList2160);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1058:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1059:2: (iv_ruleEnumMember= ruleEnumMember EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1060:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumMemberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_entryRuleEnumMember2198);
            iv_ruleEnumMember=ruleEnumMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumMember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumMember2208); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1067:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )? ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_constExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1070:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1071:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1071:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1071:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1071:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1072:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1072:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1073:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumMember2250); if (state.failed) return current;
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1089:2: (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1089:4: otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) )
                    {
                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEnumMember2268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1093:1: ( (lv_constExpr_2_0= ruleConstantExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1094:1: (lv_constExpr_2_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1094:1: (lv_constExpr_2_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1095:3: lv_constExpr_2_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumMemberAccess().getConstExprConstantExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleEnumMember2289);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1119:1: entryRuleDeclarators returns [EObject current=null] : iv_ruleDeclarators= ruleDeclarators EOF ;
    public final EObject entryRuleDeclarators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarators = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1120:2: (iv_ruleDeclarators= ruleDeclarators EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1121:2: iv_ruleDeclarators= ruleDeclarators EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaratorsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_entryRuleDeclarators2327);
            iv_ruleDeclarators=ruleDeclarators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarators; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclarators2337); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1128:1: ruleDeclarators returns [EObject current=null] : ( ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) ;
    public final EObject ruleDeclarators() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dec_0_0 = null;

        EObject lv_declaratorList_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1131:28: ( ( ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1132:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1132:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1132:2: ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1132:2: ( (lv_dec_0_0= ruleDeclarator ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1133:1: (lv_dec_0_0= ruleDeclarator )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1133:1: (lv_dec_0_0= ruleDeclarator )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1134:3: lv_dec_0_0= ruleDeclarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleDeclarators2383);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1150:2: (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==28) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1150:4: otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDeclarators2396); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1154:1: ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1155:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1155:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1156:3: lv_declaratorList_2_0= ruleDeclarator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleDeclarators2417);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1180:1: entryRuleDeclarator returns [EObject current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final EObject entryRuleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarator = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1181:2: (iv_ruleDeclarator= ruleDeclarator EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1182:2: iv_ruleDeclarator= ruleDeclarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaratorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_entryRuleDeclarator2455);
            iv_ruleDeclarator=ruleDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclarator2465); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1189:1: ruleDeclarator returns [EObject current=null] : ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) ) ) ;
    public final EObject ruleDeclarator() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_pointer_0_0 = null;

        EObject lv_dc_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1192:28: ( ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1193:1: ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1193:1: ( ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1193:2: ( (lv_pointer_0_0= rulePointerSpecification ) ) ( (lv_dc_1_0= ruleDirectDeclarator ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1193:2: ( (lv_pointer_0_0= rulePointerSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1194:1: (lv_pointer_0_0= rulePointerSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1194:1: (lv_pointer_0_0= rulePointerSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1195:3: lv_pointer_0_0= rulePointerSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclaratorAccess().getPointerPointerSpecificationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePointerSpecification_in_ruleDeclarator2511);
            lv_pointer_0_0=rulePointerSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclaratorRule());
              	        }
                     		set(
                     			current, 
                     			"pointer",
                      		lv_pointer_0_0, 
                      		"PointerSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1211:2: ( (lv_dc_1_0= ruleDirectDeclarator ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1212:1: (lv_dc_1_0= ruleDirectDeclarator )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1212:1: (lv_dc_1_0= ruleDirectDeclarator )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1213:3: lv_dc_1_0= ruleDirectDeclarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclaratorAccess().getDcDirectDeclaratorParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2532);
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


    // $ANTLR start "entryRulePointerSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1237:1: entryRulePointerSpecification returns [String current=null] : iv_rulePointerSpecification= rulePointerSpecification EOF ;
    public final String entryRulePointerSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePointerSpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1238:2: (iv_rulePointerSpecification= rulePointerSpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1239:2: iv_rulePointerSpecification= rulePointerSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointerSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePointerSpecification_in_entryRulePointerSpecification2569);
            iv_rulePointerSpecification=rulePointerSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePointerSpecification.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePointerSpecification2580); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePointerSpecification"


    // $ANTLR start "rulePointerSpecification"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1246:1: rulePointerSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken rulePointerSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1249:28: (kw= '*' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1251:2: kw= '*'
            {
            kw=(Token)match(input,30,FollowSets000.FOLLOW_30_in_rulePointerSpecification2617); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPointerSpecificationAccess().getAsteriskKeyword()); 
                  
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
    // $ANTLR end "rulePointerSpecification"


    // $ANTLR start "entryRuleDirectDeclarator"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1264:1: entryRuleDirectDeclarator returns [EObject current=null] : iv_ruleDirectDeclarator= ruleDirectDeclarator EOF ;
    public final EObject entryRuleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectDeclarator = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1265:2: (iv_ruleDirectDeclarator= ruleDirectDeclarator EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1266:2: iv_ruleDirectDeclarator= ruleDirectDeclarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirectDeclaratorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2656);
            iv_ruleDirectDeclarator=ruleDirectDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDirectDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDirectDeclarator2666); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1273:1: ruleDirectDeclarator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArraySpecification ) )* ) ;
    public final EObject ruleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_array_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1276:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArraySpecification ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1277:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArraySpecification ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1277:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArraySpecification ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1277:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArraySpecification ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1277:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1278:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1278:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1279:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDirectDeclarator2708); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getDirectDeclaratorAccess().getNameIDTerminalRuleCall_0_0()); 
              		
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1295:2: ( (lv_array_1_0= ruleArraySpecification ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1296:1: (lv_array_1_0= ruleArraySpecification )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1296:1: (lv_array_1_0= ruleArraySpecification )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1297:3: lv_array_1_0= ruleArraySpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDirectDeclaratorAccess().getArrayArraySpecificationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator2734);
            	    lv_array_1_0=ruleArraySpecification();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDirectDeclaratorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"array",
            	              		lv_array_1_0, 
            	              		"ArraySpecification");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1321:1: entryRuleArraySpecification returns [EObject current=null] : iv_ruleArraySpecification= ruleArraySpecification EOF ;
    public final EObject entryRuleArraySpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecification = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1322:2: (iv_ruleArraySpecification= ruleArraySpecification EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1323:2: iv_ruleArraySpecification= ruleArraySpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification2771);
            iv_ruleArraySpecification=ruleArraySpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArraySpecification2781); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1330:1: ruleArraySpecification returns [EObject current=null] : ( ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' ) | (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' ) ) ;
    public final EObject ruleArraySpecification() throws RecognitionException {
        EObject current = null;

        Token lv_unspecifiedSize_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fixedSize_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1333:28: ( ( ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' ) | (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1334:1: ( ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' ) | (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1334:1: ( ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' ) | (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==32) ) {
                    alt19=1;
                }
                else if ( ((LA19_1>=RULE_ID && LA19_1<=RULE_STRING)||(LA19_1>=RULE_ADDITIVE_OPERATION && LA19_1<=RULE_INT)||LA19_1==RULE_UNARY_OPERATION||LA19_1==33||LA19_1==37) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1334:2: ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1334:2: ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1334:3: ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']'
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1334:3: ( (lv_unspecifiedSize_0_0= '[' ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1335:1: (lv_unspecifiedSize_0_0= '[' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1335:1: (lv_unspecifiedSize_0_0= '[' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1336:3: lv_unspecifiedSize_0_0= '['
                    {
                    lv_unspecifiedSize_0_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleArraySpecification2825); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleArraySpecification2850); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1354:6: (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1354:6: (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1354:8: otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleArraySpecification2870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1358:1: ( (lv_fixedSize_3_0= ruleConstantExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1359:1: (lv_fixedSize_3_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1359:1: (lv_fixedSize_3_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1360:3: lv_fixedSize_3_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArraySpecificationAccess().getFixedSizeConstantExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleArraySpecification2891);
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

                    otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleArraySpecification2903); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1388:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1389:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1390:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2941);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName2952); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1397:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1400:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1401:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1401:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1401:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName2992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1408:1: (kw= '.' this_ID_2= RULE_ID )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==33) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1409:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleQualifiedName3011); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName3026); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1429:1: entryRuleConstantDefinition returns [EObject current=null] : iv_ruleConstantDefinition= ruleConstantDefinition EOF ;
    public final EObject entryRuleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1430:2: (iv_ruleConstantDefinition= ruleConstantDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1431:2: iv_ruleConstantDefinition= ruleConstantDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition3073);
            iv_ruleConstantDefinition=ruleConstantDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantDefinition3083); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1438:1: ruleConstantDefinition returns [EObject current=null] : (otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? ) ;
    public final EObject ruleConstantDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1441:28: ( (otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1442:1: (otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1442:1: (otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1442:3: otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )?
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleConstantDefinition3120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1446:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1447:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1447:1: (lv_name_1_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1448:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstantDefinition3137); if (state.failed) return current;
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1464:2: ( (lv_expr_2_0= ruleConstantExpression ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)||(LA21_0>=RULE_ADDITIVE_OPERATION && LA21_0<=RULE_INT)||LA21_0==RULE_UNARY_OPERATION||LA21_0==33||LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1465:1: (lv_expr_2_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1465:1: (lv_expr_2_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1466:3: lv_expr_2_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantDefinitionAccess().getExprConstantExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleConstantDefinition3163);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1490:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1491:2: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1492:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition3200);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfaceDefinition3210); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1499:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}' ) ;
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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1502:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1503:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1503:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1503:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1503:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1504:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1504:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1505:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleInterfaceDefinition3256);
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

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleInterfaceDefinition3269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1525:1: (otherlv_2= 'unmanaged' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1525:3: otherlv_2= 'unmanaged'
                    {
                    otherlv_2=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleInterfaceDefinition3282); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_2());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1529:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1530:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1530:1: (lv_name_3_0= ruleQualifiedName )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1531:3: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getNameQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition3305);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1547:2: (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1547:4: otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInterfaceDefinition3318); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1551:1: ( (lv_fqn2_5_0= ruleQualifiedName ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1552:1: (lv_fqn2_5_0= ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1552:1: (lv_fqn2_5_0= ruleQualifiedName )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1553:3: lv_fqn2_5_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFqn2QualifiedNameParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition3339);
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

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleInterfaceDefinition3353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1573:1: ( (lv_methodDef_7_0= ruleMethodDefinition ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID||(LA25_0>=24 && LA25_0<=25)||LA25_0==27||LA25_0==38||LA25_0==42||(LA25_0>=51 && LA25_0<=71)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1574:1: (lv_methodDef_7_0= ruleMethodDefinition )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1574:1: (lv_methodDef_7_0= ruleMethodDefinition )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1575:3: lv_methodDef_7_0= ruleMethodDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3374);
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
            	    break loop25;
                }
            } while (true);

            otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleInterfaceDefinition3387); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1603:1: entryRuleMethodDefinition returns [EObject current=null] : iv_ruleMethodDefinition= ruleMethodDefinition EOF ;
    public final EObject entryRuleMethodDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDefinition = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1604:2: (iv_ruleMethodDefinition= ruleMethodDefinition EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1605:2: iv_ruleMethodDefinition= ruleMethodDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3423);
            iv_ruleMethodDefinition=ruleMethodDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethodDefinition3433); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1612:1: ruleMethodDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';' ) ;
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

        AntlrDatatypeRuleToken lv_pointerSpecification_2_0 = null;

        EObject lv_ParameterList_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1615:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';' ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1616:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';' )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1616:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';' )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1616:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) ) ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';'
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1616:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1617:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1617:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1618:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleMethodDefinition3479);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1634:3: ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1635:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1635:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1636:3: lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3501);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1652:2: ( (lv_pointerSpecification_2_0= rulePointerSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1653:1: (lv_pointerSpecification_2_0= rulePointerSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1653:1: (lv_pointerSpecification_2_0= rulePointerSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1654:3: lv_pointerSpecification_2_0= rulePointerSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodDefinitionAccess().getPointerSpecificationPointerSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePointerSpecification_in_ruleMethodDefinition3522);
            lv_pointerSpecification_2_0=rulePointerSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMethodDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"pointerSpecification",
                      		lv_pointerSpecification_2_0, 
                      		"PointerSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1670:2: ( (lv_name_3_0= RULE_ID ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1671:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1671:1: (lv_name_3_0= RULE_ID )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1672:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMethodDefinition3539); if (state.failed) return current;
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1688:2: ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
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
                    alt28=2;
                    }
                    break;
                case 38:
                    {
                    int LA28_3 = input.LA(3);

                    if ( (LA28_3==39) ) {
                        alt28=1;
                    }
                    else if ( (LA28_3==30||LA28_3==38||(LA28_3>=53 && LA28_3<=71)) ) {
                        alt28=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 3, input);

                        throw nvae;
                    }
                    }
                    break;
                case 39:
                    {
                    alt28=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1688:3: (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1688:3: (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1688:5: otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMethodDefinition3558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_4_0_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1692:1: (otherlv_5= 'void' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==38) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1692:3: otherlv_5= 'void'
                            {
                            otherlv_5=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleMethodDefinition3571); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getMethodDefinitionAccess().getVoidKeyword_4_0_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMethodDefinition3585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_4_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1701:6: (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1701:6: (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1701:8: otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMethodDefinition3605); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_4_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1705:1: ( (lv_ParameterList_8_0= ruleParameterList ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1706:1: (lv_ParameterList_8_0= ruleParameterList )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1706:1: (lv_ParameterList_8_0= ruleParameterList )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1707:3: lv_ParameterList_8_0= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_4_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterList_in_ruleMethodDefinition3626);
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

                    otherlv_9=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleMethodDefinition3638); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_4_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleMethodDefinition3652); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1739:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1740:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1741:2: iv_ruleParameterList= ruleParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameterList_in_entryRuleParameterList3688);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterList3698); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1748:1: ruleParameterList returns [EObject current=null] : ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )? ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_param_0_0 = null;

        EObject lv_params_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1751:28: ( ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1752:1: ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1752:1: ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1752:2: ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1752:2: ( (lv_param_0_0= ruleParameter ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1753:1: (lv_param_0_0= ruleParameter )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1753:1: (lv_param_0_0= ruleParameter )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1754:3: lv_param_0_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleParameterList3744);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1770:2: (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==28) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==RULE_ID||(LA29_1>=24 && LA29_1<=25)||LA29_1==27||LA29_1==38||LA29_1==42||(LA29_1>=51 && LA29_1<=73)) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1770:4: otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleParameterList3757); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1774:1: ( (lv_params_2_0= ruleParameter ) )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1775:1: (lv_params_2_0= ruleParameter )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1775:1: (lv_params_2_0= ruleParameter )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1776:3: lv_params_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleParameterList3778);
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
            	    break loop29;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1792:4: (otherlv_3= ',' otherlv_4= '...' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1792:6: otherlv_3= ',' otherlv_4= '...'
                    {
                    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleParameterList3793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_2_0());
                          
                    }
                    otherlv_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleParameterList3805); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1808:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1809:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1810:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter3843);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter3853); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1817:1: ruleParameter returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_annotationsList_0_0 = null;

        Enumerator lv_ParameterQualifier_1_0 = null;

        EObject lv_qualifiedTypeSpec_2_0 = null;

        EObject lv_dec_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1820:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1821:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1821:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1821:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1821:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==42) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1822:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1822:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1823:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleParameter3899);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1839:3: ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=72 && LA32_0<=73)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1840:1: (lv_ParameterQualifier_1_0= ruleParameterQualifier )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1840:1: (lv_ParameterQualifier_1_0= ruleParameterQualifier )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1841:3: lv_ParameterQualifier_1_0= ruleParameterQualifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleParameterQualifier_in_ruleParameter3921);
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
            	    break loop32;
                }
            } while (true);

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1857:3: ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1858:1: (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1858:1: (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1859:3: lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter3943);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1875:2: ( (lv_dec_3_0= ruleDeclarator ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1876:1: (lv_dec_3_0= ruleDeclarator )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1876:1: (lv_dec_3_0= ruleDeclarator )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1877:3: lv_dec_3_0= ruleDeclarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleParameter3964);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1901:1: entryRuleIncludeDirective returns [EObject current=null] : iv_ruleIncludeDirective= ruleIncludeDirective EOF ;
    public final EObject entryRuleIncludeDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeDirective = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1902:2: (iv_ruleIncludeDirective= ruleIncludeDirective EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1903:2: iv_ruleIncludeDirective= ruleIncludeDirective EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeDirectiveRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective4000);
            iv_ruleIncludeDirective=ruleIncludeDirective();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIncludeDirective; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIncludeDirective4010); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1910:1: ruleIncludeDirective returns [EObject current=null] : (otherlv_0= '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) ) ) ;
    public final EObject ruleIncludeDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importedURI_1_0=null;
        Token lv_includeID_2_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1913:28: ( (otherlv_0= '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1914:1: (otherlv_0= '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1914:1: (otherlv_0= '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1914:3: otherlv_0= '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) )
            {
            otherlv_0=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleIncludeDirective4047); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1918:1: ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            else if ( (LA33_0==RULE_INCLUDE_LIB) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1918:2: ( (lv_importedURI_1_0= RULE_STRING ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1918:2: ( (lv_importedURI_1_0= RULE_STRING ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1919:1: (lv_importedURI_1_0= RULE_STRING )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1919:1: (lv_importedURI_1_0= RULE_STRING )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1920:3: lv_importedURI_1_0= RULE_STRING
                    {
                    lv_importedURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleIncludeDirective4065); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1937:6: ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1937:6: ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1938:1: (lv_includeID_2_0= RULE_INCLUDE_LIB )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1938:1: (lv_includeID_2_0= RULE_INCLUDE_LIB )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1939:3: lv_includeID_2_0= RULE_INCLUDE_LIB
                    {
                    lv_includeID_2_0=(Token)match(input,RULE_INCLUDE_LIB,FollowSets000.FOLLOW_RULE_INCLUDE_LIB_in_ruleIncludeDirective4093); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1963:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1964:2: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1965:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList4135);
            iv_ruleAnnotationsList=ruleAnnotationsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationsList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationsList4145); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1972:1: ruleAnnotationsList returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1975:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1976:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1976:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1976:2: ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1976:2: ( (lv_annotations_0_0= ruleAnnotation ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1977:1: (lv_annotations_0_0= ruleAnnotation )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1977:1: (lv_annotations_0_0= ruleAnnotation )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1978:3: lv_annotations_0_0= ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotationsList4191);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1994:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==42) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1995:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1995:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:1996:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotationsList4212);
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
            	    break loop34;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2020:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2021:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2022:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation4249);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation4259); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2029:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )? ) ;
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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2032:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2033:1: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2033:1: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2033:3: otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleAnnotation4296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2037:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2038:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2038:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2039:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleAnnotation4317);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2055:2: (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==37) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2055:4: otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAnnotation4330); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2059:1: ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2060:1: (lv_annotationParametersList_3_0= ruleAnnotationValuePair )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2060:1: (lv_annotationParametersList_3_0= ruleAnnotationValuePair )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2061:3: lv_annotationParametersList_3_0= ruleAnnotationValuePair
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationParametersListAnnotationValuePairParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_ruleAnnotation4351);
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

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2077:2: (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==28) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2077:4: otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) )
                    	    {
                    	    otherlv_4=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAnnotation4364); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2081:1: ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) )
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2082:1: (lv_annotationParametersList_5_0= ruleAnnotationValuePair )
                    	    {
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2082:1: (lv_annotationParametersList_5_0= ruleAnnotationValuePair )
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2083:3: lv_annotationParametersList_5_0= ruleAnnotationValuePair
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationParametersListAnnotationValuePairParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_ruleAnnotation4385);
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
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleAnnotation4399); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2111:1: entryRuleAnnotationValuePair returns [EObject current=null] : iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF ;
    public final EObject entryRuleAnnotationValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValuePair = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2112:2: (iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2113:2: iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationValuePairRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_entryRuleAnnotationValuePair4437);
            iv_ruleAnnotationValuePair=ruleAnnotationValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationValuePair; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationValuePair4447); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2120:1: ruleAnnotationValuePair returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) ) ) ;
    public final EObject ruleAnnotationValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2123:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2124:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2124:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2124:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2124:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==29) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2124:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2124:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2125:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2125:1: (lv_name_0_0= RULE_ID )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2126:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotationValuePair4490); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAnnotationValuePair4507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAnnotationValuePairAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2146:3: ( (lv_value_2_0= ruleAnnotationValue ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2147:1: (lv_value_2_0= ruleAnnotationValue )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2147:1: (lv_value_2_0= ruleAnnotationValue )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2148:3: lv_value_2_0= ruleAnnotationValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationValuePairAccess().getValueAnnotationValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_ruleAnnotationValuePair4530);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2172:1: entryRuleAnnotationValue returns [String current=null] : iv_ruleAnnotationValue= ruleAnnotationValue EOF ;
    public final String entryRuleAnnotationValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotationValue = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2173:2: (iv_ruleAnnotationValue= ruleAnnotationValue EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2174:2: iv_ruleAnnotationValue= ruleAnnotationValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue4567);
            iv_ruleAnnotationValue=ruleAnnotationValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationValue.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationValue4578); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2181:1: ruleAnnotationValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_signedINT_0= rulesignedINT | kw= 'null' | this_BOOLEAN_2= RULE_BOOLEAN | this_QualifiedName_3= ruleQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleAnnotationValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_signedINT_0 = null;

        AntlrDatatypeRuleToken this_QualifiedName_3 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2184:28: ( (this_signedINT_0= rulesignedINT | kw= 'null' | this_BOOLEAN_2= RULE_BOOLEAN | this_QualifiedName_3= ruleQualifiedName ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2185:1: (this_signedINT_0= rulesignedINT | kw= 'null' | this_BOOLEAN_2= RULE_BOOLEAN | this_QualifiedName_3= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2185:1: (this_signedINT_0= rulesignedINT | kw= 'null' | this_BOOLEAN_2= RULE_BOOLEAN | this_QualifiedName_3= ruleQualifiedName )
            int alt38=4;
            switch ( input.LA(1) ) {
            case RULE_ADDITIVE_OPERATION:
            case RULE_INT:
                {
                alt38=1;
                }
                break;
            case 43:
                {
                alt38=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt38=3;
                }
                break;
            case RULE_ID:
                {
                alt38=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2186:5: this_signedINT_0= rulesignedINT
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationValueAccess().getSignedINTParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleAnnotationValue4625);
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
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2198:2: kw= 'null'
                    {
                    kw=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleAnnotationValue4649); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnnotationValueAccess().getNullKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2204:10: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleAnnotationValue4670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_2, grammarAccess.getAnnotationValueAccess().getBOOLEANTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2213:5: this_QualifiedName_3= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationValueAccess().getQualifiedNameParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleAnnotationValue4703);
                    this_QualifiedName_3=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QualifiedName_3);
                          
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
    // $ANTLR end "ruleAnnotationValue"


    // $ANTLR start "entryRulesignedINT"
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2231:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2232:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2233:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedINTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_entryRulesignedINT4749);
            iv_rulesignedINT=rulesignedINT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignedINT4760); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2240:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ADDITIVE_OPERATION_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2243:28: ( ( (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2244:1: ( (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2244:1: ( (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2244:2: (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2244:2: (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ADDITIVE_OPERATION) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2244:7: this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION
                    {
                    this_ADDITIVE_OPERATION_0=(Token)match(input,RULE_ADDITIVE_OPERATION,FollowSets000.FOLLOW_RULE_ADDITIVE_OPERATION_in_rulesignedINT4801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ADDITIVE_OPERATION_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ADDITIVE_OPERATION_0, grammarAccess.getSignedINTAccess().getADDITIVE_OPERATIONTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulesignedINT4823); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2266:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2267:2: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2268:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression4868);
            iv_ruleConstantExpression=ruleConstantExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantExpression4878); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2275:1: ruleConstantExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2278:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2280:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConstantExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleConstantExpression4927);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2299:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2300:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2301:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression4961);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalOrExpression4971); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2308:1: ruleLogicalOrExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2311:28: ( ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2312:1: ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2312:1: ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2312:2: ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2312:2: ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2313:1: (lv_leftExpr_0_0= ruleLogicalAndExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2313:1: (lv_leftExpr_0_0= ruleLogicalAndExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2314:3: lv_leftExpr_0_0= ruleLogicalAndExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLeftExprLogicalAndExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5017);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2330:2: (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==44) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2330:4: otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) )
                    {
                    otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleLogicalOrExpression5030); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2334:1: ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2335:1: (lv_rightExpr_2_0= ruleLogicalOrExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2335:1: (lv_rightExpr_2_0= ruleLogicalOrExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2336:3: lv_rightExpr_2_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightExprLogicalOrExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleLogicalOrExpression5051);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2360:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2361:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2362:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression5089);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalAndExpression5099); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2369:1: ruleLogicalAndExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2372:28: ( ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2373:1: ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2373:1: ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2373:2: ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2373:2: ( (lv_leftExpr_0_0= ruleOrExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2374:1: (lv_leftExpr_0_0= ruleOrExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2374:1: (lv_leftExpr_0_0= ruleOrExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2375:3: lv_leftExpr_0_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLeftExprOrExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleLogicalAndExpression5145);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2391:2: (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2391:4: otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) )
                    {
                    otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleLogicalAndExpression5158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2395:1: ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2396:1: (lv_rightExpr_2_0= ruleLogicalAndExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2396:1: (lv_rightExpr_2_0= ruleLogicalAndExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2397:3: lv_rightExpr_2_0= ruleLogicalAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightExprLogicalAndExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalAndExpression5179);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2421:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2422:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2423:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression5217);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression5227); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2430:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2433:28: ( ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2434:1: ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2434:1: ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2434:2: ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2434:2: ( (lv_leftExpr_0_0= ruleXorExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2435:1: (lv_leftExpr_0_0= ruleXorExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2435:1: (lv_leftExpr_0_0= ruleXorExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2436:3: lv_leftExpr_0_0= ruleXorExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrExpressionAccess().getLeftExprXorExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_ruleOrExpression5273);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2452:2: (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2452:4: otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) )
                    {
                    otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleOrExpression5286); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2456:1: ( (lv_rightExpr_2_0= ruleOrExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2457:1: (lv_rightExpr_2_0= ruleOrExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2457:1: (lv_rightExpr_2_0= ruleOrExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2458:3: lv_rightExpr_2_0= ruleOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightExprOrExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleOrExpression5307);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2482:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2483:2: (iv_ruleXorExpression= ruleXorExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2484:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXorExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_entryRuleXorExpression5345);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXorExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXorExpression5355); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2491:1: ruleXorExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2494:28: ( ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2495:1: ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2495:1: ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2495:2: ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2495:2: ( (lv_leftExpr_0_0= ruleAndExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2496:1: (lv_leftExpr_0_0= ruleAndExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2496:1: (lv_leftExpr_0_0= ruleAndExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2497:3: lv_leftExpr_0_0= ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXorExpressionAccess().getLeftExprAndExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleXorExpression5401);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2513:2: (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2513:4: otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) )
                    {
                    otherlv_1=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleXorExpression5414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXorExpressionAccess().getCircumflexAccentKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2517:1: ( (lv_rightExpr_2_0= ruleXorExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2518:1: (lv_rightExpr_2_0= ruleXorExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2518:1: (lv_rightExpr_2_0= ruleXorExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2519:3: lv_rightExpr_2_0= ruleXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXorExpressionAccess().getRightExprXorExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_ruleXorExpression5435);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2543:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2544:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2545:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression5473);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression5483); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2552:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2555:28: ( ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2556:1: ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2556:1: ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2556:2: ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2556:2: ( (lv_leftExpr_0_0= ruleShiftExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2557:1: (lv_leftExpr_0_0= ruleShiftExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2557:1: (lv_leftExpr_0_0= ruleShiftExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2558:3: lv_leftExpr_0_0= ruleShiftExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAndExpressionAccess().getLeftExprShiftExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_ruleAndExpression5529);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2574:2: (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==48) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2574:4: otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) )
                    {
                    otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleAndExpression5542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2578:1: ( (lv_rightExpr_2_0= ruleAndExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2579:1: (lv_rightExpr_2_0= ruleAndExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2579:1: (lv_rightExpr_2_0= ruleAndExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2580:3: lv_rightExpr_2_0= ruleAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightExprAndExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleAndExpression5563);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2604:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2605:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2606:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression5601);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShiftExpression5611); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2613:1: ruleShiftExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2616:28: ( ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2617:1: ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2617:1: ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2617:2: ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2617:2: ( (lv_leftExpr_0_0= ruleAdditiveExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2618:1: (lv_leftExpr_0_0= ruleAdditiveExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2618:1: (lv_leftExpr_0_0= ruleAdditiveExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2619:3: lv_leftExpr_0_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getLeftExprAdditiveExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression5657);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2635:2: ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_SHIFT_OPERATION) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2635:3: ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2635:3: ( (lv_op_1_0= RULE_SHIFT_OPERATION ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2636:1: (lv_op_1_0= RULE_SHIFT_OPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2636:1: (lv_op_1_0= RULE_SHIFT_OPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2637:3: lv_op_1_0= RULE_SHIFT_OPERATION
                    {
                    lv_op_1_0=(Token)match(input,RULE_SHIFT_OPERATION,FollowSets000.FOLLOW_RULE_SHIFT_OPERATION_in_ruleShiftExpression5675); if (state.failed) return current;
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

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2653:2: ( (lv_rightExpr_2_0= ruleShiftExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2654:1: (lv_rightExpr_2_0= ruleShiftExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2654:1: (lv_rightExpr_2_0= ruleShiftExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2655:3: lv_rightExpr_2_0= ruleShiftExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightExprShiftExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_ruleShiftExpression5701);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2679:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2680:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2681:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression5739);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditiveExpression5749); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2688:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2691:28: ( ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2692:1: ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2692:1: ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2692:2: ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2692:2: ( (lv_leftExpr_0_0= ruleMulExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2693:1: (lv_leftExpr_0_0= ruleMulExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2693:1: (lv_leftExpr_0_0= ruleMulExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2694:3: lv_leftExpr_0_0= ruleMulExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getLeftExprMulExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_ruleAdditiveExpression5795);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2710:2: ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ADDITIVE_OPERATION) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2710:3: ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2710:3: ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2711:1: (lv_op_1_0= RULE_ADDITIVE_OPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2711:1: (lv_op_1_0= RULE_ADDITIVE_OPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2712:3: lv_op_1_0= RULE_ADDITIVE_OPERATION
                    {
                    lv_op_1_0=(Token)match(input,RULE_ADDITIVE_OPERATION,FollowSets000.FOLLOW_RULE_ADDITIVE_OPERATION_in_ruleAdditiveExpression5813); if (state.failed) return current;
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

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2728:2: ( (lv_rightExpr_2_0= ruleAdditiveExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2729:1: (lv_rightExpr_2_0= ruleAdditiveExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2729:1: (lv_rightExpr_2_0= ruleAdditiveExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2730:3: lv_rightExpr_2_0= ruleAdditiveExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_ruleAdditiveExpression5839);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2754:1: entryRuleMulExpression returns [EObject current=null] : iv_ruleMulExpression= ruleMulExpression EOF ;
    public final EObject entryRuleMulExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2755:2: (iv_ruleMulExpression= ruleMulExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2756:2: iv_ruleMulExpression= ruleMulExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_entryRuleMulExpression5877);
            iv_ruleMulExpression=ruleMulExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMulExpression5887); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2763:1: ruleMulExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? ) ;
    public final EObject ruleMulExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2766:28: ( ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2767:1: ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2767:1: ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2767:2: ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )?
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2767:2: ( (lv_leftExpr_0_0= ruleCastExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2768:1: (lv_leftExpr_0_0= ruleCastExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2768:1: (lv_leftExpr_0_0= ruleCastExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2769:3: lv_leftExpr_0_0= ruleCastExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMulExpressionAccess().getLeftExprCastExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_ruleMulExpression5933);
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2785:2: ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_MUL_OPERATION) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2785:3: ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2785:3: ( (lv_op_1_0= RULE_MUL_OPERATION ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2786:1: (lv_op_1_0= RULE_MUL_OPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2786:1: (lv_op_1_0= RULE_MUL_OPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2787:3: lv_op_1_0= RULE_MUL_OPERATION
                    {
                    lv_op_1_0=(Token)match(input,RULE_MUL_OPERATION,FollowSets000.FOLLOW_RULE_MUL_OPERATION_in_ruleMulExpression5951); if (state.failed) return current;
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

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2803:2: ( (lv_rightExpr_2_0= ruleMulExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2804:1: (lv_rightExpr_2_0= ruleMulExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2804:1: (lv_rightExpr_2_0= ruleMulExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2805:3: lv_rightExpr_2_0= ruleMulExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMulExpressionAccess().getRightExprMulExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_ruleMulExpression5977);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2829:1: entryRuleCastExpression returns [EObject current=null] : iv_ruleCastExpression= ruleCastExpression EOF ;
    public final EObject entryRuleCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2830:2: (iv_ruleCastExpression= ruleCastExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2831:2: iv_ruleCastExpression= ruleCastExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCastExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_entryRuleCastExpression6015);
            iv_ruleCastExpression=ruleCastExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCastExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCastExpression6025); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2838:1: ruleCastExpression returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_unaryExpr_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2841:28: ( ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2842:1: ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2842:1: ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==37) ) {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                case RULE_ADDITIVE_OPERATION:
                case RULE_INT:
                case RULE_UNARY_OPERATION:
                case 33:
                case 37:
                    {
                    alt48=2;
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
                        alt48=2;
                        }
                        break;
                    case 39:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case RULE_SHIFT_OPERATION:
                        case RULE_MUL_OPERATION:
                        case 18:
                        case 20:
                        case 21:
                        case 23:
                        case 24:
                        case 25:
                        case 27:
                        case 28:
                        case 32:
                        case 34:
                        case 39:
                        case 41:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                            {
                            alt48=2;
                            }
                            break;
                        case RULE_ADDITIVE_OPERATION:
                            {
                            int LA48_6 = input.LA(5);

                            if ( (LA48_6==RULE_INT) ) {
                                int LA48_7 = input.LA(6);

                                if ( (synpred54_InternalFractalIdt()) ) {
                                    alt48=1;
                                }
                                else if ( (true) ) {
                                    alt48=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 48, 7, input);

                                    throw nvae;
                                }
                            }
                            else if ( ((LA48_6>=RULE_ID && LA48_6<=RULE_STRING)||LA48_6==RULE_ADDITIVE_OPERATION||LA48_6==RULE_UNARY_OPERATION||LA48_6==33||LA48_6==37) ) {
                                alt48=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 48, 6, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RULE_ID:
                        case RULE_STRING:
                        case RULE_INT:
                        case RULE_UNARY_OPERATION:
                        case 33:
                        case 37:
                            {
                            alt48=1;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 48, 5, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 33:
                        {
                        alt48=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 3, input);

                        throw nvae;
                    }

                    }
                    break;
                case 24:
                case 25:
                case 27:
                case 38:
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
                    alt48=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_STRING)||(LA48_0>=RULE_ADDITIVE_OPERATION && LA48_0<=RULE_INT)||LA48_0==RULE_UNARY_OPERATION||LA48_0==33) ) {
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2842:2: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2842:2: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2842:4: otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) )
                    {
                    otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleCastExpression6063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCastExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2846:1: ( (lv_type_1_0= ruleQualifiedTypeSpecification ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2847:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2847:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2848:3: lv_type_1_0= ruleQualifiedTypeSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCastExpressionAccess().getTypeQualifiedTypeSpecificationParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleCastExpression6084);
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

                    otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleCastExpression6096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCastExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2868:1: ( (lv_expr_3_0= ruleCastExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2869:1: (lv_expr_3_0= ruleCastExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2869:1: (lv_expr_3_0= ruleCastExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2870:3: lv_expr_3_0= ruleCastExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCastExpressionAccess().getExprCastExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_ruleCastExpression6117);
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2887:6: ( (lv_unaryExpr_4_0= ruleUnaryExpression ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2887:6: ( (lv_unaryExpr_4_0= ruleUnaryExpression ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2888:1: (lv_unaryExpr_4_0= ruleUnaryExpression )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2888:1: (lv_unaryExpr_4_0= ruleUnaryExpression )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2889:3: lv_unaryExpr_4_0= ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCastExpressionAccess().getUnaryExprUnaryExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleCastExpression6145);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2913:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2914:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2915:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression6181);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression6191); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2922:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_unaryExpr_0_0=null;
        EObject lv_primaryExpr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2925:28: ( ( ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2926:1: ( ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2926:1: ( ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2926:2: ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2926:2: ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_UNARY_OPERATION) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2927:1: (lv_unaryExpr_0_0= RULE_UNARY_OPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2927:1: (lv_unaryExpr_0_0= RULE_UNARY_OPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2928:3: lv_unaryExpr_0_0= RULE_UNARY_OPERATION
                    {
                    lv_unaryExpr_0_0=(Token)match(input,RULE_UNARY_OPERATION,FollowSets000.FOLLOW_RULE_UNARY_OPERATION_in_ruleUnaryExpression6233); if (state.failed) return current;
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2944:3: ( (lv_primaryExpr_1_0= rulePrimaryExpression ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2945:1: (lv_primaryExpr_1_0= rulePrimaryExpression )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2945:1: (lv_primaryExpr_1_0= rulePrimaryExpression )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2946:3: lv_primaryExpr_1_0= rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExprPrimaryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression6260);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2970:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2971:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2972:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6296);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression6306); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2979:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_literal_0_0 = null;

        EObject this_ConstantExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2982:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2983:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2983:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_ID && LA50_0<=RULE_STRING)||(LA50_0>=RULE_ADDITIVE_OPERATION && LA50_0<=RULE_INT)||LA50_0==33) ) {
                alt50=1;
            }
            else if ( (LA50_0==37) ) {
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2983:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2983:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2984:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2984:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2985:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rulePrimaryExpression6352);
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3002:6: (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3002:6: (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3002:8: otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_rulePrimaryExpression6371); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstantExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_rulePrimaryExpression6396);
                    this_ConstantExpression_2=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_rulePrimaryExpression6407); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3030:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3031:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3032:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral6445);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral6456); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3039:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_FloatingPointLiteral_2= ruleFloatingPointLiteral ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_FloatingPointLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3042:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_FloatingPointLiteral_2= ruleFloatingPointLiteral ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3043:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_FloatingPointLiteral_2= ruleFloatingPointLiteral )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3043:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_FloatingPointLiteral_2= ruleFloatingPointLiteral )
            int alt51=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt51=1;
                }
                break;
            case RULE_STRING:
                {
                alt51=2;
                }
                break;
            case RULE_ADDITIVE_OPERATION:
            case RULE_INT:
            case 33:
                {
                alt51=3;
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3043:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLiteral6496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getLiteralAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3051:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLiteral6522); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3060:5: this_FloatingPointLiteral_2= ruleFloatingPointLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatingPointLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatingPointLiteral_in_ruleLiteral6555);
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3078:1: entryRuleFloatingPointLiteral returns [String current=null] : iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF ;
    public final String entryRuleFloatingPointLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPointLiteral = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3079:2: (iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3080:2: iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatingPointLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral6601);
            iv_ruleFloatingPointLiteral=ruleFloatingPointLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatingPointLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatingPointLiteral6612); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3087:1: ruleFloatingPointLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) ) ;
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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3090:28: ( ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3091:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3091:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) )
            int alt64=4;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3091:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3091:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3091:3: (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3091:3: (this_signedINT_0= rulesignedINT )+
                    int cnt52=0;
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( ((LA52_0>=RULE_ADDITIVE_OPERATION && LA52_0<=RULE_INT)) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3092:5: this_signedINT_0= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_0()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6661);
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
                    	    if ( cnt52 >= 1 ) break loop52;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(52, input);
                                throw eee;
                        }
                        cnt52++;
                    } while (true);

                    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFloatingPointLiteral6681); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatingPointLiteralAccess().getFullStopKeyword_0_1()); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3108:1: (this_signedINT_2= rulesignedINT )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==RULE_INT) ) {
                            int LA53_2 = input.LA(2);

                            if ( (synpred60_InternalFractalIdt()) ) {
                                alt53=1;
                            }


                        }
                        else if ( (LA53_0==RULE_ADDITIVE_OPERATION) ) {
                            int LA53_3 = input.LA(2);

                            if ( (LA53_3==RULE_INT) ) {
                                int LA53_5 = input.LA(3);

                                if ( (synpred60_InternalFractalIdt()) ) {
                                    alt53=1;
                                }


                            }


                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3109:5: this_signedINT_2= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_2()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6704);
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
                    	    break loop53;
                        }
                    } while (true);

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3119:3: (this_Exponent_3= ruleExponent )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_INT||(LA54_0>=49 && LA54_0<=50)) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3120:5: this_Exponent_3= ruleExponent
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_0_3()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral6734);
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

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3130:3: (this_FDSYMBOL_4= RULE_FDSYMBOL )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_FDSYMBOL) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3130:8: this_FDSYMBOL_4= RULE_FDSYMBOL
                            {
                            this_FDSYMBOL_4=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral6757); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3138:6: (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3138:6: (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3139:2: kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )?
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleFloatingPointLiteral6785); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatingPointLiteralAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3144:1: (this_signedINT_6= rulesignedINT )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==RULE_INT) ) {
                            int LA56_2 = input.LA(2);

                            if ( (synpred64_InternalFractalIdt()) ) {
                                alt56=1;
                            }


                        }
                        else if ( (LA56_0==RULE_ADDITIVE_OPERATION) ) {
                            int LA56_3 = input.LA(2);

                            if ( (LA56_3==RULE_INT) ) {
                                int LA56_5 = input.LA(3);

                                if ( (synpred64_InternalFractalIdt()) ) {
                                    alt56=1;
                                }


                            }


                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3145:5: this_signedINT_6= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6808);
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
                    	    if ( cnt56 >= 1 ) break loop56;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(56, input);
                                throw eee;
                        }
                        cnt56++;
                    } while (true);

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3155:3: (this_Exponent_7= ruleExponent )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_INT||(LA57_0>=49 && LA57_0<=50)) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3156:5: this_Exponent_7= ruleExponent
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_1_2()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral6838);
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

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3166:3: (this_FDSYMBOL_8= RULE_FDSYMBOL )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==RULE_FDSYMBOL) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3166:8: this_FDSYMBOL_8= RULE_FDSYMBOL
                            {
                            this_FDSYMBOL_8=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral6861); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3174:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3174:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3174:7: (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3174:7: (this_signedINT_9= rulesignedINT )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_INT) ) {
                            int LA59_2 = input.LA(2);

                            if ( (synpred68_InternalFractalIdt()) ) {
                                alt59=1;
                            }


                        }
                        else if ( (LA59_0==RULE_ADDITIVE_OPERATION) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3175:5: this_signedINT_9= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_2_0()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6899);
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
                    	    if ( cnt59 >= 1 ) break loop59;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral6928);
                    this_Exponent_10=ruleExponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Exponent_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3196:1: (this_FDSYMBOL_11= RULE_FDSYMBOL )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==RULE_FDSYMBOL) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3196:6: this_FDSYMBOL_11= RULE_FDSYMBOL
                            {
                            this_FDSYMBOL_11=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral6949); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3204:6: ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3204:6: ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3204:7: (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3204:7: (this_signedINT_12= rulesignedINT )+
                    int cnt61=0;
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==RULE_INT) ) {
                            int LA61_2 = input.LA(2);

                            if ( (synpred71_InternalFractalIdt()) ) {
                                alt61=1;
                            }


                        }
                        else if ( (LA61_0==RULE_ADDITIVE_OPERATION) ) {
                            int LA61_3 = input.LA(2);

                            if ( (synpred71_InternalFractalIdt()) ) {
                                alt61=1;
                            }


                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3205:5: this_signedINT_12= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_3_0()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6987);
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
                    	    if ( cnt61 >= 1 ) break loop61;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(61, input);
                                throw eee;
                        }
                        cnt61++;
                    } while (true);

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3215:3: (this_Exponent_13= ruleExponent )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==RULE_INT||(LA62_0>=49 && LA62_0<=50)) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3216:5: this_Exponent_13= ruleExponent
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_3_1()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7017);
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

                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3226:3: (this_FDSYMBOL_14= RULE_FDSYMBOL )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_FDSYMBOL) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3226:8: this_FDSYMBOL_14= RULE_FDSYMBOL
                            {
                            this_FDSYMBOL_14=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7040); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3241:1: entryRuleExponent returns [String current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final String entryRuleExponent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponent = null;


        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3242:2: (iv_ruleExponent= ruleExponent EOF )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3243:2: iv_ruleExponent= ruleExponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_entryRuleExponent7089);
            iv_ruleExponent=ruleExponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponent.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExponent7100); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3250:1: ruleExponent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+ ) ;
    public final AntlrDatatypeRuleToken ruleExponent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ADDITIVE_OPERATION_2=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3253:28: ( ( (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+ ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3254:1: ( (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+ )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3254:1: ( (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+ )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3254:2: (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3254:2: (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )?
            int alt65=3;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==49) ) {
                alt65=1;
            }
            else if ( (LA65_0==50) ) {
                alt65=2;
            }
            switch (alt65) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3255:2: kw= 'e'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleExponent7139); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExponentAccess().getEKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3261:6: (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3261:6: (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3262:2: kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION
                    {
                    kw=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleExponent7159); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExponentAccess().getEKeyword_0_1_0()); 
                          
                    }
                    this_ADDITIVE_OPERATION_2=(Token)match(input,RULE_ADDITIVE_OPERATION,FollowSets000.FOLLOW_RULE_ADDITIVE_OPERATION_in_ruleExponent7174); if (state.failed) return current;
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

            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3274:4: (this_INT_3= RULE_INT )+
            int cnt66=0;
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_INT) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3274:9: this_INT_3= RULE_INT
            	    {
            	    this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleExponent7198); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_INT_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_INT_3, grammarAccess.getExponentAccess().getINTTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt66 >= 1 ) break loop66;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(66, input);
                        throw eee;
                }
                cnt66++;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3289:1: ruleTypeQualifier returns [Enumerator current=null] : ( (enumLiteral_0= 'const' ) | (enumLiteral_1= 'volatile' ) ) ;
    public final Enumerator ruleTypeQualifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3291:28: ( ( (enumLiteral_0= 'const' ) | (enumLiteral_1= 'volatile' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3292:1: ( (enumLiteral_0= 'const' ) | (enumLiteral_1= 'volatile' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3292:1: ( (enumLiteral_0= 'const' ) | (enumLiteral_1= 'volatile' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==51) ) {
                alt67=1;
            }
            else if ( (LA67_0==52) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3292:2: (enumLiteral_0= 'const' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3292:2: (enumLiteral_0= 'const' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3292:4: enumLiteral_0= 'const'
                    {
                    enumLiteral_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTypeQualifier7259); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3298:6: (enumLiteral_1= 'volatile' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3298:6: (enumLiteral_1= 'volatile' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3298:8: enumLiteral_1= 'volatile'
                    {
                    enumLiteral_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTypeQualifier7276); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3308:1: ruleTypeSpecifier returns [Enumerator current=null] : ( (enumLiteral_0= 'void' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'signed' ) | (enumLiteral_8= 'unsigned' ) | (enumLiteral_9= 'string' ) | (enumLiteral_10= 'int8_t' ) | (enumLiteral_11= 'uint8_t' ) | (enumLiteral_12= 'int16_t' ) | (enumLiteral_13= 'uint16_t' ) | (enumLiteral_14= 'int32_t' ) | (enumLiteral_15= 'uint32_t' ) | (enumLiteral_16= 'int64_t' ) | (enumLiteral_17= 'uint64_t' ) | (enumLiteral_18= 'intptr_t' ) | (enumLiteral_19= 'uintptr_t' ) ) ;
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
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3310:28: ( ( (enumLiteral_0= 'void' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'signed' ) | (enumLiteral_8= 'unsigned' ) | (enumLiteral_9= 'string' ) | (enumLiteral_10= 'int8_t' ) | (enumLiteral_11= 'uint8_t' ) | (enumLiteral_12= 'int16_t' ) | (enumLiteral_13= 'uint16_t' ) | (enumLiteral_14= 'int32_t' ) | (enumLiteral_15= 'uint32_t' ) | (enumLiteral_16= 'int64_t' ) | (enumLiteral_17= 'uint64_t' ) | (enumLiteral_18= 'intptr_t' ) | (enumLiteral_19= 'uintptr_t' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3311:1: ( (enumLiteral_0= 'void' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'signed' ) | (enumLiteral_8= 'unsigned' ) | (enumLiteral_9= 'string' ) | (enumLiteral_10= 'int8_t' ) | (enumLiteral_11= 'uint8_t' ) | (enumLiteral_12= 'int16_t' ) | (enumLiteral_13= 'uint16_t' ) | (enumLiteral_14= 'int32_t' ) | (enumLiteral_15= 'uint32_t' ) | (enumLiteral_16= 'int64_t' ) | (enumLiteral_17= 'uint64_t' ) | (enumLiteral_18= 'intptr_t' ) | (enumLiteral_19= 'uintptr_t' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3311:1: ( (enumLiteral_0= 'void' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'signed' ) | (enumLiteral_8= 'unsigned' ) | (enumLiteral_9= 'string' ) | (enumLiteral_10= 'int8_t' ) | (enumLiteral_11= 'uint8_t' ) | (enumLiteral_12= 'int16_t' ) | (enumLiteral_13= 'uint16_t' ) | (enumLiteral_14= 'int32_t' ) | (enumLiteral_15= 'uint32_t' ) | (enumLiteral_16= 'int64_t' ) | (enumLiteral_17= 'uint64_t' ) | (enumLiteral_18= 'intptr_t' ) | (enumLiteral_19= 'uintptr_t' ) )
            int alt68=20;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt68=1;
                }
                break;
            case 53:
                {
                alt68=2;
                }
                break;
            case 54:
                {
                alt68=3;
                }
                break;
            case 55:
                {
                alt68=4;
                }
                break;
            case 56:
                {
                alt68=5;
                }
                break;
            case 57:
                {
                alt68=6;
                }
                break;
            case 58:
                {
                alt68=7;
                }
                break;
            case 59:
                {
                alt68=8;
                }
                break;
            case 60:
                {
                alt68=9;
                }
                break;
            case 61:
                {
                alt68=10;
                }
                break;
            case 62:
                {
                alt68=11;
                }
                break;
            case 63:
                {
                alt68=12;
                }
                break;
            case 64:
                {
                alt68=13;
                }
                break;
            case 65:
                {
                alt68=14;
                }
                break;
            case 66:
                {
                alt68=15;
                }
                break;
            case 67:
                {
                alt68=16;
                }
                break;
            case 68:
                {
                alt68=17;
                }
                break;
            case 69:
                {
                alt68=18;
                }
                break;
            case 70:
                {
                alt68=19;
                }
                break;
            case 71:
                {
                alt68=20;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3311:2: (enumLiteral_0= 'void' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3311:2: (enumLiteral_0= 'void' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3311:4: enumLiteral_0= 'void'
                    {
                    enumLiteral_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleTypeSpecifier7321); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3317:6: (enumLiteral_1= 'char' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3317:6: (enumLiteral_1= 'char' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3317:8: enumLiteral_1= 'char'
                    {
                    enumLiteral_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTypeSpecifier7338); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3323:6: (enumLiteral_2= 'short' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3323:6: (enumLiteral_2= 'short' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3323:8: enumLiteral_2= 'short'
                    {
                    enumLiteral_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTypeSpecifier7355); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3329:6: (enumLiteral_3= 'int' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3329:6: (enumLiteral_3= 'int' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3329:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleTypeSpecifier7372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3335:6: (enumLiteral_4= 'long' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3335:6: (enumLiteral_4= 'long' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3335:8: enumLiteral_4= 'long'
                    {
                    enumLiteral_4=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTypeSpecifier7389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3341:6: (enumLiteral_5= 'float' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3341:6: (enumLiteral_5= 'float' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3341:8: enumLiteral_5= 'float'
                    {
                    enumLiteral_5=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleTypeSpecifier7406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3347:6: (enumLiteral_6= 'double' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3347:6: (enumLiteral_6= 'double' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3347:8: enumLiteral_6= 'double'
                    {
                    enumLiteral_6=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTypeSpecifier7423); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3353:6: (enumLiteral_7= 'signed' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3353:6: (enumLiteral_7= 'signed' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3353:8: enumLiteral_7= 'signed'
                    {
                    enumLiteral_7=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleTypeSpecifier7440); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3359:6: (enumLiteral_8= 'unsigned' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3359:6: (enumLiteral_8= 'unsigned' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3359:8: enumLiteral_8= 'unsigned'
                    {
                    enumLiteral_8=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleTypeSpecifier7457); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3365:6: (enumLiteral_9= 'string' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3365:6: (enumLiteral_9= 'string' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3365:8: enumLiteral_9= 'string'
                    {
                    enumLiteral_9=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleTypeSpecifier7474); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3371:6: (enumLiteral_10= 'int8_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3371:6: (enumLiteral_10= 'int8_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3371:8: enumLiteral_10= 'int8_t'
                    {
                    enumLiteral_10=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleTypeSpecifier7491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3377:6: (enumLiteral_11= 'uint8_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3377:6: (enumLiteral_11= 'uint8_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3377:8: enumLiteral_11= 'uint8_t'
                    {
                    enumLiteral_11=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleTypeSpecifier7508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3383:6: (enumLiteral_12= 'int16_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3383:6: (enumLiteral_12= 'int16_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3383:8: enumLiteral_12= 'int16_t'
                    {
                    enumLiteral_12=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleTypeSpecifier7525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3389:6: (enumLiteral_13= 'uint16_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3389:6: (enumLiteral_13= 'uint16_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3389:8: enumLiteral_13= 'uint16_t'
                    {
                    enumLiteral_13=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleTypeSpecifier7542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3395:6: (enumLiteral_14= 'int32_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3395:6: (enumLiteral_14= 'int32_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3395:8: enumLiteral_14= 'int32_t'
                    {
                    enumLiteral_14=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleTypeSpecifier7559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3401:6: (enumLiteral_15= 'uint32_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3401:6: (enumLiteral_15= 'uint32_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3401:8: enumLiteral_15= 'uint32_t'
                    {
                    enumLiteral_15=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleTypeSpecifier7576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_15, grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15()); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3407:6: (enumLiteral_16= 'int64_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3407:6: (enumLiteral_16= 'int64_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3407:8: enumLiteral_16= 'int64_t'
                    {
                    enumLiteral_16=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleTypeSpecifier7593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_16, grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16()); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3413:6: (enumLiteral_17= 'uint64_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3413:6: (enumLiteral_17= 'uint64_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3413:8: enumLiteral_17= 'uint64_t'
                    {
                    enumLiteral_17=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleTypeSpecifier7610); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_17, grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17()); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3419:6: (enumLiteral_18= 'intptr_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3419:6: (enumLiteral_18= 'intptr_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3419:8: enumLiteral_18= 'intptr_t'
                    {
                    enumLiteral_18=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleTypeSpecifier7627); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_18, grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18()); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3425:6: (enumLiteral_19= 'uintptr_t' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3425:6: (enumLiteral_19= 'uintptr_t' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3425:8: enumLiteral_19= 'uintptr_t'
                    {
                    enumLiteral_19=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleTypeSpecifier7644); if (state.failed) return current;
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
    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3435:1: ruleParameterQualifier returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleParameterQualifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3437:28: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3438:1: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3438:1: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==72) ) {
                alt69=1;
            }
            else if ( (LA69_0==73) ) {
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
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3438:2: (enumLiteral_0= 'in' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3438:2: (enumLiteral_0= 'in' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3438:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleParameterQualifier7689); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3444:6: (enumLiteral_1= 'out' )
                    {
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3444:6: (enumLiteral_1= 'out' )
                    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3444:8: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleParameterQualifier7706); if (state.failed) return current;
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

    // $ANTLR start synpred54_InternalFractalIdt
    public final void synpred54_InternalFractalIdt_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;

        EObject lv_expr_3_0 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2842:2: ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2842:2: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2842:2: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2842:4: otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) )
        {
        otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_synpred54_InternalFractalIdt6063); if (state.failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2846:1: ( (lv_type_1_0= ruleQualifiedTypeSpecification ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2847:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2847:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2848:3: lv_type_1_0= ruleQualifiedTypeSpecification
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCastExpressionAccess().getTypeQualifiedTypeSpecificationParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_synpred54_InternalFractalIdt6084);
        lv_type_1_0=ruleQualifiedTypeSpecification();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,39,FollowSets000.FOLLOW_39_in_synpred54_InternalFractalIdt6096); if (state.failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2868:1: ( (lv_expr_3_0= ruleCastExpression ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2869:1: (lv_expr_3_0= ruleCastExpression )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2869:1: (lv_expr_3_0= ruleCastExpression )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:2870:3: lv_expr_3_0= ruleCastExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCastExpressionAccess().getExprCastExpressionParserRuleCall_0_3_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_synpred54_InternalFractalIdt6117);
        lv_expr_3_0=ruleCastExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred54_InternalFractalIdt

    // $ANTLR start synpred60_InternalFractalIdt
    public final void synpred60_InternalFractalIdt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_signedINT_2 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3109:5: (this_signedINT_2= rulesignedINT )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3109:5: this_signedINT_2= rulesignedINT
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_2()); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred60_InternalFractalIdt6704);
        this_signedINT_2=rulesignedINT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalFractalIdt

    // $ANTLR start synpred63_InternalFractalIdt
    public final void synpred63_InternalFractalIdt_fragment() throws RecognitionException {   
        Token kw=null;
        Token this_FDSYMBOL_4=null;
        AntlrDatatypeRuleToken this_signedINT_0 = null;

        AntlrDatatypeRuleToken this_signedINT_2 = null;

        AntlrDatatypeRuleToken this_Exponent_3 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3091:2: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3091:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3091:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3091:3: (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )?
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3091:3: (this_signedINT_0= rulesignedINT )+
        int cnt72=0;
        loop72:
        do {
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=RULE_ADDITIVE_OPERATION && LA72_0<=RULE_INT)) ) {
                alt72=1;
            }


            switch (alt72) {
        	case 1 :
        	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3092:5: this_signedINT_0= rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred63_InternalFractalIdt6661);
        	    this_signedINT_0=rulesignedINT();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt72 >= 1 ) break loop72;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(72, input);
                    throw eee;
            }
            cnt72++;
        } while (true);

        kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_synpred63_InternalFractalIdt6681); if (state.failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3108:1: (this_signedINT_2= rulesignedINT )*
        loop73:
        do {
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_INT) ) {
                int LA73_2 = input.LA(2);

                if ( (synpred60_InternalFractalIdt()) ) {
                    alt73=1;
                }


            }
            else if ( (LA73_0==RULE_ADDITIVE_OPERATION) ) {
                alt73=1;
            }


            switch (alt73) {
        	case 1 :
        	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3109:5: this_signedINT_2= rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred63_InternalFractalIdt6704);
        	    this_signedINT_2=rulesignedINT();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop73;
            }
        } while (true);

        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3119:3: (this_Exponent_3= ruleExponent )?
        int alt74=2;
        int LA74_0 = input.LA(1);

        if ( (LA74_0==RULE_INT||(LA74_0>=49 && LA74_0<=50)) ) {
            alt74=1;
        }
        switch (alt74) {
            case 1 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3120:5: this_Exponent_3= ruleExponent
                {
                pushFollow(FollowSets000.FOLLOW_ruleExponent_in_synpred63_InternalFractalIdt6734);
                this_Exponent_3=ruleExponent();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3130:3: (this_FDSYMBOL_4= RULE_FDSYMBOL )?
        int alt75=2;
        int LA75_0 = input.LA(1);

        if ( (LA75_0==RULE_FDSYMBOL) ) {
            alt75=1;
        }
        switch (alt75) {
            case 1 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3130:8: this_FDSYMBOL_4= RULE_FDSYMBOL
                {
                this_FDSYMBOL_4=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_synpred63_InternalFractalIdt6757); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred63_InternalFractalIdt

    // $ANTLR start synpred64_InternalFractalIdt
    public final void synpred64_InternalFractalIdt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_signedINT_6 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3145:5: (this_signedINT_6= rulesignedINT )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3145:5: this_signedINT_6= rulesignedINT
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_1_1()); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred64_InternalFractalIdt6808);
        this_signedINT_6=rulesignedINT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalFractalIdt

    // $ANTLR start synpred68_InternalFractalIdt
    public final void synpred68_InternalFractalIdt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_signedINT_9 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3175:5: (this_signedINT_9= rulesignedINT )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3175:5: this_signedINT_9= rulesignedINT
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_2_0()); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred68_InternalFractalIdt6899);
        this_signedINT_9=rulesignedINT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalFractalIdt

    // $ANTLR start synpred70_InternalFractalIdt
    public final void synpred70_InternalFractalIdt_fragment() throws RecognitionException {   
        Token this_FDSYMBOL_11=null;
        AntlrDatatypeRuleToken this_signedINT_9 = null;

        AntlrDatatypeRuleToken this_Exponent_10 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3174:6: ( ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3174:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? )
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3174:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3174:7: (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )?
        {
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3174:7: (this_signedINT_9= rulesignedINT )+
        int cnt79=0;
        loop79:
        do {
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_INT) ) {
                int LA79_2 = input.LA(2);

                if ( (synpred68_InternalFractalIdt()) ) {
                    alt79=1;
                }


            }
            else if ( (LA79_0==RULE_ADDITIVE_OPERATION) ) {
                alt79=1;
            }


            switch (alt79) {
        	case 1 :
        	    // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3175:5: this_signedINT_9= rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred70_InternalFractalIdt6899);
        	    this_signedINT_9=rulesignedINT();

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

        pushFollow(FollowSets000.FOLLOW_ruleExponent_in_synpred70_InternalFractalIdt6928);
        this_Exponent_10=ruleExponent();

        state._fsp--;
        if (state.failed) return ;
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3196:1: (this_FDSYMBOL_11= RULE_FDSYMBOL )?
        int alt80=2;
        int LA80_0 = input.LA(1);

        if ( (LA80_0==RULE_FDSYMBOL) ) {
            alt80=1;
        }
        switch (alt80) {
            case 1 :
                // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3196:6: this_FDSYMBOL_11= RULE_FDSYMBOL
                {
                this_FDSYMBOL_11=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_synpred70_InternalFractalIdt6949); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred70_InternalFractalIdt

    // $ANTLR start synpred71_InternalFractalIdt
    public final void synpred71_InternalFractalIdt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_signedINT_12 = null;


        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3205:5: (this_signedINT_12= rulesignedINT )
        // ../org.ow2.mindEd.idt.editor.textual.model/src-gen/org/ow2/mindEd/idt/editor/textual/parser/antlr/internal/InternalFractalIdt.g:3205:5: this_signedINT_12= rulesignedINT
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_3_0()); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred71_InternalFractalIdt6987);
        this_signedINT_12=rulesignedINT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_InternalFractalIdt

    // Delegated rules

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
    public final boolean synpred64_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalFractalIdt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalFractalIdt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalFractalIdt_fragment(); // can never throw exception
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


    protected DFA64 dfa64 = new DFA64(this);
    static final String DFA64_eotS =
        "\15\uffff";
    static final String DFA64_eofS =
        "\2\uffff\1\11\12\uffff";
    static final String DFA64_minS =
        "\1\10\1\11\1\10\2\uffff\1\0\1\10\1\11\1\10\2\uffff\1\0\1\11";
    static final String DFA64_maxS =
        "\1\41\1\11\1\62\2\uffff\1\0\1\41\1\11\1\10\2\uffff\1\0\1\11";
    static final String DFA64_acceptS =
        "\3\uffff\1\2\1\1\4\uffff\1\4\1\3\2\uffff";
    static final String DFA64_specialS =
        "\5\uffff\1\0\1\1\4\uffff\1\2\1\uffff}>";
    static final String[] DFA64_transitionS = {
            "\1\1\1\2\27\uffff\1\3",
            "\1\2",
            "\1\5\1\6\2\11\1\uffff\1\11\4\uffff\1\11\1\uffff\2\11\1\uffff"+
            "\3\11\1\uffff\2\11\3\uffff\1\11\1\4\1\11\4\uffff\1\11\1\uffff"+
            "\1\11\2\uffff\5\11\1\7\1\10",
            "",
            "",
            "\1\uffff",
            "\2\4\27\uffff\1\4",
            "\1\13",
            "\1\14",
            "",
            "",
            "\1\uffff",
            "\1\13"
    };

    static final short[] DFA64_eot = DFA.unpackEncodedString(DFA64_eotS);
    static final short[] DFA64_eof = DFA.unpackEncodedString(DFA64_eofS);
    static final char[] DFA64_min = DFA.unpackEncodedStringToUnsignedChars(DFA64_minS);
    static final char[] DFA64_max = DFA.unpackEncodedStringToUnsignedChars(DFA64_maxS);
    static final short[] DFA64_accept = DFA.unpackEncodedString(DFA64_acceptS);
    static final short[] DFA64_special = DFA.unpackEncodedString(DFA64_specialS);
    static final short[][] DFA64_transition;

    static {
        int numStates = DFA64_transitionS.length;
        DFA64_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA64_transition[i] = DFA.unpackEncodedString(DFA64_transitionS[i]);
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = DFA64_eot;
            this.eof = DFA64_eof;
            this.min = DFA64_min;
            this.max = DFA64_max;
            this.accept = DFA64_accept;
            this.special = DFA64_special;
            this.transition = DFA64_transition;
        }
        public String getDescription() {
            return "3091:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_5 = input.LA(1);

                         
                        int index64_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalFractalIdt()) ) {s = 4;}

                        else if ( (synpred70_InternalFractalIdt()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index64_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_6 = input.LA(1);

                         
                        int index64_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA64_6>=RULE_ADDITIVE_OPERATION && LA64_6<=RULE_INT)||LA64_6==33) ) {s = 4;}

                        else if ( (synpred70_InternalFractalIdt()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index64_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_11 = input.LA(1);

                         
                        int index64_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalFractalIdt()) ) {s = 10;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index64_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleIdtFile_in_entryRuleIdtFile81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIdtFile91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_ruleIdtFile137 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleIdtFile158 = new BitSet(new long[]{0x000002040B240000L});
        public static final BitSet FOLLOW_ruleIncludeDirective_in_ruleIdtFile179 = new BitSet(new long[]{0x000002040B240000L});
        public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleIdtFile202 = new BitSet(new long[]{0x000000040B240000L});
        public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleIdtFile229 = new BitSet(new long[]{0x000000040B240000L});
        public static final BitSet FOLLOW_18_in_ruleIdtFile243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantDefinitionBegin_in_entryRuleConstantDefinitionBegin279 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinitionBegin289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleConstantDefinitionBegin326 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinitionBegin343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition386 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition447 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition477 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition507 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleTypeDefinition519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification555 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedefSpecification565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleTypedefSpecification602 = new BitSet(new long[]{0xFFF800440B200010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification623 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleDeclarators_in_ruleTypedefSpecification644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification680 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification736 = new BitSet(new long[]{0xFFF800440B200010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification758 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification794 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecification804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeSpecification850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification938 = new BitSet(new long[]{0xFFF800440B200012L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification959 = new BitSet(new long[]{0xFFF800440B200012L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionSpecification1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification1057 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification1087 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition1122 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1178 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1195 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleStructOrUnionDefinition1213 = new BitSet(new long[]{0xFFF804440BA00010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1234 = new BitSet(new long[]{0xFFF804440BA00010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_23_in_ruleStructOrUnionDefinition1247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1283 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructorUnionReference1293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1339 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStructorUnionReference1356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1398 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnion1409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleStructOrUnion1447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleStructOrUnion1466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructMember_in_entryRuleStructMember1506 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructMember1516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleStructMember1562 = new BitSet(new long[]{0xFFF800440B200010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1584 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleDeclarators_in_ruleStructMember1605 = new BitSet(new long[]{0x0000000004100000L});
        public static final BitSet FOLLOW_26_in_ruleStructMember1618 = new BitSet(new long[]{0x0000002200001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleStructMember1639 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleStructMember1653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1689 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecification1699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumReference_in_ruleEnumSpecification1779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1814 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumDefinition1824 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEnumDefinition1861 = new BitSet(new long[]{0x0000000000400010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDefinition1878 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleEnumDefinition1896 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition1917 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleEnumDefinition1929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumReference_in_entryRuleEnumReference1965 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumReference1975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEnumReference2012 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumReference2029 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList2070 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumMemberList2080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2126 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleEnumMemberList2139 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2160 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember2198 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember2208 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumMember2250 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_29_in_ruleEnumMember2268 = new BitSet(new long[]{0x0000002200001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleEnumMember2289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclarators_in_entryRuleDeclarators2327 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclarators2337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2383 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleDeclarators2396 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2417 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator2455 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator2465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePointerSpecification_in_ruleDeclarator2511 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2532 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePointerSpecification_in_entryRulePointerSpecification2569 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePointerSpecification2580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rulePointerSpecification2617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2656 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDirectDeclarator2666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDirectDeclarator2708 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator2734 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification2771 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArraySpecification2781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleArraySpecification2825 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleArraySpecification2850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleArraySpecification2870 = new BitSet(new long[]{0x0000002200001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleArraySpecification2891 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleArraySpecification2903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2941 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2992 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_33_in_ruleQualifiedName3011 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3026 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition3073 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition3083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleConstantDefinition3120 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinition3137 = new BitSet(new long[]{0x0000002200001332L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleConstantDefinition3163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition3200 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition3210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleInterfaceDefinition3256 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleInterfaceDefinition3269 = new BitSet(new long[]{0x0000001000000010L});
        public static final BitSet FOLLOW_36_in_ruleInterfaceDefinition3282 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition3305 = new BitSet(new long[]{0x0000000004400000L});
        public static final BitSet FOLLOW_26_in_ruleInterfaceDefinition3318 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition3339 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleInterfaceDefinition3353 = new BitSet(new long[]{0xFFF804440BA00010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3374 = new BitSet(new long[]{0xFFF804440BA00010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_23_in_ruleInterfaceDefinition3387 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3423 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethodDefinition3433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleMethodDefinition3479 = new BitSet(new long[]{0xFFF800440B200010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3501 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rulePointerSpecification_in_ruleMethodDefinition3522 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMethodDefinition3539 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleMethodDefinition3558 = new BitSet(new long[]{0x000000C000000000L});
        public static final BitSet FOLLOW_38_in_ruleMethodDefinition3571 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleMethodDefinition3585 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_37_in_ruleMethodDefinition3605 = new BitSet(new long[]{0xFFF804440B200010L,0x00000000000003FFL});
        public static final BitSet FOLLOW_ruleParameterList_in_ruleMethodDefinition3626 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleMethodDefinition3638 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleMethodDefinition3652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList3688 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterList3698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList3744 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleParameterList3757 = new BitSet(new long[]{0xFFF804440B200010L,0x00000000000003FFL});
        public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList3778 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleParameterList3793 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleParameterList3805 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3843 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter3853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleParameter3899 = new BitSet(new long[]{0xFFF800440B200010L,0x00000000000003FFL});
        public static final BitSet FOLLOW_ruleParameterQualifier_in_ruleParameter3921 = new BitSet(new long[]{0xFFF800440B200010L,0x00000000000003FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter3943 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleParameter3964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective4000 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDirective4010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleIncludeDirective4047 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludeDirective4065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INCLUDE_LIB_in_ruleIncludeDirective4093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList4135 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList4145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList4191 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList4212 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleAnnotation4296 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotation4317 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_37_in_ruleAnnotation4330 = new BitSet(new long[]{0x0000080000000390L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_ruleAnnotation4351 = new BitSet(new long[]{0x0000008010000000L});
        public static final BitSet FOLLOW_28_in_ruleAnnotation4364 = new BitSet(new long[]{0x0000080000000390L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_ruleAnnotation4385 = new BitSet(new long[]{0x0000008010000000L});
        public static final BitSet FOLLOW_39_in_ruleAnnotation4399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_entryRuleAnnotationValuePair4437 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValuePair4447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationValuePair4490 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleAnnotationValuePair4507 = new BitSet(new long[]{0x0000080000000390L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleAnnotationValuePair4530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue4567 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValue4578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleAnnotationValue4625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleAnnotationValue4649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleAnnotationValue4670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotationValue4703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT4749 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignedINT4760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ADDITIVE_OPERATION_in_rulesignedINT4801 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT4823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression4868 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression4878 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConstantExpression4927 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression4961 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression4971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression5017 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_44_in_ruleLogicalOrExpression5030 = new BitSet(new long[]{0x0000002200001330L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleLogicalOrExpression5051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression5089 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression5099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleLogicalAndExpression5145 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleLogicalAndExpression5158 = new BitSet(new long[]{0x0000002200001330L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalAndExpression5179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression5217 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression5227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXorExpression_in_ruleOrExpression5273 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_46_in_ruleOrExpression5286 = new BitSet(new long[]{0x0000002200001330L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleOrExpression5307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXorExpression_in_entryRuleXorExpression5345 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXorExpression5355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleXorExpression5401 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_47_in_ruleXorExpression5414 = new BitSet(new long[]{0x0000002200001330L});
        public static final BitSet FOLLOW_ruleXorExpression_in_ruleXorExpression5435 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression5473 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression5483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_ruleAndExpression5529 = new BitSet(new long[]{0x0001000000000002L});
        public static final BitSet FOLLOW_48_in_ruleAndExpression5542 = new BitSet(new long[]{0x0000002200001330L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleAndExpression5563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression5601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression5611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression5657 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_RULE_SHIFT_OPERATION_in_ruleShiftExpression5675 = new BitSet(new long[]{0x0000002200001330L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_ruleShiftExpression5701 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression5739 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression5749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMulExpression_in_ruleAdditiveExpression5795 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_RULE_ADDITIVE_OPERATION_in_ruleAdditiveExpression5813 = new BitSet(new long[]{0x0000002200001330L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleAdditiveExpression5839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMulExpression_in_entryRuleMulExpression5877 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMulExpression5887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCastExpression_in_ruleMulExpression5933 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_RULE_MUL_OPERATION_in_ruleMulExpression5951 = new BitSet(new long[]{0x0000002200001330L});
        public static final BitSet FOLLOW_ruleMulExpression_in_ruleMulExpression5977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCastExpression_in_entryRuleCastExpression6015 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCastExpression6025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleCastExpression6063 = new BitSet(new long[]{0xFFF800440B200010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleCastExpression6084 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_ruleCastExpression6096 = new BitSet(new long[]{0x0000002200001330L});
        public static final BitSet FOLLOW_ruleCastExpression_in_ruleCastExpression6117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleCastExpression6145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression6181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression6191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_UNARY_OPERATION_in_ruleUnaryExpression6233 = new BitSet(new long[]{0x0000002200001330L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression6260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6296 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression6306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression6352 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rulePrimaryExpression6371 = new BitSet(new long[]{0x0000002200001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_rulePrimaryExpression6396 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_rulePrimaryExpression6407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6445 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral6496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral6522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_ruleLiteral6555 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral6601 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointLiteral6612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6661 = new BitSet(new long[]{0x0000000200000300L});
        public static final BitSet FOLLOW_33_in_ruleFloatingPointLiteral6681 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6704 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral6734 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral6757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleFloatingPointLiteral6785 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6808 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral6838 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral6861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6899 = new BitSet(new long[]{0x0006000000000300L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral6928 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral6949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6987 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral7017 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral7040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExponent_in_entryRuleExponent7089 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExponent7100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleExponent7139 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_50_in_ruleExponent7159 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_ADDITIVE_OPERATION_in_ruleExponent7174 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleExponent7198 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_51_in_ruleTypeQualifier7259 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTypeQualifier7276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleTypeSpecifier7321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTypeSpecifier7338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTypeSpecifier7355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleTypeSpecifier7372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleTypeSpecifier7389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleTypeSpecifier7406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleTypeSpecifier7423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleTypeSpecifier7440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleTypeSpecifier7457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleTypeSpecifier7474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleTypeSpecifier7491 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleTypeSpecifier7508 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleTypeSpecifier7525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleTypeSpecifier7542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleTypeSpecifier7559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleTypeSpecifier7576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleTypeSpecifier7593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleTypeSpecifier7610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleTypeSpecifier7627 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleTypeSpecifier7644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleParameterQualifier7689 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleParameterQualifier7706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_synpred54_InternalFractalIdt6063 = new BitSet(new long[]{0xFFF800440B200010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_synpred54_InternalFractalIdt6084 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_39_in_synpred54_InternalFractalIdt6096 = new BitSet(new long[]{0x0000002200001330L});
        public static final BitSet FOLLOW_ruleCastExpression_in_synpred54_InternalFractalIdt6117 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred60_InternalFractalIdt6704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred63_InternalFractalIdt6661 = new BitSet(new long[]{0x0000000200000300L});
        public static final BitSet FOLLOW_33_in_synpred63_InternalFractalIdt6681 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred63_InternalFractalIdt6704 = new BitSet(new long[]{0x0006000000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_synpred63_InternalFractalIdt6734 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_synpred63_InternalFractalIdt6757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred64_InternalFractalIdt6808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred68_InternalFractalIdt6899 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred70_InternalFractalIdt6899 = new BitSet(new long[]{0x0006000000000300L});
        public static final BitSet FOLLOW_ruleExponent_in_synpred70_InternalFractalIdt6928 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_synpred70_InternalFractalIdt6949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred71_InternalFractalIdt6987 = new BitSet(new long[]{0x0000000000000002L});
    }


}
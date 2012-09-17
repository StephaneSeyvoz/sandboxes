package org.ow2.mindEd.itf.editor.textual.parser.antlr.internal; 

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
import org.ow2.mindEd.itf.editor.textual.services.FractalItfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFractalItfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INCLUDE_LIB", "RULE_BOOLEAN", "RULE_ADDITIVE_OPERATION", "RULE_INT", "RULE_SHIFT_OPERATION", "RULE_MUL_OPERATION", "RULE_UNARY_OPERATION", "RULE_FDSYMBOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "';'", "'typedef'", "'{'", "'}'", "'struct'", "'union'", "':'", "'enum'", "','", "'='", "'*'", "'['", "']'", "'.'", "'#define'", "'interface'", "'unmanaged'", "'('", "'void'", "')'", "'...'", "'#include'", "'@'", "'null'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'e'", "'E'", "'const'", "'volatile'", "'char'", "'short'", "'int'", "'long'", "'float'", "'double'", "'signed'", "'unsigned'", "'string'", "'int8_t'", "'uint8_t'", "'int16_t'", "'uint16_t'", "'int32_t'", "'uint32_t'", "'int64_t'", "'uint64_t'", "'intptr_t'", "'uintptr_t'", "'in'", "'out'"
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
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_ADDITIVE_OPERATION=8;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=16;

    // delegates
    // delegators


        public InternalFractalItfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFractalItfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFractalItfParser.tokenNames; }
    public String getGrammarFileName() { return "../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private FractalItfGrammarAccess grammarAccess;
     	
        public InternalFractalItfParser(TokenStream input, FractalItfGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ItfFile";	
       	}
       	
       	@Override
       	protected FractalItfGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleItfFile"
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:74:1: entryRuleItfFile returns [EObject current=null] : iv_ruleItfFile= ruleItfFile EOF ;
    public final EObject entryRuleItfFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItfFile = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:75:2: (iv_ruleItfFile= ruleItfFile EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:76:2: iv_ruleItfFile= ruleItfFile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getItfFileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleItfFile_in_entryRuleItfFile81);
            iv_ruleItfFile=ruleItfFile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleItfFile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleItfFile91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItfFile"


    // $ANTLR start "ruleItfFile"
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:83:1: ruleItfFile returns [EObject current=null] : ( ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )* ( (lv_interface_3_0= ruleInterfaceDefinition ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleItfFile() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject lv_includes_0_0 = null;

        EObject lv_constant_1_0 = null;

        EObject lv_type_2_0 = null;

        EObject lv_interface_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:86:28: ( ( ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )* ( (lv_interface_3_0= ruleInterfaceDefinition ) ) (otherlv_4= ';' )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:87:1: ( ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )* ( (lv_interface_3_0= ruleInterfaceDefinition ) ) (otherlv_4= ';' )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:87:1: ( ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )* ( (lv_interface_3_0= ruleInterfaceDefinition ) ) (otherlv_4= ';' )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:87:2: ( (lv_includes_0_0= ruleIncludeDirective ) )* ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )* ( (lv_interface_3_0= ruleInterfaceDefinition ) ) (otherlv_4= ';' )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:87:2: ( (lv_includes_0_0= ruleIncludeDirective ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==39) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:88:1: (lv_includes_0_0= ruleIncludeDirective )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:88:1: (lv_includes_0_0= ruleIncludeDirective )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:89:3: lv_includes_0_0= ruleIncludeDirective
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getItfFileAccess().getIncludesIncludeDirectiveParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleIncludeDirective_in_ruleItfFile137);
            	    lv_includes_0_0=ruleIncludeDirective();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getItfFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"includes",
            	              		lv_includes_0_0, 
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:105:3: ( ( (lv_constant_1_0= ruleConstantDefinition ) ) | ( (lv_type_2_0= ruleTypeDefinition ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==32) ) {
                    alt2=1;
                }
                else if ( (LA2_0==19||(LA2_0>=22 && LA2_0<=23)||LA2_0==25) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:105:4: ( (lv_constant_1_0= ruleConstantDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:105:4: ( (lv_constant_1_0= ruleConstantDefinition ) )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:106:1: (lv_constant_1_0= ruleConstantDefinition )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:106:1: (lv_constant_1_0= ruleConstantDefinition )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:107:3: lv_constant_1_0= ruleConstantDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getItfFileAccess().getConstantConstantDefinitionParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleConstantDefinition_in_ruleItfFile160);
            	    lv_constant_1_0=ruleConstantDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getItfFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constant",
            	              		lv_constant_1_0, 
            	              		"ConstantDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:124:6: ( (lv_type_2_0= ruleTypeDefinition ) )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:124:6: ( (lv_type_2_0= ruleTypeDefinition ) )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:125:1: (lv_type_2_0= ruleTypeDefinition )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:125:1: (lv_type_2_0= ruleTypeDefinition )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:126:3: lv_type_2_0= ruleTypeDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getItfFileAccess().getTypeTypeDefinitionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeDefinition_in_ruleItfFile187);
            	    lv_type_2_0=ruleTypeDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getItfFileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"type",
            	              		lv_type_2_0, 
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:142:4: ( (lv_interface_3_0= ruleInterfaceDefinition ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:143:1: (lv_interface_3_0= ruleInterfaceDefinition )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:143:1: (lv_interface_3_0= ruleInterfaceDefinition )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:144:3: lv_interface_3_0= ruleInterfaceDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getItfFileAccess().getInterfaceInterfaceDefinitionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_ruleItfFile210);
            lv_interface_3_0=ruleInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getItfFileRule());
              	        }
                     		set(
                     			current, 
                     			"interface",
                      		lv_interface_3_0, 
                      		"InterfaceDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:160:2: (otherlv_4= ';' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:160:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleItfFile223); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getItfFileAccess().getSemicolonKeyword_3());
                          
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
    // $ANTLR end "ruleItfFile"


    // $ANTLR start "entryRuleTypeDefinition"
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:172:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:173:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:174:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition261);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeDefinition271); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:181:1: ruleTypeDefinition returns [EObject current=null] : ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';' ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_TypedefSpecification_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:184:28: ( ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:185:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:185:1: ( (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:185:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification ) otherlv_3= ';'
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:185:2: (this_TypedefSpecification_0= ruleTypedefSpecification | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt4=1;
                }
                break;
            case 22:
            case 23:
                {
                alt4=2;
                }
                break;
            case 25:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:186:2: this_TypedefSpecification_0= ruleTypedefSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTypedefSpecificationParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition322);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:199:2: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getStructOrUnionSpecificationParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition352);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:212:2: this_EnumSpecification_2= ruleEnumSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getEnumSpecificationParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition382);
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

            otherlv_3=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTypeDefinition394); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:235:1: entryRuleTypedefSpecification returns [EObject current=null] : iv_ruleTypedefSpecification= ruleTypedefSpecification EOF ;
    public final EObject entryRuleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedefSpecification = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:236:2: (iv_ruleTypedefSpecification= ruleTypedefSpecification EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:237:2: iv_ruleTypedefSpecification= ruleTypedefSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedefSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification430);
            iv_ruleTypedefSpecification=ruleTypedefSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedefSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypedefSpecification440); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:244:1: ruleTypedefSpecification returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) ;
    public final EObject ruleTypedefSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_qualifedType_1_0 = null;

        EObject lv_dec_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:247:28: ( (otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:248:1: (otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:248:1: (otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:248:3: otherlv_0= 'typedef' ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) )
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTypedefSpecification477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypedefSpecificationAccess().getTypedefKeyword_0());
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:252:1: ( (lv_qualifedType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:253:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:253:1: (lv_qualifedType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:254:3: lv_qualifedType_1_0= ruleQualifiedTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedefSpecificationAccess().getQualifedTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification498);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:270:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:271:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:271:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:272:3: lv_dec_2_0= ruleDeclarators
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypedefSpecificationAccess().getDecDeclaratorsParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_ruleTypedefSpecification519);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:296:1: entryRuleQualifiedTypeSpecification returns [EObject current=null] : iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF ;
    public final EObject entryRuleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedTypeSpecification = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:297:2: (iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:298:2: iv_ruleQualifiedTypeSpecification= ruleQualifiedTypeSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedTypeSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification555);
            iv_ruleQualifiedTypeSpecification=ruleQualifiedTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedTypeSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification565); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:305:1: ruleQualifiedTypeSpecification returns [EObject current=null] : ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) ;
    public final EObject ruleQualifiedTypeSpecification() throws RecognitionException {
        EObject current = null;

        Enumerator lv_typeQualifier_0_0 = null;

        EObject lv_typeSpec_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:308:28: ( ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:309:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:309:1: ( ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:309:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )* ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:309:2: ( (lv_typeQualifier_0_0= ruleTypeQualifier ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=49 && LA5_0<=50)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:310:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:310:1: (lv_typeQualifier_0_0= ruleTypeQualifier )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:311:3: lv_typeQualifier_0_0= ruleTypeQualifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeQualifierTypeQualifierEnumRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification611);
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
            	    break loop5;
                }
            } while (true);

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:327:3: ( (lv_typeSpec_1_0= ruleTypeSpecification ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:328:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:328:1: (lv_typeSpec_1_0= ruleTypeSpecification )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:329:3: lv_typeSpec_1_0= ruleTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQualifiedTypeSpecificationAccess().getTypeSpecTypeSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification633);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:353:1: entryRuleTypeSpecification returns [EObject current=null] : iv_ruleTypeSpecification= ruleTypeSpecification EOF ;
    public final EObject entryRuleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecification = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:354:2: (iv_ruleTypeSpecification= ruleTypeSpecification EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:355:2: iv_ruleTypeSpecification= ruleTypeSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification669);
            iv_ruleTypeSpecification=ruleTypeSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeSpecification679); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:362:1: ruleTypeSpecification returns [EObject current=null] : ( ( (lv_typeDefName_0_0= ruleQualifiedName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) ) ;
    public final EObject ruleTypeSpecification() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_typeDefName_0_0 = null;

        EObject this_StructOrUnionSpecification_1 = null;

        EObject this_EnumSpecification_2 = null;

        Enumerator lv_typeSpecifier_3_0 = null;

        Enumerator lv_typeSpecifier_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:365:28: ( ( ( (lv_typeDefName_0_0= ruleQualifiedName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:366:1: ( ( (lv_typeDefName_0_0= ruleQualifiedName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:366:1: ( ( (lv_typeDefName_0_0= ruleQualifiedName ) ) | this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification | this_EnumSpecification_2= ruleEnumSpecification | ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt7=1;
                }
                break;
            case 22:
            case 23:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 36:
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
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:366:2: ( (lv_typeDefName_0_0= ruleQualifiedName ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:366:2: ( (lv_typeDefName_0_0= ruleQualifiedName ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:367:1: (lv_typeDefName_0_0= ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:367:1: (lv_typeDefName_0_0= ruleQualifiedName )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:368:3: lv_typeDefName_0_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeDefNameQualifiedNameParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTypeSpecification725);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:386:2: this_StructOrUnionSpecification_1= ruleStructOrUnionSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeSpecificationAccess().getStructOrUnionSpecificationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification756);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:399:2: this_EnumSpecification_2= ruleEnumSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeSpecificationAccess().getEnumSpecificationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification786);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:411:6: ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:411:6: ( ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )* )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:411:7: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) ) ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )*
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:411:7: ( (lv_typeSpecifier_3_0= ruleTypeSpecifier ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:412:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:412:1: (lv_typeSpecifier_3_0= ruleTypeSpecifier )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:413:3: lv_typeSpecifier_3_0= ruleTypeSpecifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification813);
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

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:429:2: ( (lv_typeSpecifier_4_0= ruleTypeSpecifier ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==36||(LA6_0>=51 && LA6_0<=69)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:430:1: (lv_typeSpecifier_4_0= ruleTypeSpecifier )
                    	    {
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:430:1: (lv_typeSpecifier_4_0= ruleTypeSpecifier )
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:431:3: lv_typeSpecifier_4_0= ruleTypeSpecifier
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTypeSpecificationAccess().getTypeSpecifierTypeSpecifierEnumRuleCall_3_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification834);
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
                    	    break loop6;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:455:1: entryRuleStructOrUnionSpecification returns [EObject current=null] : iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF ;
    public final EObject entryRuleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionSpecification = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:456:2: (iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:457:2: iv_ruleStructOrUnionSpecification= ruleStructOrUnionSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructOrUnionSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification872);
            iv_ruleStructOrUnionSpecification=ruleStructOrUnionSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructOrUnionSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnionSpecification882); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:464:1: ruleStructOrUnionSpecification returns [EObject current=null] : (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) ;
    public final EObject ruleStructOrUnionSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StructOrUnionDefinition_0 = null;

        EObject this_StructorUnionReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:467:28: ( (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:468:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:468:1: (this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition | this_StructorUnionReference_1= ruleStructorUnionReference )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==20) ) {
                        alt8=1;
                    }
                    else if ( (LA8_3==EOF||LA8_3==RULE_ID||LA8_3==18||LA8_3==28||LA8_3==37) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA8_1==20) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==23) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_ID) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==20) ) {
                        alt8=1;
                    }
                    else if ( (LA8_3==EOF||LA8_3==RULE_ID||LA8_3==18||LA8_3==28||LA8_3==37) ) {
                        alt8=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA8_2==20) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:469:2: this_StructOrUnionDefinition_0= ruleStructOrUnionDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructOrUnionDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification932);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:482:2: this_StructorUnionReference_1= ruleStructorUnionReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStructOrUnionSpecificationAccess().getStructorUnionReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification962);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:501:1: entryRuleStructOrUnionDefinition returns [EObject current=null] : iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF ;
    public final EObject entryRuleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructOrUnionDefinition = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:502:2: (iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:503:2: iv_ruleStructOrUnionDefinition= ruleStructOrUnionDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructOrUnionDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition997);
            iv_ruleStructOrUnionDefinition=ruleStructOrUnionDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructOrUnionDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1007); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:510:1: ruleStructOrUnionDefinition returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}' ) ;
    public final EObject ruleStructOrUnionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;

        EObject lv_structMember_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:513:28: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:514:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:514:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:514:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_structMember_3_0= ruleStructMember ) )* otherlv_4= '}'
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:514:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:515:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:515:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:516:3: lv_struct_0_0= ruleStructOrUnion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructStructOrUnionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1053);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:532:2: ( (lv_name_1_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:533:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:533:1: (lv_name_1_0= RULE_ID )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:534:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1070); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStructOrUnionDefinition1088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getStructOrUnionDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:554:1: ( (lv_structMember_3_0= ruleStructMember ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||(LA10_0>=22 && LA10_0<=23)||LA10_0==25||LA10_0==36||LA10_0==40||(LA10_0>=49 && LA10_0<=69)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:555:1: (lv_structMember_3_0= ruleStructMember )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:555:1: (lv_structMember_3_0= ruleStructMember )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:556:3: lv_structMember_3_0= ruleStructMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStructOrUnionDefinitionAccess().getStructMemberStructMemberParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1109);
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
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleStructOrUnionDefinition1122); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:584:1: entryRuleStructorUnionReference returns [EObject current=null] : iv_ruleStructorUnionReference= ruleStructorUnionReference EOF ;
    public final EObject entryRuleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructorUnionReference = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:585:2: (iv_ruleStructorUnionReference= ruleStructorUnionReference EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:586:2: iv_ruleStructorUnionReference= ruleStructorUnionReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructorUnionReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1158);
            iv_ruleStructorUnionReference=ruleStructorUnionReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructorUnionReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructorUnionReference1168); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:593:1: ruleStructorUnionReference returns [EObject current=null] : ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStructorUnionReference() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_struct_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:596:28: ( ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:597:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:597:1: ( ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:597:2: ( (lv_struct_0_0= ruleStructOrUnion ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:597:2: ( (lv_struct_0_0= ruleStructOrUnion ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:598:1: (lv_struct_0_0= ruleStructOrUnion )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:598:1: (lv_struct_0_0= ruleStructOrUnion )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:599:3: lv_struct_0_0= ruleStructOrUnion
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructorUnionReferenceAccess().getStructStructOrUnionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1214);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:615:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:616:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:616:1: (lv_name_1_0= RULE_ID )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:617:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleStructorUnionReference1231); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:641:1: entryRuleStructOrUnion returns [String current=null] : iv_ruleStructOrUnion= ruleStructOrUnion EOF ;
    public final String entryRuleStructOrUnion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructOrUnion = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:642:2: (iv_ruleStructOrUnion= ruleStructOrUnion EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:643:2: iv_ruleStructOrUnion= ruleStructOrUnion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructOrUnionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1273);
            iv_ruleStructOrUnion=ruleStructOrUnion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructOrUnion.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructOrUnion1284); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:650:1: ruleStructOrUnion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'struct' | kw= 'union' ) ;
    public final AntlrDatatypeRuleToken ruleStructOrUnion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:653:28: ( (kw= 'struct' | kw= 'union' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:654:1: (kw= 'struct' | kw= 'union' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:654:1: (kw= 'struct' | kw= 'union' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==23) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:655:2: kw= 'struct'
                    {
                    kw=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStructOrUnion1322); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getStructOrUnionAccess().getStructKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:662:2: kw= 'union'
                    {
                    kw=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleStructOrUnion1341); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:675:1: entryRuleStructMember returns [EObject current=null] : iv_ruleStructMember= ruleStructMember EOF ;
    public final EObject entryRuleStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructMember = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:676:2: (iv_ruleStructMember= ruleStructMember EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:677:2: iv_ruleStructMember= ruleStructMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStructMemberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleStructMember_in_entryRuleStructMember1381);
            iv_ruleStructMember=ruleStructMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStructMember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructMember1391); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:684:1: ruleStructMember returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';' ) ;
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
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:687:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:688:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:688:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:688:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_2_0= ruleDeclarators ) ) (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )? otherlv_5= ';'
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:688:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:689:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:689:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:690:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStructMemberAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleStructMember1437);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:706:3: ( (lv_qualType_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:707:1: (lv_qualType_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:707:1: (lv_qualType_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:708:3: lv_qualType_1_0= ruleQualifiedTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructMemberAccess().getQualTypeQualifiedTypeSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1459);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:724:2: ( (lv_dec_2_0= ruleDeclarators ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:725:1: (lv_dec_2_0= ruleDeclarators )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:725:1: (lv_dec_2_0= ruleDeclarators )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:726:3: lv_dec_2_0= ruleDeclarators
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getStructMemberAccess().getDecDeclaratorsParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_ruleStructMember1480);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:742:2: (otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:742:4: otherlv_3= ':' ( (lv_constExpr_4_0= ruleConstantExpression ) )
                    {
                    otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleStructMember1493); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getStructMemberAccess().getColonKeyword_3_0());
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:746:1: ( (lv_constExpr_4_0= ruleConstantExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:747:1: (lv_constExpr_4_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:747:1: (lv_constExpr_4_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:748:3: lv_constExpr_4_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStructMemberAccess().getConstExprConstantExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleStructMember1514);
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

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleStructMember1528); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:776:1: entryRuleEnumSpecification returns [EObject current=null] : iv_ruleEnumSpecification= ruleEnumSpecification EOF ;
    public final EObject entryRuleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumSpecification = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:777:2: (iv_ruleEnumSpecification= ruleEnumSpecification EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:778:2: iv_ruleEnumSpecification= ruleEnumSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1564);
            iv_ruleEnumSpecification=ruleEnumSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumSpecification1574); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:785:1: ruleEnumSpecification returns [EObject current=null] : (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) ;
    public final EObject ruleEnumSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_EnumDefinition_0 = null;

        EObject this_EnumReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:788:28: ( (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:789:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:789:1: (this_EnumDefinition_0= ruleEnumDefinition | this_EnumReference_1= ruleEnumReference )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_ID) ) {
                    int LA14_2 = input.LA(3);

                    if ( (LA14_2==20) ) {
                        alt14=1;
                    }
                    else if ( (LA14_2==EOF||LA14_2==RULE_ID||LA14_2==18||LA14_2==28||LA14_2==37) ) {
                        alt14=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA14_1==20) ) {
                    alt14=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:790:2: this_EnumDefinition_0= ruleEnumDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1624);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:803:2: this_EnumReference_1= ruleEnumReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEnumSpecificationAccess().getEnumReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumReference_in_ruleEnumSpecification1654);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:822:1: entryRuleEnumDefinition returns [EObject current=null] : iv_ruleEnumDefinition= ruleEnumDefinition EOF ;
    public final EObject entryRuleEnumDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumDefinition = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:823:2: (iv_ruleEnumDefinition= ruleEnumDefinition EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:824:2: iv_ruleEnumDefinition= ruleEnumDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1689);
            iv_ruleEnumDefinition=ruleEnumDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumDefinition1699); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:831:1: ruleEnumDefinition returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}' ) ;
    public final EObject ruleEnumDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_enumMemberList_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:834:28: ( (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:835:1: (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:835:1: (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:835:3: otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_enumMemberList_3_0= ruleEnumMemberList ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEnumDefinition1736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumDefinitionAccess().getEnumKeyword_0());
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:839:1: ( (lv_id_1_0= RULE_ID ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:840:1: (lv_id_1_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:840:1: (lv_id_1_0= RULE_ID )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:841:3: lv_id_1_0= RULE_ID
                    {
                    lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumDefinition1753); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleEnumDefinition1771); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumDefinitionAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:861:1: ( (lv_enumMemberList_3_0= ruleEnumMemberList ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:862:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:862:1: (lv_enumMemberList_3_0= ruleEnumMemberList )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:863:3: lv_enumMemberList_3_0= ruleEnumMemberList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumDefinitionAccess().getEnumMemberListEnumMemberListParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition1792);
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

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEnumDefinition1804); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:891:1: entryRuleEnumReference returns [EObject current=null] : iv_ruleEnumReference= ruleEnumReference EOF ;
    public final EObject entryRuleEnumReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumReference = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:892:2: (iv_ruleEnumReference= ruleEnumReference EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:893:2: iv_ruleEnumReference= ruleEnumReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumReference_in_entryRuleEnumReference1840);
            iv_ruleEnumReference=ruleEnumReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumReference1850); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:900:1: ruleEnumReference returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_id_1_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:903:28: ( (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:904:1: (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:904:1: (otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:904:3: otherlv_0= 'enum' ( (lv_id_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEnumReference1887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumReferenceAccess().getEnumKeyword_0());
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:908:1: ( (lv_id_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:909:1: (lv_id_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:909:1: (lv_id_1_0= RULE_ID )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:910:3: lv_id_1_0= RULE_ID
            {
            lv_id_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumReference1904); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:934:1: entryRuleEnumMemberList returns [EObject current=null] : iv_ruleEnumMemberList= ruleEnumMemberList EOF ;
    public final EObject entryRuleEnumMemberList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMemberList = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:935:2: (iv_ruleEnumMemberList= ruleEnumMemberList EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:936:2: iv_ruleEnumMemberList= ruleEnumMemberList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumMemberListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList1945);
            iv_ruleEnumMemberList=ruleEnumMemberList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumMemberList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumMemberList1955); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:943:1: ruleEnumMemberList returns [EObject current=null] : ( ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) ;
    public final EObject ruleEnumMemberList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_enumMember_0_0 = null;

        EObject lv_enumMember_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:946:28: ( ( ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:947:1: ( ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:947:1: ( ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )* )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:947:2: ( (lv_enumMember_0_0= ruleEnumMember ) ) (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:947:2: ( (lv_enumMember_0_0= ruleEnumMember ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:948:1: (lv_enumMember_0_0= ruleEnumMember )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:948:1: (lv_enumMember_0_0= ruleEnumMember )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:949:3: lv_enumMember_0_0= ruleEnumMember
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_ruleEnumMemberList2001);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:965:2: (otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==26) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:965:4: otherlv_1= ',' ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleEnumMemberList2014); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getEnumMemberListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:969:1: ( (lv_enumMember_2_0= ruleEnumMember ) )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:970:1: (lv_enumMember_2_0= ruleEnumMember )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:970:1: (lv_enumMember_2_0= ruleEnumMember )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:971:3: lv_enumMember_2_0= ruleEnumMember
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumMemberListAccess().getEnumMemberEnumMemberParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_ruleEnumMemberList2035);
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
            	    break loop16;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:995:1: entryRuleEnumMember returns [EObject current=null] : iv_ruleEnumMember= ruleEnumMember EOF ;
    public final EObject entryRuleEnumMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumMember = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:996:2: (iv_ruleEnumMember= ruleEnumMember EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:997:2: iv_ruleEnumMember= ruleEnumMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumMemberRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumMember_in_entryRuleEnumMember2073);
            iv_ruleEnumMember=ruleEnumMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumMember; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumMember2083); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1004:1: ruleEnumMember returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )? ) ;
    public final EObject ruleEnumMember() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_constExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1007:28: ( ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1008:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1008:1: ( ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1008:2: ( (lv_name_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1008:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1009:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1009:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1010:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumMember2125); if (state.failed) return current;
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1026:2: (otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1026:4: otherlv_1= '=' ( (lv_constExpr_2_0= ruleConstantExpression ) )
                    {
                    otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEnumMember2143); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getEnumMemberAccess().getEqualsSignKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1030:1: ( (lv_constExpr_2_0= ruleConstantExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1031:1: (lv_constExpr_2_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1031:1: (lv_constExpr_2_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1032:3: lv_constExpr_2_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEnumMemberAccess().getConstExprConstantExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleEnumMember2164);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1056:1: entryRuleDeclarators returns [EObject current=null] : iv_ruleDeclarators= ruleDeclarators EOF ;
    public final EObject entryRuleDeclarators() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarators = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1057:2: (iv_ruleDeclarators= ruleDeclarators EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1058:2: iv_ruleDeclarators= ruleDeclarators EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaratorsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarators_in_entryRuleDeclarators2202);
            iv_ruleDeclarators=ruleDeclarators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarators; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclarators2212); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1065:1: ruleDeclarators returns [EObject current=null] : ( ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) ;
    public final EObject ruleDeclarators() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_dec_0_0 = null;

        EObject lv_declaratorList_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1068:28: ( ( ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1069:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1069:1: ( ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )* )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1069:2: ( (lv_dec_0_0= ruleDeclarator ) ) (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1069:2: ( (lv_dec_0_0= ruleDeclarator ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1070:1: (lv_dec_0_0= ruleDeclarator )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1070:1: (lv_dec_0_0= ruleDeclarator )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1071:3: lv_dec_0_0= ruleDeclarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclaratorsAccess().getDecDeclaratorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleDeclarators2258);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1087:2: (otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1087:4: otherlv_1= ',' ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDeclarators2271); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDeclaratorsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1091:1: ( (lv_declaratorList_2_0= ruleDeclarator ) )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1092:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1092:1: (lv_declaratorList_2_0= ruleDeclarator )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1093:3: lv_declaratorList_2_0= ruleDeclarator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclaratorsAccess().getDeclaratorListDeclaratorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleDeclarators2292);
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
    // $ANTLR end "ruleDeclarators"


    // $ANTLR start "entryRuleDeclarator"
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1117:1: entryRuleDeclarator returns [EObject current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final EObject entryRuleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarator = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1118:2: (iv_ruleDeclarator= ruleDeclarator EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1119:2: iv_ruleDeclarator= ruleDeclarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaratorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_entryRuleDeclarator2330);
            iv_ruleDeclarator=ruleDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDeclarator2340); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1126:1: ruleDeclarator returns [EObject current=null] : ( ( (lv_pointer_0_0= rulePointerSpecification ) )* ( (lv_dc_1_0= ruleDirectDeclarator ) ) ) ;
    public final EObject ruleDeclarator() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_pointer_0_0 = null;

        EObject lv_dc_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1129:28: ( ( ( (lv_pointer_0_0= rulePointerSpecification ) )* ( (lv_dc_1_0= ruleDirectDeclarator ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1130:1: ( ( (lv_pointer_0_0= rulePointerSpecification ) )* ( (lv_dc_1_0= ruleDirectDeclarator ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1130:1: ( ( (lv_pointer_0_0= rulePointerSpecification ) )* ( (lv_dc_1_0= ruleDirectDeclarator ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1130:2: ( (lv_pointer_0_0= rulePointerSpecification ) )* ( (lv_dc_1_0= ruleDirectDeclarator ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1130:2: ( (lv_pointer_0_0= rulePointerSpecification ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1131:1: (lv_pointer_0_0= rulePointerSpecification )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1131:1: (lv_pointer_0_0= rulePointerSpecification )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1132:3: lv_pointer_0_0= rulePointerSpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclaratorAccess().getPointerPointerSpecificationParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePointerSpecification_in_ruleDeclarator2386);
            	    lv_pointer_0_0=rulePointerSpecification();

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
            	              		"PointerSpecification");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1148:3: ( (lv_dc_1_0= ruleDirectDeclarator ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1149:1: (lv_dc_1_0= ruleDirectDeclarator )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1149:1: (lv_dc_1_0= ruleDirectDeclarator )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1150:3: lv_dc_1_0= ruleDirectDeclarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclaratorAccess().getDcDirectDeclaratorParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2408);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1174:1: entryRulePointerSpecification returns [String current=null] : iv_rulePointerSpecification= rulePointerSpecification EOF ;
    public final String entryRulePointerSpecification() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePointerSpecification = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1175:2: (iv_rulePointerSpecification= rulePointerSpecification EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1176:2: iv_rulePointerSpecification= rulePointerSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPointerSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePointerSpecification_in_entryRulePointerSpecification2445);
            iv_rulePointerSpecification=rulePointerSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePointerSpecification.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePointerSpecification2456); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1183:1: rulePointerSpecification returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '*' ;
    public final AntlrDatatypeRuleToken rulePointerSpecification() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1186:28: (kw= '*' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1188:2: kw= '*'
            {
            kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_rulePointerSpecification2493); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1201:1: entryRuleDirectDeclarator returns [EObject current=null] : iv_ruleDirectDeclarator= ruleDirectDeclarator EOF ;
    public final EObject entryRuleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectDeclarator = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1202:2: (iv_ruleDirectDeclarator= ruleDirectDeclarator EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1203:2: iv_ruleDirectDeclarator= ruleDirectDeclarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDirectDeclaratorRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2532);
            iv_ruleDirectDeclarator=ruleDirectDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDirectDeclarator; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDirectDeclarator2542); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1210:1: ruleDirectDeclarator returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArraySpecification ) )* ) ;
    public final EObject ruleDirectDeclarator() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_array_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1213:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArraySpecification ) )* ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1214:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArraySpecification ) )* )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1214:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArraySpecification ) )* )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1214:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_array_1_0= ruleArraySpecification ) )*
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1214:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1215:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1215:1: (lv_name_0_0= RULE_ID )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1216:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDirectDeclarator2584); if (state.failed) return current;
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1232:2: ( (lv_array_1_0= ruleArraySpecification ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1233:1: (lv_array_1_0= ruleArraySpecification )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1233:1: (lv_array_1_0= ruleArraySpecification )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1234:3: lv_array_1_0= ruleArraySpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDirectDeclaratorAccess().getArrayArraySpecificationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator2610);
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
    // $ANTLR end "ruleDirectDeclarator"


    // $ANTLR start "entryRuleArraySpecification"
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1258:1: entryRuleArraySpecification returns [EObject current=null] : iv_ruleArraySpecification= ruleArraySpecification EOF ;
    public final EObject entryRuleArraySpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecification = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1259:2: (iv_ruleArraySpecification= ruleArraySpecification EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1260:2: iv_ruleArraySpecification= ruleArraySpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification2647);
            iv_ruleArraySpecification=ruleArraySpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArraySpecification2657); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1267:1: ruleArraySpecification returns [EObject current=null] : ( ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' ) | (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' ) ) ;
    public final EObject ruleArraySpecification() throws RecognitionException {
        EObject current = null;

        Token lv_unspecifiedSize_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fixedSize_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1270:28: ( ( ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' ) | (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1271:1: ( ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' ) | (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1271:1: ( ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' ) | (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                int LA21_1 = input.LA(2);

                if ( ((LA21_1>=RULE_ID && LA21_1<=RULE_STRING)||(LA21_1>=RULE_ADDITIVE_OPERATION && LA21_1<=RULE_INT)||LA21_1==RULE_UNARY_OPERATION||LA21_1==31||LA21_1==35) ) {
                    alt21=2;
                }
                else if ( (LA21_1==30) ) {
                    alt21=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1271:2: ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1271:2: ( ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1271:3: ( (lv_unspecifiedSize_0_0= '[' ) ) otherlv_1= ']'
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1271:3: ( (lv_unspecifiedSize_0_0= '[' ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1272:1: (lv_unspecifiedSize_0_0= '[' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1272:1: (lv_unspecifiedSize_0_0= '[' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1273:3: lv_unspecifiedSize_0_0= '['
                    {
                    lv_unspecifiedSize_0_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleArraySpecification2701); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleArraySpecification2726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArraySpecificationAccess().getRightSquareBracketKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1291:6: (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1291:6: (otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1291:8: otherlv_2= '[' ( (lv_fixedSize_3_0= ruleConstantExpression ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleArraySpecification2746); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getArraySpecificationAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1295:1: ( (lv_fixedSize_3_0= ruleConstantExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1296:1: (lv_fixedSize_3_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1296:1: (lv_fixedSize_3_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1297:3: lv_fixedSize_3_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArraySpecificationAccess().getFixedSizeConstantExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleArraySpecification2767);
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

                    otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleArraySpecification2779); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1325:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1326:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1327:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2817);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName2828); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1334:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1337:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1338:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1338:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1338:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName2868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1345:1: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1346:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleQualifiedName2887); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName2902); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1366:1: entryRuleConstantDefinition returns [EObject current=null] : iv_ruleConstantDefinition= ruleConstantDefinition EOF ;
    public final EObject entryRuleConstantDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDefinition = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1367:2: (iv_ruleConstantDefinition= ruleConstantDefinition EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1368:2: iv_ruleConstantDefinition= ruleConstantDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition2949);
            iv_ruleConstantDefinition=ruleConstantDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantDefinition2959); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1375:1: ruleConstantDefinition returns [EObject current=null] : (otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? ) ;
    public final EObject ruleConstantDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_expr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1378:28: ( (otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1379:1: (otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1379:1: (otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1379:3: otherlv_0= '#define' ( (lv_name_1_0= RULE_ID ) ) ( (lv_expr_2_0= ruleConstantExpression ) )?
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleConstantDefinition2996); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDefinitionAccess().getDefineKeyword_0());
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1383:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1384:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1384:1: (lv_name_1_0= RULE_ID )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1385:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstantDefinition3013); if (state.failed) return current;
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1401:2: ( (lv_expr_2_0= ruleConstantExpression ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)||(LA23_0>=RULE_ADDITIVE_OPERATION && LA23_0<=RULE_INT)||LA23_0==RULE_UNARY_OPERATION||LA23_0==31||LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1402:1: (lv_expr_2_0= ruleConstantExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1402:1: (lv_expr_2_0= ruleConstantExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1403:3: lv_expr_2_0= ruleConstantExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantDefinitionAccess().getExprConstantExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_ruleConstantDefinition3039);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1427:1: entryRuleInterfaceDefinition returns [EObject current=null] : iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF ;
    public final EObject entryRuleInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceDefinition = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1428:2: (iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1429:2: iv_ruleInterfaceDefinition= ruleInterfaceDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition3076);
            iv_ruleInterfaceDefinition=ruleInterfaceDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInterfaceDefinition3086); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1436:1: ruleInterfaceDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}' ) ;
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
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1439:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1440:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1440:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1440:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? otherlv_1= 'interface' (otherlv_2= 'unmanaged' )? ( (lv_name_3_0= ruleQualifiedName ) ) (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )? otherlv_6= '{' ( (lv_methodDef_7_0= ruleMethodDefinition ) )* otherlv_8= '}'
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1440:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1441:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1441:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1442:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleInterfaceDefinition3132);
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

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInterfaceDefinition3145); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInterfaceDefinitionAccess().getInterfaceKeyword_1());
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1462:1: (otherlv_2= 'unmanaged' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1462:3: otherlv_2= 'unmanaged'
                    {
                    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleInterfaceDefinition3158); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInterfaceDefinitionAccess().getUnmanagedKeyword_2());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1466:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1467:1: (lv_name_3_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1467:1: (lv_name_3_0= ruleQualifiedName )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1468:3: lv_name_3_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getNameQualifiedNameParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition3181);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1484:2: (otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1484:4: otherlv_4= ':' ( (lv_fqn2_5_0= ruleQualifiedName ) )
                    {
                    otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInterfaceDefinition3194); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getInterfaceDefinitionAccess().getColonKeyword_4_0());
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1488:1: ( (lv_fqn2_5_0= ruleQualifiedName ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1489:1: (lv_fqn2_5_0= ruleQualifiedName )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1489:1: (lv_fqn2_5_0= ruleQualifiedName )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1490:3: lv_fqn2_5_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getFqn2QualifiedNameParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition3215);
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

            otherlv_6=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleInterfaceDefinition3229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getInterfaceDefinitionAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1510:1: ( (lv_methodDef_7_0= ruleMethodDefinition ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID||(LA27_0>=22 && LA27_0<=23)||LA27_0==25||LA27_0==36||LA27_0==40||(LA27_0>=49 && LA27_0<=69)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1511:1: (lv_methodDef_7_0= ruleMethodDefinition )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1511:1: (lv_methodDef_7_0= ruleMethodDefinition )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1512:3: lv_methodDef_7_0= ruleMethodDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInterfaceDefinitionAccess().getMethodDefMethodDefinitionParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3250);
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
            	    break loop27;
                }
            } while (true);

            otherlv_8=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleInterfaceDefinition3263); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1540:1: entryRuleMethodDefinition returns [EObject current=null] : iv_ruleMethodDefinition= ruleMethodDefinition EOF ;
    public final EObject entryRuleMethodDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethodDefinition = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1541:2: (iv_ruleMethodDefinition= ruleMethodDefinition EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1542:2: iv_ruleMethodDefinition= ruleMethodDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMethodDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3299);
            iv_ruleMethodDefinition=ruleMethodDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMethodDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMethodDefinition3309); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1549:1: ruleMethodDefinition returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) )* ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';' ) ;
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
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1552:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) )* ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';' ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1553:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) )* ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';' )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1553:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) )* ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';' )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1553:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) ) ( (lv_pointerSpecification_2_0= rulePointerSpecification ) )* ( (lv_name_3_0= RULE_ID ) ) ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) ) otherlv_10= ';'
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1553:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1554:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1554:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1555:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodDefinitionAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleMethodDefinition3355);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1571:3: ( (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1572:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1572:1: (lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1573:3: lv_qualifiedTypeSpec_1_0= ruleQualifiedTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMethodDefinitionAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3377);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1589:2: ( (lv_pointerSpecification_2_0= rulePointerSpecification ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==28) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1590:1: (lv_pointerSpecification_2_0= rulePointerSpecification )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1590:1: (lv_pointerSpecification_2_0= rulePointerSpecification )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1591:3: lv_pointerSpecification_2_0= rulePointerSpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMethodDefinitionAccess().getPointerSpecificationPointerSpecificationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePointerSpecification_in_ruleMethodDefinition3398);
            	    lv_pointerSpecification_2_0=rulePointerSpecification();

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
            	              		"PointerSpecification");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1607:3: ( (lv_name_3_0= RULE_ID ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1608:1: (lv_name_3_0= RULE_ID )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1608:1: (lv_name_3_0= RULE_ID )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1609:3: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleMethodDefinition3416); if (state.failed) return current;
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1625:2: ( (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' ) | (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                switch ( input.LA(2) ) {
                case 36:
                    {
                    int LA31_2 = input.LA(3);

                    if ( (LA31_2==37) ) {
                        alt31=1;
                    }
                    else if ( (LA31_2==RULE_ID||LA31_2==28||LA31_2==36||(LA31_2>=51 && LA31_2<=69)) ) {
                        alt31=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case 37:
                    {
                    alt31=1;
                    }
                    break;
                case RULE_ID:
                case 22:
                case 23:
                case 25:
                case 40:
                case 49:
                case 50:
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
                    alt31=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1625:3: (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1625:3: (otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1625:5: otherlv_4= '(' (otherlv_5= 'void' )? otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMethodDefinition3435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_4_0_0());
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1629:1: (otherlv_5= 'void' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==36) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1629:3: otherlv_5= 'void'
                            {
                            otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMethodDefinition3448); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getMethodDefinitionAccess().getVoidKeyword_4_0_1());
                                  
                            }

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMethodDefinition3462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_4_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1638:6: (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1638:6: (otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1638:8: otherlv_7= '(' ( (lv_ParameterList_8_0= ruleParameterList ) ) otherlv_9= ')'
                    {
                    otherlv_7=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMethodDefinition3482); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getMethodDefinitionAccess().getLeftParenthesisKeyword_4_1_0());
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1642:1: ( (lv_ParameterList_8_0= ruleParameterList ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1643:1: (lv_ParameterList_8_0= ruleParameterList )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1643:1: (lv_ParameterList_8_0= ruleParameterList )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1644:3: lv_ParameterList_8_0= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMethodDefinitionAccess().getParameterListParameterListParserRuleCall_4_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterList_in_ruleMethodDefinition3503);
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

                    otherlv_9=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleMethodDefinition3515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getMethodDefinitionAccess().getRightParenthesisKeyword_4_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleMethodDefinition3529); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1676:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1677:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1678:2: iv_ruleParameterList= ruleParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameterList_in_entryRuleParameterList3565);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterList3575); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1685:1: ruleParameterList returns [EObject current=null] : ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )? ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_param_0_0 = null;

        EObject lv_params_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1688:28: ( ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1689:1: ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1689:1: ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1689:2: ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )* (otherlv_3= ',' otherlv_4= '...' )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1689:2: ( (lv_param_0_0= ruleParameter ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1690:1: (lv_param_0_0= ruleParameter )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1690:1: (lv_param_0_0= ruleParameter )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1691:3: lv_param_0_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleParameterList3621);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1707:2: (otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==RULE_ID||(LA32_1>=22 && LA32_1<=23)||LA32_1==25||LA32_1==36||LA32_1==40||(LA32_1>=49 && LA32_1<=71)) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1707:4: otherlv_1= ',' ( (lv_params_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleParameterList3634); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1711:1: ( (lv_params_2_0= ruleParameter ) )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1712:1: (lv_params_2_0= ruleParameter )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1712:1: (lv_params_2_0= ruleParameter )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1713:3: lv_params_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleParameterList3655);
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
            	    break loop32;
                }
            } while (true);

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1729:4: (otherlv_3= ',' otherlv_4= '...' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==26) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1729:6: otherlv_3= ',' otherlv_4= '...'
                    {
                    otherlv_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleParameterList3670); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_2_0());
                          
                    }
                    otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleParameterList3682); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1745:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1746:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1747:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter3720);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter3730); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1754:1: ruleParameter returns [EObject current=null] : ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_annotationsList_0_0 = null;

        Enumerator lv_ParameterQualifier_1_0 = null;

        EObject lv_qualifiedTypeSpec_2_0 = null;

        EObject lv_dec_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1757:28: ( ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1758:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1758:1: ( ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1758:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )? ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )* ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) ) ( (lv_dec_3_0= ruleDeclarator ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1758:2: ( (lv_annotationsList_0_0= ruleAnnotationsList ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1759:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1759:1: (lv_annotationsList_0_0= ruleAnnotationsList )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1760:3: lv_annotationsList_0_0= ruleAnnotationsList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParameterAccess().getAnnotationsListAnnotationsListParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_ruleParameter3776);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1776:3: ( (lv_ParameterQualifier_1_0= ruleParameterQualifier ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=70 && LA35_0<=71)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1777:1: (lv_ParameterQualifier_1_0= ruleParameterQualifier )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1777:1: (lv_ParameterQualifier_1_0= ruleParameterQualifier )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1778:3: lv_ParameterQualifier_1_0= ruleParameterQualifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameterAccess().getParameterQualifierParameterQualifierEnumRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleParameterQualifier_in_ruleParameter3798);
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
            	    break loop35;
                }
            } while (true);

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1794:3: ( (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1795:1: (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1795:1: (lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1796:3: lv_qualifiedTypeSpec_2_0= ruleQualifiedTypeSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getQualifiedTypeSpecQualifiedTypeSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter3820);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1812:2: ( (lv_dec_3_0= ruleDeclarator ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1813:1: (lv_dec_3_0= ruleDeclarator )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1813:1: (lv_dec_3_0= ruleDeclarator )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1814:3: lv_dec_3_0= ruleDeclarator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getDecDeclaratorParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleDeclarator_in_ruleParameter3841);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1838:1: entryRuleIncludeDirective returns [EObject current=null] : iv_ruleIncludeDirective= ruleIncludeDirective EOF ;
    public final EObject entryRuleIncludeDirective() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIncludeDirective = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1839:2: (iv_ruleIncludeDirective= ruleIncludeDirective EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1840:2: iv_ruleIncludeDirective= ruleIncludeDirective EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIncludeDirectiveRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective3877);
            iv_ruleIncludeDirective=ruleIncludeDirective();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIncludeDirective; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIncludeDirective3887); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1847:1: ruleIncludeDirective returns [EObject current=null] : (otherlv_0= '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) ) ) ;
    public final EObject ruleIncludeDirective() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importedURI_1_0=null;
        Token lv_includeID_2_0=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1850:28: ( (otherlv_0= '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1851:1: (otherlv_0= '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1851:1: (otherlv_0= '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1851:3: otherlv_0= '#include' ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) )
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleIncludeDirective3924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIncludeDirectiveAccess().getIncludeKeyword_0());
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1855:1: ( ( (lv_importedURI_1_0= RULE_STRING ) ) | ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_INCLUDE_LIB) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1855:2: ( (lv_importedURI_1_0= RULE_STRING ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1855:2: ( (lv_importedURI_1_0= RULE_STRING ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1856:1: (lv_importedURI_1_0= RULE_STRING )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1856:1: (lv_importedURI_1_0= RULE_STRING )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1857:3: lv_importedURI_1_0= RULE_STRING
                    {
                    lv_importedURI_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleIncludeDirective3942); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1874:6: ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1874:6: ( (lv_includeID_2_0= RULE_INCLUDE_LIB ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1875:1: (lv_includeID_2_0= RULE_INCLUDE_LIB )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1875:1: (lv_includeID_2_0= RULE_INCLUDE_LIB )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1876:3: lv_includeID_2_0= RULE_INCLUDE_LIB
                    {
                    lv_includeID_2_0=(Token)match(input,RULE_INCLUDE_LIB,FollowSets000.FOLLOW_RULE_INCLUDE_LIB_in_ruleIncludeDirective3970); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1900:1: entryRuleAnnotationsList returns [EObject current=null] : iv_ruleAnnotationsList= ruleAnnotationsList EOF ;
    public final EObject entryRuleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationsList = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1901:2: (iv_ruleAnnotationsList= ruleAnnotationsList EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1902:2: iv_ruleAnnotationsList= ruleAnnotationsList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationsListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList4012);
            iv_ruleAnnotationsList=ruleAnnotationsList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationsList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationsList4022); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1909:1: ruleAnnotationsList returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) ;
    public final EObject ruleAnnotationsList() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_0_0 = null;

        EObject lv_annotations_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1912:28: ( ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1913:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1913:1: ( ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )* )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1913:2: ( (lv_annotations_0_0= ruleAnnotation ) ) ( (lv_annotations_1_0= ruleAnnotation ) )*
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1913:2: ( (lv_annotations_0_0= ruleAnnotation ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1914:1: (lv_annotations_0_0= ruleAnnotation )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1914:1: (lv_annotations_0_0= ruleAnnotation )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1915:3: lv_annotations_0_0= ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotationsList4068);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1931:2: ( (lv_annotations_1_0= ruleAnnotation ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==40) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1932:1: (lv_annotations_1_0= ruleAnnotation )
            	    {
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1932:1: (lv_annotations_1_0= ruleAnnotation )
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1933:3: lv_annotations_1_0= ruleAnnotation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAnnotationsListAccess().getAnnotationsAnnotationParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_ruleAnnotationsList4089);
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
            	    break loop37;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1957:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1958:2: (iv_ruleAnnotation= ruleAnnotation EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1959:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotation_in_entryRuleAnnotation4126);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotation; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotation4136); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1966:1: ruleAnnotation returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )? ) ;
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
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1969:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1970:1: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1970:1: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1970:3: otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleAnnotation4173); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0());
                  
            }
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1974:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1975:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1975:1: (lv_name_1_0= ruleQualifiedName )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1976:3: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleAnnotation4194);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1992:2: (otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1992:4: otherlv_2= '(' ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) ) (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAnnotation4207); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAnnotationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1996:1: ( (lv_annotationParametersList_3_0= ruleAnnotationValuePair ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1997:1: (lv_annotationParametersList_3_0= ruleAnnotationValuePair )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1997:1: (lv_annotationParametersList_3_0= ruleAnnotationValuePair )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:1998:3: lv_annotationParametersList_3_0= ruleAnnotationValuePair
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationParametersListAnnotationValuePairParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_ruleAnnotation4228);
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

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2014:2: (otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==26) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2014:4: otherlv_4= ',' ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAnnotation4241); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getAnnotationAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2018:1: ( (lv_annotationParametersList_5_0= ruleAnnotationValuePair ) )
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2019:1: (lv_annotationParametersList_5_0= ruleAnnotationValuePair )
                    	    {
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2019:1: (lv_annotationParametersList_5_0= ruleAnnotationValuePair )
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2020:3: lv_annotationParametersList_5_0= ruleAnnotationValuePair
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationParametersListAnnotationValuePairParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_ruleAnnotation4262);
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
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAnnotation4276); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2048:1: entryRuleAnnotationValuePair returns [EObject current=null] : iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF ;
    public final EObject entryRuleAnnotationValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationValuePair = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2049:2: (iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2050:2: iv_ruleAnnotationValuePair= ruleAnnotationValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationValuePairRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValuePair_in_entryRuleAnnotationValuePair4314);
            iv_ruleAnnotationValuePair=ruleAnnotationValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationValuePair; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationValuePair4324); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2057:1: ruleAnnotationValuePair returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) ) ) ;
    public final EObject ruleAnnotationValuePair() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2060:28: ( ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2061:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2061:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2061:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_value_2_0= ruleAnnotationValue ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2061:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==27) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2061:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '='
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2061:3: ( (lv_name_0_0= RULE_ID ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2062:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2062:1: (lv_name_0_0= RULE_ID )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2063:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAnnotationValuePair4367); if (state.failed) return current;
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

                    otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAnnotationValuePair4384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAnnotationValuePairAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2083:3: ( (lv_value_2_0= ruleAnnotationValue ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2084:1: (lv_value_2_0= ruleAnnotationValue )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2084:1: (lv_value_2_0= ruleAnnotationValue )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2085:3: lv_value_2_0= ruleAnnotationValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAnnotationValuePairAccess().getValueAnnotationValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_ruleAnnotationValuePair4407);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2109:1: entryRuleAnnotationValue returns [String current=null] : iv_ruleAnnotationValue= ruleAnnotationValue EOF ;
    public final String entryRuleAnnotationValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnnotationValue = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2110:2: (iv_ruleAnnotationValue= ruleAnnotationValue EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2111:2: iv_ruleAnnotationValue= ruleAnnotationValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnnotationValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue4444);
            iv_ruleAnnotationValue=ruleAnnotationValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnnotationValue.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAnnotationValue4455); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2118:1: ruleAnnotationValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_signedINT_0= rulesignedINT | kw= 'null' | this_BOOLEAN_2= RULE_BOOLEAN | this_QualifiedName_3= ruleQualifiedName ) ;
    public final AntlrDatatypeRuleToken ruleAnnotationValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_BOOLEAN_2=null;
        AntlrDatatypeRuleToken this_signedINT_0 = null;

        AntlrDatatypeRuleToken this_QualifiedName_3 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2121:28: ( (this_signedINT_0= rulesignedINT | kw= 'null' | this_BOOLEAN_2= RULE_BOOLEAN | this_QualifiedName_3= ruleQualifiedName ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2122:1: (this_signedINT_0= rulesignedINT | kw= 'null' | this_BOOLEAN_2= RULE_BOOLEAN | this_QualifiedName_3= ruleQualifiedName )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2122:1: (this_signedINT_0= rulesignedINT | kw= 'null' | this_BOOLEAN_2= RULE_BOOLEAN | this_QualifiedName_3= ruleQualifiedName )
            int alt41=4;
            switch ( input.LA(1) ) {
            case RULE_ADDITIVE_OPERATION:
            case RULE_INT:
                {
                alt41=1;
                }
                break;
            case 41:
                {
                alt41=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt41=3;
                }
                break;
            case RULE_ID:
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2123:5: this_signedINT_0= rulesignedINT
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationValueAccess().getSignedINTParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleAnnotationValue4502);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2135:2: kw= 'null'
                    {
                    kw=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleAnnotationValue4526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAnnotationValueAccess().getNullKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2141:10: this_BOOLEAN_2= RULE_BOOLEAN
                    {
                    this_BOOLEAN_2=(Token)match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_RULE_BOOLEAN_in_ruleAnnotationValue4547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BOOLEAN_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOOLEAN_2, grammarAccess.getAnnotationValueAccess().getBOOLEANTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2150:5: this_QualifiedName_3= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAnnotationValueAccess().getQualifiedNameParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleAnnotationValue4580);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2168:1: entryRulesignedINT returns [String current=null] : iv_rulesignedINT= rulesignedINT EOF ;
    public final String entryRulesignedINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulesignedINT = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2169:2: (iv_rulesignedINT= rulesignedINT EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2170:2: iv_rulesignedINT= rulesignedINT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignedINTRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_entryRulesignedINT4626);
            iv_rulesignedINT=rulesignedINT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesignedINT.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulesignedINT4637); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2177:1: rulesignedINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken rulesignedINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ADDITIVE_OPERATION_0=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2180:28: ( ( (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2181:1: ( (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2181:1: ( (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2181:2: (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )? this_INT_1= RULE_INT
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2181:2: (this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ADDITIVE_OPERATION) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2181:7: this_ADDITIVE_OPERATION_0= RULE_ADDITIVE_OPERATION
                    {
                    this_ADDITIVE_OPERATION_0=(Token)match(input,RULE_ADDITIVE_OPERATION,FollowSets000.FOLLOW_RULE_ADDITIVE_OPERATION_in_rulesignedINT4678); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ADDITIVE_OPERATION_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ADDITIVE_OPERATION_0, grammarAccess.getSignedINTAccess().getADDITIVE_OPERATIONTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rulesignedINT4700); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2203:1: entryRuleConstantExpression returns [EObject current=null] : iv_ruleConstantExpression= ruleConstantExpression EOF ;
    public final EObject entryRuleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2204:2: (iv_ruleConstantExpression= ruleConstantExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2205:2: iv_ruleConstantExpression= ruleConstantExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression4745);
            iv_ruleConstantExpression=ruleConstantExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantExpression4755); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2212:1: ruleConstantExpression returns [EObject current=null] : this_LogicalOrExpression_0= ruleLogicalOrExpression ;
    public final EObject ruleConstantExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LogicalOrExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2215:28: (this_LogicalOrExpression_0= ruleLogicalOrExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2217:2: this_LogicalOrExpression_0= ruleLogicalOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConstantExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleConstantExpression4804);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2236:1: entryRuleLogicalOrExpression returns [EObject current=null] : iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF ;
    public final EObject entryRuleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOrExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2237:2: (iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2238:2: iv_ruleLogicalOrExpression= ruleLogicalOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression4838);
            iv_ruleLogicalOrExpression=ruleLogicalOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalOrExpression4848); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2245:1: ruleLogicalOrExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? ) ;
    public final EObject ruleLogicalOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2248:28: ( ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2249:1: ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2249:1: ( ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2249:2: ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) ) (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2249:2: ( (lv_leftExpr_0_0= ruleLogicalAndExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2250:1: (lv_leftExpr_0_0= ruleLogicalAndExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2250:1: (lv_leftExpr_0_0= ruleLogicalAndExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2251:3: lv_leftExpr_0_0= ruleLogicalAndExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getLeftExprLogicalAndExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression4894);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2267:2: (otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2267:4: otherlv_1= '||' ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) )
                    {
                    otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleLogicalOrExpression4907); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLogicalOrExpressionAccess().getVerticalLineVerticalLineKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2271:1: ( (lv_rightExpr_2_0= ruleLogicalOrExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2272:1: (lv_rightExpr_2_0= ruleLogicalOrExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2272:1: (lv_rightExpr_2_0= ruleLogicalOrExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2273:3: lv_rightExpr_2_0= ruleLogicalOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalOrExpressionAccess().getRightExprLogicalOrExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalOrExpression_in_ruleLogicalOrExpression4928);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2297:1: entryRuleLogicalAndExpression returns [EObject current=null] : iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF ;
    public final EObject entryRuleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalAndExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2298:2: (iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2299:2: iv_ruleLogicalAndExpression= ruleLogicalAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression4966);
            iv_ruleLogicalAndExpression=ruleLogicalAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLogicalAndExpression4976); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2306:1: ruleLogicalAndExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? ) ;
    public final EObject ruleLogicalAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2309:28: ( ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2310:1: ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2310:1: ( ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2310:2: ( (lv_leftExpr_0_0= ruleOrExpression ) ) (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2310:2: ( (lv_leftExpr_0_0= ruleOrExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2311:1: (lv_leftExpr_0_0= ruleOrExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2311:1: (lv_leftExpr_0_0= ruleOrExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2312:3: lv_leftExpr_0_0= ruleOrExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getLeftExprOrExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleLogicalAndExpression5022);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2328:2: (otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2328:4: otherlv_1= '&&' ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) )
                    {
                    otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleLogicalAndExpression5035); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getLogicalAndExpressionAccess().getAmpersandAmpersandKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2332:1: ( (lv_rightExpr_2_0= ruleLogicalAndExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2333:1: (lv_rightExpr_2_0= ruleLogicalAndExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2333:1: (lv_rightExpr_2_0= ruleLogicalAndExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2334:3: lv_rightExpr_2_0= ruleLogicalAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLogicalAndExpressionAccess().getRightExprLogicalAndExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLogicalAndExpression_in_ruleLogicalAndExpression5056);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2358:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2359:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2360:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression5094);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression5104); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2367:1: ruleOrExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2370:28: ( ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2371:1: ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2371:1: ( ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2371:2: ( (lv_leftExpr_0_0= ruleXorExpression ) ) (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2371:2: ( (lv_leftExpr_0_0= ruleXorExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2372:1: (lv_leftExpr_0_0= ruleXorExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2372:1: (lv_leftExpr_0_0= ruleXorExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2373:3: lv_leftExpr_0_0= ruleXorExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrExpressionAccess().getLeftExprXorExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_ruleOrExpression5150);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2389:2: (otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2389:4: otherlv_1= '|' ( (lv_rightExpr_2_0= ruleOrExpression ) )
                    {
                    otherlv_1=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleOrExpression5163); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrExpressionAccess().getVerticalLineKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2393:1: ( (lv_rightExpr_2_0= ruleOrExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2394:1: (lv_rightExpr_2_0= ruleOrExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2394:1: (lv_rightExpr_2_0= ruleOrExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2395:3: lv_rightExpr_2_0= ruleOrExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getRightExprOrExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleOrExpression5184);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2419:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2420:2: (iv_ruleXorExpression= ruleXorExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2421:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXorExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_entryRuleXorExpression5222);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXorExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleXorExpression5232); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2428:1: ruleXorExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2431:28: ( ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2432:1: ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2432:1: ( ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2432:2: ( (lv_leftExpr_0_0= ruleAndExpression ) ) (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2432:2: ( (lv_leftExpr_0_0= ruleAndExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2433:1: (lv_leftExpr_0_0= ruleAndExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2433:1: (lv_leftExpr_0_0= ruleAndExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2434:3: lv_leftExpr_0_0= ruleAndExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXorExpressionAccess().getLeftExprAndExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleXorExpression5278);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2450:2: (otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==45) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2450:4: otherlv_1= '^' ( (lv_rightExpr_2_0= ruleXorExpression ) )
                    {
                    otherlv_1=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleXorExpression5291); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXorExpressionAccess().getCircumflexAccentKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2454:1: ( (lv_rightExpr_2_0= ruleXorExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2455:1: (lv_rightExpr_2_0= ruleXorExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2455:1: (lv_rightExpr_2_0= ruleXorExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2456:3: lv_rightExpr_2_0= ruleXorExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXorExpressionAccess().getRightExprXorExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleXorExpression_in_ruleXorExpression5312);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2480:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2481:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2482:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression5350);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression5360); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2489:1: ruleAndExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2492:28: ( ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2493:1: ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2493:1: ( ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2493:2: ( (lv_leftExpr_0_0= ruleShiftExpression ) ) (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2493:2: ( (lv_leftExpr_0_0= ruleShiftExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2494:1: (lv_leftExpr_0_0= ruleShiftExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2494:1: (lv_leftExpr_0_0= ruleShiftExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2495:3: lv_leftExpr_0_0= ruleShiftExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAndExpressionAccess().getLeftExprShiftExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_ruleAndExpression5406);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2511:2: (otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==46) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2511:4: otherlv_1= '&' ( (lv_rightExpr_2_0= ruleAndExpression ) )
                    {
                    otherlv_1=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleAndExpression5419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndExpressionAccess().getAmpersandKeyword_1_0());
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2515:1: ( (lv_rightExpr_2_0= ruleAndExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2516:1: (lv_rightExpr_2_0= ruleAndExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2516:1: (lv_rightExpr_2_0= ruleAndExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2517:3: lv_rightExpr_2_0= ruleAndExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getRightExprAndExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleAndExpression5440);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2541:1: entryRuleShiftExpression returns [EObject current=null] : iv_ruleShiftExpression= ruleShiftExpression EOF ;
    public final EObject entryRuleShiftExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2542:2: (iv_ruleShiftExpression= ruleShiftExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2543:2: iv_ruleShiftExpression= ruleShiftExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression5478);
            iv_ruleShiftExpression=ruleShiftExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleShiftExpression5488); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2550:1: ruleShiftExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? ) ;
    public final EObject ruleShiftExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2553:28: ( ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2554:1: ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2554:1: ( ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2554:2: ( (lv_leftExpr_0_0= ruleAdditiveExpression ) ) ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2554:2: ( (lv_leftExpr_0_0= ruleAdditiveExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2555:1: (lv_leftExpr_0_0= ruleAdditiveExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2555:1: (lv_leftExpr_0_0= ruleAdditiveExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2556:3: lv_leftExpr_0_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getLeftExprAdditiveExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression5534);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2572:2: ( ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_SHIFT_OPERATION) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2572:3: ( (lv_op_1_0= RULE_SHIFT_OPERATION ) ) ( (lv_rightExpr_2_0= ruleShiftExpression ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2572:3: ( (lv_op_1_0= RULE_SHIFT_OPERATION ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2573:1: (lv_op_1_0= RULE_SHIFT_OPERATION )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2573:1: (lv_op_1_0= RULE_SHIFT_OPERATION )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2574:3: lv_op_1_0= RULE_SHIFT_OPERATION
                    {
                    lv_op_1_0=(Token)match(input,RULE_SHIFT_OPERATION,FollowSets000.FOLLOW_RULE_SHIFT_OPERATION_in_ruleShiftExpression5552); if (state.failed) return current;
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

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2590:2: ( (lv_rightExpr_2_0= ruleShiftExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2591:1: (lv_rightExpr_2_0= ruleShiftExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2591:1: (lv_rightExpr_2_0= ruleShiftExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2592:3: lv_rightExpr_2_0= ruleShiftExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getShiftExpressionAccess().getRightExprShiftExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleShiftExpression_in_ruleShiftExpression5578);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2616:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2617:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2618:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression5616);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditiveExpression5626); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2625:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2628:28: ( ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2629:1: ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2629:1: ( ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2629:2: ( (lv_leftExpr_0_0= ruleMulExpression ) ) ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2629:2: ( (lv_leftExpr_0_0= ruleMulExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2630:1: (lv_leftExpr_0_0= ruleMulExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2630:1: (lv_leftExpr_0_0= ruleMulExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2631:3: lv_leftExpr_0_0= ruleMulExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getLeftExprMulExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_ruleAdditiveExpression5672);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2647:2: ( ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ADDITIVE_OPERATION) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2647:3: ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) ) ( (lv_rightExpr_2_0= ruleAdditiveExpression ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2647:3: ( (lv_op_1_0= RULE_ADDITIVE_OPERATION ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2648:1: (lv_op_1_0= RULE_ADDITIVE_OPERATION )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2648:1: (lv_op_1_0= RULE_ADDITIVE_OPERATION )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2649:3: lv_op_1_0= RULE_ADDITIVE_OPERATION
                    {
                    lv_op_1_0=(Token)match(input,RULE_ADDITIVE_OPERATION,FollowSets000.FOLLOW_RULE_ADDITIVE_OPERATION_in_ruleAdditiveExpression5690); if (state.failed) return current;
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

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2665:2: ( (lv_rightExpr_2_0= ruleAdditiveExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2666:1: (lv_rightExpr_2_0= ruleAdditiveExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2666:1: (lv_rightExpr_2_0= ruleAdditiveExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2667:3: lv_rightExpr_2_0= ruleAdditiveExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightExprAdditiveExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_ruleAdditiveExpression5716);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2691:1: entryRuleMulExpression returns [EObject current=null] : iv_ruleMulExpression= ruleMulExpression EOF ;
    public final EObject entryRuleMulExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2692:2: (iv_ruleMulExpression= ruleMulExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2693:2: iv_ruleMulExpression= ruleMulExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_entryRuleMulExpression5754);
            iv_ruleMulExpression=ruleMulExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMulExpression5764); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2700:1: ruleMulExpression returns [EObject current=null] : ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? ) ;
    public final EObject ruleMulExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_leftExpr_0_0 = null;

        EObject lv_rightExpr_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2703:28: ( ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2704:1: ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2704:1: ( ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )? )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2704:2: ( (lv_leftExpr_0_0= ruleCastExpression ) ) ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )?
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2704:2: ( (lv_leftExpr_0_0= ruleCastExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2705:1: (lv_leftExpr_0_0= ruleCastExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2705:1: (lv_leftExpr_0_0= ruleCastExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2706:3: lv_leftExpr_0_0= ruleCastExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMulExpressionAccess().getLeftExprCastExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_ruleMulExpression5810);
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2722:2: ( ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_MUL_OPERATION) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2722:3: ( (lv_op_1_0= RULE_MUL_OPERATION ) ) ( (lv_rightExpr_2_0= ruleMulExpression ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2722:3: ( (lv_op_1_0= RULE_MUL_OPERATION ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2723:1: (lv_op_1_0= RULE_MUL_OPERATION )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2723:1: (lv_op_1_0= RULE_MUL_OPERATION )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2724:3: lv_op_1_0= RULE_MUL_OPERATION
                    {
                    lv_op_1_0=(Token)match(input,RULE_MUL_OPERATION,FollowSets000.FOLLOW_RULE_MUL_OPERATION_in_ruleMulExpression5828); if (state.failed) return current;
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

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2740:2: ( (lv_rightExpr_2_0= ruleMulExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2741:1: (lv_rightExpr_2_0= ruleMulExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2741:1: (lv_rightExpr_2_0= ruleMulExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2742:3: lv_rightExpr_2_0= ruleMulExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMulExpressionAccess().getRightExprMulExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleMulExpression_in_ruleMulExpression5854);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2766:1: entryRuleCastExpression returns [EObject current=null] : iv_ruleCastExpression= ruleCastExpression EOF ;
    public final EObject entryRuleCastExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCastExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2767:2: (iv_ruleCastExpression= ruleCastExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2768:2: iv_ruleCastExpression= ruleCastExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCastExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_entryRuleCastExpression5892);
            iv_ruleCastExpression=ruleCastExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCastExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCastExpression5902); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2775:1: ruleCastExpression returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleCastExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;

        EObject lv_expr_3_0 = null;

        EObject lv_unaryExpr_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2778:28: ( ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2779:1: ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2779:1: ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) | ( (lv_unaryExpr_4_0= ruleUnaryExpression ) ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==35) ) {
                switch ( input.LA(2) ) {
                case 22:
                case 23:
                case 25:
                case 36:
                case 49:
                case 50:
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
                    {
                    alt51=1;
                    }
                    break;
                case RULE_ID:
                    {
                    switch ( input.LA(3) ) {
                    case RULE_ADDITIVE_OPERATION:
                    case RULE_SHIFT_OPERATION:
                    case RULE_MUL_OPERATION:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                        {
                        alt51=2;
                        }
                        break;
                    case 37:
                        {
                        switch ( input.LA(4) ) {
                        case EOF:
                        case RULE_SHIFT_OPERATION:
                        case RULE_MUL_OPERATION:
                        case 18:
                        case 19:
                        case 21:
                        case 22:
                        case 23:
                        case 25:
                        case 26:
                        case 30:
                        case 32:
                        case 33:
                        case 37:
                        case 40:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            {
                            alt51=2;
                            }
                            break;
                        case RULE_ADDITIVE_OPERATION:
                            {
                            int LA51_6 = input.LA(5);

                            if ( ((LA51_6>=RULE_ID && LA51_6<=RULE_STRING)||LA51_6==RULE_ADDITIVE_OPERATION||LA51_6==RULE_UNARY_OPERATION||LA51_6==31||LA51_6==35) ) {
                                alt51=2;
                            }
                            else if ( (LA51_6==RULE_INT) ) {
                                int LA51_7 = input.LA(6);

                                if ( (synpred57_InternalFractalItf()) ) {
                                    alt51=1;
                                }
                                else if ( (true) ) {
                                    alt51=2;
                                }
                                else {
                                    if (state.backtracking>0) {state.failed=true; return current;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 51, 7, input);

                                    throw nvae;
                                }
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 51, 6, input);

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
                            alt51=1;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 51, 5, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 31:
                        {
                        alt51=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 4, input);

                        throw nvae;
                    }

                    }
                    break;
                case RULE_STRING:
                case RULE_ADDITIVE_OPERATION:
                case RULE_INT:
                case RULE_UNARY_OPERATION:
                case 31:
                case 35:
                    {
                    alt51=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }

            }
            else if ( ((LA51_0>=RULE_ID && LA51_0<=RULE_STRING)||(LA51_0>=RULE_ADDITIVE_OPERATION && LA51_0<=RULE_INT)||LA51_0==RULE_UNARY_OPERATION||LA51_0==31) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2779:2: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2779:2: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2779:4: otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) )
                    {
                    otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleCastExpression5940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCastExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2783:1: ( (lv_type_1_0= ruleQualifiedTypeSpecification ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2784:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2784:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2785:3: lv_type_1_0= ruleQualifiedTypeSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCastExpressionAccess().getTypeQualifiedTypeSpecificationParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_ruleCastExpression5961);
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

                    otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleCastExpression5973); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCastExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2805:1: ( (lv_expr_3_0= ruleCastExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2806:1: (lv_expr_3_0= ruleCastExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2806:1: (lv_expr_3_0= ruleCastExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2807:3: lv_expr_3_0= ruleCastExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCastExpressionAccess().getExprCastExpressionParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_ruleCastExpression5994);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2824:6: ( (lv_unaryExpr_4_0= ruleUnaryExpression ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2824:6: ( (lv_unaryExpr_4_0= ruleUnaryExpression ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2825:1: (lv_unaryExpr_4_0= ruleUnaryExpression )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2825:1: (lv_unaryExpr_4_0= ruleUnaryExpression )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2826:3: lv_unaryExpr_4_0= ruleUnaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCastExpressionAccess().getUnaryExprUnaryExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_ruleCastExpression6022);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2850:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2851:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2852:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression6058);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryExpression6068); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2859:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_unaryExpr_0_0=null;
        EObject lv_primaryExpr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2862:28: ( ( ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2863:1: ( ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2863:1: ( ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2863:2: ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )? ( (lv_primaryExpr_1_0= rulePrimaryExpression ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2863:2: ( (lv_unaryExpr_0_0= RULE_UNARY_OPERATION ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_UNARY_OPERATION) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2864:1: (lv_unaryExpr_0_0= RULE_UNARY_OPERATION )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2864:1: (lv_unaryExpr_0_0= RULE_UNARY_OPERATION )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2865:3: lv_unaryExpr_0_0= RULE_UNARY_OPERATION
                    {
                    lv_unaryExpr_0_0=(Token)match(input,RULE_UNARY_OPERATION,FollowSets000.FOLLOW_RULE_UNARY_OPERATION_in_ruleUnaryExpression6110); if (state.failed) return current;
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2881:3: ( (lv_primaryExpr_1_0= rulePrimaryExpression ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2882:1: (lv_primaryExpr_1_0= rulePrimaryExpression )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2882:1: (lv_primaryExpr_1_0= rulePrimaryExpression )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2883:3: lv_primaryExpr_1_0= rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExprPrimaryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression6137);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2907:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2908:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2909:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6173);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression6183); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2916:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_literal_0_0 = null;

        EObject this_ConstantExpression_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2919:28: ( ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2920:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2920:1: ( ( (lv_literal_0_0= ruleLiteral ) ) | (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_ID && LA53_0<=RULE_STRING)||(LA53_0>=RULE_ADDITIVE_OPERATION && LA53_0<=RULE_INT)||LA53_0==31) ) {
                alt53=1;
            }
            else if ( (LA53_0==35) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2920:2: ( (lv_literal_0_0= ruleLiteral ) )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2920:2: ( (lv_literal_0_0= ruleLiteral ) )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2921:1: (lv_literal_0_0= ruleLiteral )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2921:1: (lv_literal_0_0= ruleLiteral )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2922:3: lv_literal_0_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralLiteralParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rulePrimaryExpression6229);
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2939:6: (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2939:6: (otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2939:8: otherlv_1= '(' this_ConstantExpression_2= ruleConstantExpression otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_rulePrimaryExpression6248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstantExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleConstantExpression_in_rulePrimaryExpression6273);
                    this_ConstantExpression_2=ruleConstantExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ConstantExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_3=(Token)match(input,37,FollowSets000.FOLLOW_37_in_rulePrimaryExpression6284); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2967:1: entryRuleLiteral returns [String current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final String entryRuleLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLiteral = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2968:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2969:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral6322);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral6333); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2976:1: ruleLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_FloatingPointLiteral_2= ruleFloatingPointLiteral ) ;
    public final AntlrDatatypeRuleToken ruleLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_FloatingPointLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2979:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_FloatingPointLiteral_2= ruleFloatingPointLiteral ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2980:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_FloatingPointLiteral_2= ruleFloatingPointLiteral )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2980:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_FloatingPointLiteral_2= ruleFloatingPointLiteral )
            int alt54=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt54=1;
                }
                break;
            case RULE_STRING:
                {
                alt54=2;
                }
                break;
            case RULE_ADDITIVE_OPERATION:
            case RULE_INT:
            case 31:
                {
                alt54=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2980:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLiteral6373); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getLiteralAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2988:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLiteral6399); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_1, grammarAccess.getLiteralAccess().getSTRINGTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2997:5: this_FloatingPointLiteral_2= ruleFloatingPointLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getFloatingPointLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFloatingPointLiteral_in_ruleLiteral6432);
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3015:1: entryRuleFloatingPointLiteral returns [String current=null] : iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF ;
    public final String entryRuleFloatingPointLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPointLiteral = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3016:2: (iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3017:2: iv_ruleFloatingPointLiteral= ruleFloatingPointLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloatingPointLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral6478);
            iv_ruleFloatingPointLiteral=ruleFloatingPointLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFloatingPointLiteral.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFloatingPointLiteral6489); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3024:1: ruleFloatingPointLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) ) ;
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
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3027:28: ( ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3028:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3028:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) )
            int alt67=4;
            alt67 = dfa67.predict(input);
            switch (alt67) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3028:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3028:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3028:3: (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3028:3: (this_signedINT_0= rulesignedINT )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( ((LA55_0>=RULE_ADDITIVE_OPERATION && LA55_0<=RULE_INT)) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3029:5: this_signedINT_0= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_0()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6538);
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
                    	    if ( cnt55 >= 1 ) break loop55;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
                    } while (true);

                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFloatingPointLiteral6558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatingPointLiteralAccess().getFullStopKeyword_0_1()); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3045:1: (this_signedINT_2= rulesignedINT )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==RULE_INT) ) {
                            int LA56_2 = input.LA(2);

                            if ( (synpred63_InternalFractalItf()) ) {
                                alt56=1;
                            }


                        }
                        else if ( (LA56_0==RULE_ADDITIVE_OPERATION) ) {
                            int LA56_3 = input.LA(2);

                            if ( (LA56_3==RULE_INT) ) {
                                int LA56_5 = input.LA(3);

                                if ( (synpred63_InternalFractalItf()) ) {
                                    alt56=1;
                                }


                            }


                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3046:5: this_signedINT_2= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_2()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6581);
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
                    	    break loop56;
                        }
                    } while (true);

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3056:3: (this_Exponent_3= ruleExponent )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_INT||(LA57_0>=47 && LA57_0<=48)) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3057:5: this_Exponent_3= ruleExponent
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_0_3()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral6611);
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

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3067:3: (this_FDSYMBOL_4= RULE_FDSYMBOL )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==RULE_FDSYMBOL) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3067:8: this_FDSYMBOL_4= RULE_FDSYMBOL
                            {
                            this_FDSYMBOL_4=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral6634); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3075:6: (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3075:6: (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3076:2: kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )?
                    {
                    kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleFloatingPointLiteral6662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFloatingPointLiteralAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3081:1: (this_signedINT_6= rulesignedINT )+
                    int cnt59=0;
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_INT) ) {
                            int LA59_2 = input.LA(2);

                            if ( (synpred67_InternalFractalItf()) ) {
                                alt59=1;
                            }


                        }
                        else if ( (LA59_0==RULE_ADDITIVE_OPERATION) ) {
                            int LA59_3 = input.LA(2);

                            if ( (LA59_3==RULE_INT) ) {
                                int LA59_5 = input.LA(3);

                                if ( (synpred67_InternalFractalItf()) ) {
                                    alt59=1;
                                }


                            }


                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3082:5: this_signedINT_6= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6685);
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
                    	    if ( cnt59 >= 1 ) break loop59;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(59, input);
                                throw eee;
                        }
                        cnt59++;
                    } while (true);

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3092:3: (this_Exponent_7= ruleExponent )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==RULE_INT||(LA60_0>=47 && LA60_0<=48)) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3093:5: this_Exponent_7= ruleExponent
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_1_2()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral6715);
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

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3103:3: (this_FDSYMBOL_8= RULE_FDSYMBOL )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_FDSYMBOL) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3103:8: this_FDSYMBOL_8= RULE_FDSYMBOL
                            {
                            this_FDSYMBOL_8=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral6738); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3111:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3111:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3111:7: (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3111:7: (this_signedINT_9= rulesignedINT )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==RULE_INT) ) {
                            int LA62_2 = input.LA(2);

                            if ( (synpred71_InternalFractalItf()) ) {
                                alt62=1;
                            }


                        }
                        else if ( (LA62_0==RULE_ADDITIVE_OPERATION) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3112:5: this_signedINT_9= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_2_0()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6776);
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
                    	    if ( cnt62 >= 1 ) break loop62;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
                    } while (true);

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral6805);
                    this_Exponent_10=ruleExponent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Exponent_10);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3133:1: (this_FDSYMBOL_11= RULE_FDSYMBOL )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_FDSYMBOL) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3133:6: this_FDSYMBOL_11= RULE_FDSYMBOL
                            {
                            this_FDSYMBOL_11=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral6826); if (state.failed) return current;
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3141:6: ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3141:6: ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3141:7: (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )?
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3141:7: (this_signedINT_12= rulesignedINT )+
                    int cnt64=0;
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==RULE_INT) ) {
                            int LA64_2 = input.LA(2);

                            if ( (synpred74_InternalFractalItf()) ) {
                                alt64=1;
                            }


                        }
                        else if ( (LA64_0==RULE_ADDITIVE_OPERATION) ) {
                            int LA64_3 = input.LA(2);

                            if ( (synpred74_InternalFractalItf()) ) {
                                alt64=1;
                            }


                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3142:5: this_signedINT_12= rulesignedINT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_3_0()); 
                    	          
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6864);
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
                    	    if ( cnt64 >= 1 ) break loop64;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(64, input);
                                throw eee;
                        }
                        cnt64++;
                    } while (true);

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3152:3: (this_Exponent_13= ruleExponent )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_INT||(LA65_0>=47 && LA65_0<=48)) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3153:5: this_Exponent_13= ruleExponent
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getExponentParserRuleCall_3_1()); 
                                  
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_ruleFloatingPointLiteral6894);
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

                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3163:3: (this_FDSYMBOL_14= RULE_FDSYMBOL )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_FDSYMBOL) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3163:8: this_FDSYMBOL_14= RULE_FDSYMBOL
                            {
                            this_FDSYMBOL_14=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral6917); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3178:1: entryRuleExponent returns [String current=null] : iv_ruleExponent= ruleExponent EOF ;
    public final String entryRuleExponent() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExponent = null;


        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3179:2: (iv_ruleExponent= ruleExponent EOF )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3180:2: iv_ruleExponent= ruleExponent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExponent_in_entryRuleExponent6966);
            iv_ruleExponent=ruleExponent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponent.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExponent6977); if (state.failed) return current;

            }

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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3187:1: ruleExponent returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+ ) ;
    public final AntlrDatatypeRuleToken ruleExponent() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ADDITIVE_OPERATION_2=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3190:28: ( ( (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+ ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3191:1: ( (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+ )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3191:1: ( (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+ )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3191:2: (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )? (this_INT_3= RULE_INT )+
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3191:2: (kw= 'e' | (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION ) )?
            int alt68=3;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==47) ) {
                alt68=1;
            }
            else if ( (LA68_0==48) ) {
                alt68=2;
            }
            switch (alt68) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3192:2: kw= 'e'
                    {
                    kw=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleExponent7016); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExponentAccess().getEKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3198:6: (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3198:6: (kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3199:2: kw= 'E' this_ADDITIVE_OPERATION_2= RULE_ADDITIVE_OPERATION
                    {
                    kw=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleExponent7036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExponentAccess().getEKeyword_0_1_0()); 
                          
                    }
                    this_ADDITIVE_OPERATION_2=(Token)match(input,RULE_ADDITIVE_OPERATION,FollowSets000.FOLLOW_RULE_ADDITIVE_OPERATION_in_ruleExponent7051); if (state.failed) return current;
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

            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3211:4: (this_INT_3= RULE_INT )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_INT) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3211:9: this_INT_3= RULE_INT
            	    {
            	    this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleExponent7075); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_INT_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_INT_3, grammarAccess.getExponentAccess().getINTTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3226:1: ruleTypeQualifier returns [Enumerator current=null] : ( (enumLiteral_0= 'const' ) | (enumLiteral_1= 'volatile' ) ) ;
    public final Enumerator ruleTypeQualifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3228:28: ( ( (enumLiteral_0= 'const' ) | (enumLiteral_1= 'volatile' ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3229:1: ( (enumLiteral_0= 'const' ) | (enumLiteral_1= 'volatile' ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3229:1: ( (enumLiteral_0= 'const' ) | (enumLiteral_1= 'volatile' ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==49) ) {
                alt70=1;
            }
            else if ( (LA70_0==50) ) {
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
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3229:2: (enumLiteral_0= 'const' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3229:2: (enumLiteral_0= 'const' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3229:4: enumLiteral_0= 'const'
                    {
                    enumLiteral_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTypeQualifier7136); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTypeQualifierAccess().getConstEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3235:6: (enumLiteral_1= 'volatile' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3235:6: (enumLiteral_1= 'volatile' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3235:8: enumLiteral_1= 'volatile'
                    {
                    enumLiteral_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTypeQualifier7153); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3245:1: ruleTypeSpecifier returns [Enumerator current=null] : ( (enumLiteral_0= 'void' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'signed' ) | (enumLiteral_8= 'unsigned' ) | (enumLiteral_9= 'string' ) | (enumLiteral_10= 'int8_t' ) | (enumLiteral_11= 'uint8_t' ) | (enumLiteral_12= 'int16_t' ) | (enumLiteral_13= 'uint16_t' ) | (enumLiteral_14= 'int32_t' ) | (enumLiteral_15= 'uint32_t' ) | (enumLiteral_16= 'int64_t' ) | (enumLiteral_17= 'uint64_t' ) | (enumLiteral_18= 'intptr_t' ) | (enumLiteral_19= 'uintptr_t' ) ) ;
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
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3247:28: ( ( (enumLiteral_0= 'void' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'signed' ) | (enumLiteral_8= 'unsigned' ) | (enumLiteral_9= 'string' ) | (enumLiteral_10= 'int8_t' ) | (enumLiteral_11= 'uint8_t' ) | (enumLiteral_12= 'int16_t' ) | (enumLiteral_13= 'uint16_t' ) | (enumLiteral_14= 'int32_t' ) | (enumLiteral_15= 'uint32_t' ) | (enumLiteral_16= 'int64_t' ) | (enumLiteral_17= 'uint64_t' ) | (enumLiteral_18= 'intptr_t' ) | (enumLiteral_19= 'uintptr_t' ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3248:1: ( (enumLiteral_0= 'void' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'signed' ) | (enumLiteral_8= 'unsigned' ) | (enumLiteral_9= 'string' ) | (enumLiteral_10= 'int8_t' ) | (enumLiteral_11= 'uint8_t' ) | (enumLiteral_12= 'int16_t' ) | (enumLiteral_13= 'uint16_t' ) | (enumLiteral_14= 'int32_t' ) | (enumLiteral_15= 'uint32_t' ) | (enumLiteral_16= 'int64_t' ) | (enumLiteral_17= 'uint64_t' ) | (enumLiteral_18= 'intptr_t' ) | (enumLiteral_19= 'uintptr_t' ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3248:1: ( (enumLiteral_0= 'void' ) | (enumLiteral_1= 'char' ) | (enumLiteral_2= 'short' ) | (enumLiteral_3= 'int' ) | (enumLiteral_4= 'long' ) | (enumLiteral_5= 'float' ) | (enumLiteral_6= 'double' ) | (enumLiteral_7= 'signed' ) | (enumLiteral_8= 'unsigned' ) | (enumLiteral_9= 'string' ) | (enumLiteral_10= 'int8_t' ) | (enumLiteral_11= 'uint8_t' ) | (enumLiteral_12= 'int16_t' ) | (enumLiteral_13= 'uint16_t' ) | (enumLiteral_14= 'int32_t' ) | (enumLiteral_15= 'uint32_t' ) | (enumLiteral_16= 'int64_t' ) | (enumLiteral_17= 'uint64_t' ) | (enumLiteral_18= 'intptr_t' ) | (enumLiteral_19= 'uintptr_t' ) )
            int alt71=20;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt71=1;
                }
                break;
            case 51:
                {
                alt71=2;
                }
                break;
            case 52:
                {
                alt71=3;
                }
                break;
            case 53:
                {
                alt71=4;
                }
                break;
            case 54:
                {
                alt71=5;
                }
                break;
            case 55:
                {
                alt71=6;
                }
                break;
            case 56:
                {
                alt71=7;
                }
                break;
            case 57:
                {
                alt71=8;
                }
                break;
            case 58:
                {
                alt71=9;
                }
                break;
            case 59:
                {
                alt71=10;
                }
                break;
            case 60:
                {
                alt71=11;
                }
                break;
            case 61:
                {
                alt71=12;
                }
                break;
            case 62:
                {
                alt71=13;
                }
                break;
            case 63:
                {
                alt71=14;
                }
                break;
            case 64:
                {
                alt71=15;
                }
                break;
            case 65:
                {
                alt71=16;
                }
                break;
            case 66:
                {
                alt71=17;
                }
                break;
            case 67:
                {
                alt71=18;
                }
                break;
            case 68:
                {
                alt71=19;
                }
                break;
            case 69:
                {
                alt71=20;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3248:2: (enumLiteral_0= 'void' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3248:2: (enumLiteral_0= 'void' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3248:4: enumLiteral_0= 'void'
                    {
                    enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleTypeSpecifier7198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTypeSpecifierAccess().getVoidEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3254:6: (enumLiteral_1= 'char' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3254:6: (enumLiteral_1= 'char' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3254:8: enumLiteral_1= 'char'
                    {
                    enumLiteral_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTypeSpecifier7215); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTypeSpecifierAccess().getCharEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3260:6: (enumLiteral_2= 'short' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3260:6: (enumLiteral_2= 'short' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3260:8: enumLiteral_2= 'short'
                    {
                    enumLiteral_2=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleTypeSpecifier7232); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTypeSpecifierAccess().getShortEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3266:6: (enumLiteral_3= 'int' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3266:6: (enumLiteral_3= 'int' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3266:8: enumLiteral_3= 'int'
                    {
                    enumLiteral_3=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleTypeSpecifier7249); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getTypeSpecifierAccess().getIntEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3272:6: (enumLiteral_4= 'long' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3272:6: (enumLiteral_4= 'long' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3272:8: enumLiteral_4= 'long'
                    {
                    enumLiteral_4=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTypeSpecifier7266); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getTypeSpecifierAccess().getLongEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3278:6: (enumLiteral_5= 'float' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3278:6: (enumLiteral_5= 'float' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3278:8: enumLiteral_5= 'float'
                    {
                    enumLiteral_5=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleTypeSpecifier7283); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getTypeSpecifierAccess().getFloatEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3284:6: (enumLiteral_6= 'double' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3284:6: (enumLiteral_6= 'double' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3284:8: enumLiteral_6= 'double'
                    {
                    enumLiteral_6=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleTypeSpecifier7300); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getTypeSpecifierAccess().getDoubleEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3290:6: (enumLiteral_7= 'signed' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3290:6: (enumLiteral_7= 'signed' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3290:8: enumLiteral_7= 'signed'
                    {
                    enumLiteral_7=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleTypeSpecifier7317); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getTypeSpecifierAccess().getSignedEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3296:6: (enumLiteral_8= 'unsigned' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3296:6: (enumLiteral_8= 'unsigned' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3296:8: enumLiteral_8= 'unsigned'
                    {
                    enumLiteral_8=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleTypeSpecifier7334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getTypeSpecifierAccess().getUnsignedEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3302:6: (enumLiteral_9= 'string' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3302:6: (enumLiteral_9= 'string' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3302:8: enumLiteral_9= 'string'
                    {
                    enumLiteral_9=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleTypeSpecifier7351); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_9, grammarAccess.getTypeSpecifierAccess().getStringEnumLiteralDeclaration_9()); 
                          
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3308:6: (enumLiteral_10= 'int8_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3308:6: (enumLiteral_10= 'int8_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3308:8: enumLiteral_10= 'int8_t'
                    {
                    enumLiteral_10=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleTypeSpecifier7368); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_10, grammarAccess.getTypeSpecifierAccess().getInt8_tEnumLiteralDeclaration_10()); 
                          
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3314:6: (enumLiteral_11= 'uint8_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3314:6: (enumLiteral_11= 'uint8_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3314:8: enumLiteral_11= 'uint8_t'
                    {
                    enumLiteral_11=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleTypeSpecifier7385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_11, grammarAccess.getTypeSpecifierAccess().getUint8_tEnumLiteralDeclaration_11()); 
                          
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3320:6: (enumLiteral_12= 'int16_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3320:6: (enumLiteral_12= 'int16_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3320:8: enumLiteral_12= 'int16_t'
                    {
                    enumLiteral_12=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleTypeSpecifier7402); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_12, grammarAccess.getTypeSpecifierAccess().getInt16_tEnumLiteralDeclaration_12()); 
                          
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3326:6: (enumLiteral_13= 'uint16_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3326:6: (enumLiteral_13= 'uint16_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3326:8: enumLiteral_13= 'uint16_t'
                    {
                    enumLiteral_13=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleTypeSpecifier7419); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_13, grammarAccess.getTypeSpecifierAccess().getUint16_tEnumLiteralDeclaration_13()); 
                          
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3332:6: (enumLiteral_14= 'int32_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3332:6: (enumLiteral_14= 'int32_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3332:8: enumLiteral_14= 'int32_t'
                    {
                    enumLiteral_14=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleTypeSpecifier7436); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_14, grammarAccess.getTypeSpecifierAccess().getInt32_tEnumLiteralDeclaration_14()); 
                          
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3338:6: (enumLiteral_15= 'uint32_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3338:6: (enumLiteral_15= 'uint32_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3338:8: enumLiteral_15= 'uint32_t'
                    {
                    enumLiteral_15=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleTypeSpecifier7453); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_15, grammarAccess.getTypeSpecifierAccess().getUint32_tEnumLiteralDeclaration_15()); 
                          
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3344:6: (enumLiteral_16= 'int64_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3344:6: (enumLiteral_16= 'int64_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3344:8: enumLiteral_16= 'int64_t'
                    {
                    enumLiteral_16=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleTypeSpecifier7470); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_16, grammarAccess.getTypeSpecifierAccess().getInt64_tEnumLiteralDeclaration_16()); 
                          
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3350:6: (enumLiteral_17= 'uint64_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3350:6: (enumLiteral_17= 'uint64_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3350:8: enumLiteral_17= 'uint64_t'
                    {
                    enumLiteral_17=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleTypeSpecifier7487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_17, grammarAccess.getTypeSpecifierAccess().getUint64_tEnumLiteralDeclaration_17()); 
                          
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3356:6: (enumLiteral_18= 'intptr_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3356:6: (enumLiteral_18= 'intptr_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3356:8: enumLiteral_18= 'intptr_t'
                    {
                    enumLiteral_18=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleTypeSpecifier7504); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_18, grammarAccess.getTypeSpecifierAccess().getIntptr_tEnumLiteralDeclaration_18()); 
                          
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3362:6: (enumLiteral_19= 'uintptr_t' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3362:6: (enumLiteral_19= 'uintptr_t' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3362:8: enumLiteral_19= 'uintptr_t'
                    {
                    enumLiteral_19=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleTypeSpecifier7521); if (state.failed) return current;
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
    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3372:1: ruleParameterQualifier returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleParameterQualifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3374:28: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3375:1: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3375:1: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==70) ) {
                alt72=1;
            }
            else if ( (LA72_0==71) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3375:2: (enumLiteral_0= 'in' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3375:2: (enumLiteral_0= 'in' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3375:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleParameterQualifier7566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getParameterQualifierAccess().getInEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3381:6: (enumLiteral_1= 'out' )
                    {
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3381:6: (enumLiteral_1= 'out' )
                    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3381:8: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleParameterQualifier7583); if (state.failed) return current;
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

    // $ANTLR start synpred57_InternalFractalItf
    public final void synpred57_InternalFractalItf_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_type_1_0 = null;

        EObject lv_expr_3_0 = null;


        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2779:2: ( (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) ) )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2779:2: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2779:2: (otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) ) )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2779:4: otherlv_0= '(' ( (lv_type_1_0= ruleQualifiedTypeSpecification ) ) otherlv_2= ')' ( (lv_expr_3_0= ruleCastExpression ) )
        {
        otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_synpred57_InternalFractalItf5940); if (state.failed) return ;
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2783:1: ( (lv_type_1_0= ruleQualifiedTypeSpecification ) )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2784:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2784:1: (lv_type_1_0= ruleQualifiedTypeSpecification )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2785:3: lv_type_1_0= ruleQualifiedTypeSpecification
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCastExpressionAccess().getTypeQualifiedTypeSpecificationParserRuleCall_0_1_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleQualifiedTypeSpecification_in_synpred57_InternalFractalItf5961);
        lv_type_1_0=ruleQualifiedTypeSpecification();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_2=(Token)match(input,37,FollowSets000.FOLLOW_37_in_synpred57_InternalFractalItf5973); if (state.failed) return ;
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2805:1: ( (lv_expr_3_0= ruleCastExpression ) )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2806:1: (lv_expr_3_0= ruleCastExpression )
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2806:1: (lv_expr_3_0= ruleCastExpression )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:2807:3: lv_expr_3_0= ruleCastExpression
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCastExpressionAccess().getExprCastExpressionParserRuleCall_0_3_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_ruleCastExpression_in_synpred57_InternalFractalItf5994);
        lv_expr_3_0=ruleCastExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred57_InternalFractalItf

    // $ANTLR start synpred63_InternalFractalItf
    public final void synpred63_InternalFractalItf_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_signedINT_2 = null;


        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3046:5: (this_signedINT_2= rulesignedINT )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3046:5: this_signedINT_2= rulesignedINT
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_0_2()); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred63_InternalFractalItf6581);
        this_signedINT_2=rulesignedINT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalFractalItf

    // $ANTLR start synpred66_InternalFractalItf
    public final void synpred66_InternalFractalItf_fragment() throws RecognitionException {   
        Token kw=null;
        Token this_FDSYMBOL_4=null;
        AntlrDatatypeRuleToken this_signedINT_0 = null;

        AntlrDatatypeRuleToken this_signedINT_2 = null;

        AntlrDatatypeRuleToken this_Exponent_3 = null;


        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3028:2: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3028:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? )
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3028:2: ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3028:3: (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )?
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3028:3: (this_signedINT_0= rulesignedINT )+
        int cnt75=0;
        loop75:
        do {
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=RULE_ADDITIVE_OPERATION && LA75_0<=RULE_INT)) ) {
                alt75=1;
            }


            switch (alt75) {
        	case 1 :
        	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3029:5: this_signedINT_0= rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred66_InternalFractalItf6538);
        	    this_signedINT_0=rulesignedINT();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt75 >= 1 ) break loop75;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(75, input);
                    throw eee;
            }
            cnt75++;
        } while (true);

        kw=(Token)match(input,31,FollowSets000.FOLLOW_31_in_synpred66_InternalFractalItf6558); if (state.failed) return ;
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3045:1: (this_signedINT_2= rulesignedINT )*
        loop76:
        do {
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_INT) ) {
                int LA76_2 = input.LA(2);

                if ( (synpred63_InternalFractalItf()) ) {
                    alt76=1;
                }


            }
            else if ( (LA76_0==RULE_ADDITIVE_OPERATION) ) {
                alt76=1;
            }


            switch (alt76) {
        	case 1 :
        	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3046:5: this_signedINT_2= rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred66_InternalFractalItf6581);
        	    this_signedINT_2=rulesignedINT();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop76;
            }
        } while (true);

        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3056:3: (this_Exponent_3= ruleExponent )?
        int alt77=2;
        int LA77_0 = input.LA(1);

        if ( (LA77_0==RULE_INT||(LA77_0>=47 && LA77_0<=48)) ) {
            alt77=1;
        }
        switch (alt77) {
            case 1 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3057:5: this_Exponent_3= ruleExponent
                {
                pushFollow(FollowSets000.FOLLOW_ruleExponent_in_synpred66_InternalFractalItf6611);
                this_Exponent_3=ruleExponent();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3067:3: (this_FDSYMBOL_4= RULE_FDSYMBOL )?
        int alt78=2;
        int LA78_0 = input.LA(1);

        if ( (LA78_0==RULE_FDSYMBOL) ) {
            alt78=1;
        }
        switch (alt78) {
            case 1 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3067:8: this_FDSYMBOL_4= RULE_FDSYMBOL
                {
                this_FDSYMBOL_4=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_synpred66_InternalFractalItf6634); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred66_InternalFractalItf

    // $ANTLR start synpred67_InternalFractalItf
    public final void synpred67_InternalFractalItf_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_signedINT_6 = null;


        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3082:5: (this_signedINT_6= rulesignedINT )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3082:5: this_signedINT_6= rulesignedINT
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_1_1()); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred67_InternalFractalItf6685);
        this_signedINT_6=rulesignedINT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_InternalFractalItf

    // $ANTLR start synpred71_InternalFractalItf
    public final void synpred71_InternalFractalItf_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_signedINT_9 = null;


        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3112:5: (this_signedINT_9= rulesignedINT )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3112:5: this_signedINT_9= rulesignedINT
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_2_0()); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred71_InternalFractalItf6776);
        this_signedINT_9=rulesignedINT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_InternalFractalItf

    // $ANTLR start synpred73_InternalFractalItf
    public final void synpred73_InternalFractalItf_fragment() throws RecognitionException {   
        Token this_FDSYMBOL_11=null;
        AntlrDatatypeRuleToken this_signedINT_9 = null;

        AntlrDatatypeRuleToken this_Exponent_10 = null;


        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3111:6: ( ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3111:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? )
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3111:6: ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3111:7: (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )?
        {
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3111:7: (this_signedINT_9= rulesignedINT )+
        int cnt82=0;
        loop82:
        do {
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==RULE_INT) ) {
                int LA82_2 = input.LA(2);

                if ( (synpred71_InternalFractalItf()) ) {
                    alt82=1;
                }


            }
            else if ( (LA82_0==RULE_ADDITIVE_OPERATION) ) {
                alt82=1;
            }


            switch (alt82) {
        	case 1 :
        	    // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3112:5: this_signedINT_9= rulesignedINT
        	    {
        	    pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred73_InternalFractalItf6776);
        	    this_signedINT_9=rulesignedINT();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    if ( cnt82 >= 1 ) break loop82;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(82, input);
                    throw eee;
            }
            cnt82++;
        } while (true);

        pushFollow(FollowSets000.FOLLOW_ruleExponent_in_synpred73_InternalFractalItf6805);
        this_Exponent_10=ruleExponent();

        state._fsp--;
        if (state.failed) return ;
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3133:1: (this_FDSYMBOL_11= RULE_FDSYMBOL )?
        int alt83=2;
        int LA83_0 = input.LA(1);

        if ( (LA83_0==RULE_FDSYMBOL) ) {
            alt83=1;
        }
        switch (alt83) {
            case 1 :
                // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3133:6: this_FDSYMBOL_11= RULE_FDSYMBOL
                {
                this_FDSYMBOL_11=(Token)match(input,RULE_FDSYMBOL,FollowSets000.FOLLOW_RULE_FDSYMBOL_in_synpred73_InternalFractalItf6826); if (state.failed) return ;

                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred73_InternalFractalItf

    // $ANTLR start synpred74_InternalFractalItf
    public final void synpred74_InternalFractalItf_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_signedINT_12 = null;


        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3142:5: (this_signedINT_12= rulesignedINT )
        // ../org.ow2.mindEd.itf.editor.textual.model/src-gen/org/ow2/mindEd/itf/editor/textual/parser/antlr/internal/InternalFractalItf.g:3142:5: this_signedINT_12= rulesignedINT
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getFloatingPointLiteralAccess().getSignedINTParserRuleCall_3_0()); 
              
        }
        pushFollow(FollowSets000.FOLLOW_rulesignedINT_in_synpred74_InternalFractalItf6864);
        this_signedINT_12=rulesignedINT();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred74_InternalFractalItf

    // Delegated rules

    public final boolean synpred67_InternalFractalItf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalFractalItf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalFractalItf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalFractalItf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_InternalFractalItf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalFractalItf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred66_InternalFractalItf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalFractalItf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalFractalItf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalFractalItf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred74_InternalFractalItf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalFractalItf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalFractalItf() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalFractalItf_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA67 dfa67 = new DFA67(this);
    static final String DFA67_eotS =
        "\15\uffff";
    static final String DFA67_eofS =
        "\2\uffff\1\7\12\uffff";
    static final String DFA67_minS =
        "\1\10\1\11\1\10\1\uffff\1\11\2\10\1\uffff\1\0\1\uffff\1\0\1\11"+
        "\1\uffff";
    static final String DFA67_maxS =
        "\1\37\1\11\1\60\1\uffff\1\11\1\10\1\37\1\uffff\1\0\1\uffff\1\0"+
        "\1\11\1\uffff";
    static final String DFA67_acceptS =
        "\3\uffff\1\2\3\uffff\1\4\1\uffff\1\1\2\uffff\1\3";
    static final String DFA67_specialS =
        "\6\uffff\1\1\1\uffff\1\0\1\uffff\1\2\2\uffff}>";
    static final String[] DFA67_transitionS = {
            "\1\1\1\2\25\uffff\1\3",
            "\1\2",
            "\1\10\1\6\2\7\1\uffff\1\7\4\uffff\2\7\1\uffff\3\7\1\uffff"+
            "\2\7\3\uffff\1\7\1\11\2\7\3\uffff\1\7\2\uffff\1\7\1\uffff\5"+
            "\7\1\4\1\5",
            "",
            "\1\12",
            "\1\13",
            "\2\11\25\uffff\1\11",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\12",
            ""
    };

    static final short[] DFA67_eot = DFA.unpackEncodedString(DFA67_eotS);
    static final short[] DFA67_eof = DFA.unpackEncodedString(DFA67_eofS);
    static final char[] DFA67_min = DFA.unpackEncodedStringToUnsignedChars(DFA67_minS);
    static final char[] DFA67_max = DFA.unpackEncodedStringToUnsignedChars(DFA67_maxS);
    static final short[] DFA67_accept = DFA.unpackEncodedString(DFA67_acceptS);
    static final short[] DFA67_special = DFA.unpackEncodedString(DFA67_specialS);
    static final short[][] DFA67_transition;

    static {
        int numStates = DFA67_transitionS.length;
        DFA67_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA67_transition[i] = DFA.unpackEncodedString(DFA67_transitionS[i]);
        }
    }

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = DFA67_eot;
            this.eof = DFA67_eof;
            this.min = DFA67_min;
            this.max = DFA67_max;
            this.accept = DFA67_accept;
            this.special = DFA67_special;
            this.transition = DFA67_transition;
        }
        public String getDescription() {
            return "3028:1: ( ( (this_signedINT_0= rulesignedINT )+ kw= '.' (this_signedINT_2= rulesignedINT )* (this_Exponent_3= ruleExponent )? (this_FDSYMBOL_4= RULE_FDSYMBOL )? ) | (kw= '.' (this_signedINT_6= rulesignedINT )+ (this_Exponent_7= ruleExponent )? (this_FDSYMBOL_8= RULE_FDSYMBOL )? ) | ( (this_signedINT_9= rulesignedINT )+ this_Exponent_10= ruleExponent (this_FDSYMBOL_11= RULE_FDSYMBOL )? ) | ( (this_signedINT_12= rulesignedINT )+ (this_Exponent_13= ruleExponent )? (this_FDSYMBOL_14= RULE_FDSYMBOL )? ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_8 = input.LA(1);

                         
                        int index67_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalFractalItf()) ) {s = 9;}

                        else if ( (synpred73_InternalFractalItf()) ) {s = 12;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index67_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_6 = input.LA(1);

                         
                        int index67_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA67_6>=RULE_ADDITIVE_OPERATION && LA67_6<=RULE_INT)||LA67_6==31) ) {s = 9;}

                        else if ( (synpred73_InternalFractalItf()) ) {s = 12;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index67_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_10 = input.LA(1);

                         
                        int index67_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred73_InternalFractalItf()) ) {s = 12;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index67_10);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleItfFile_in_entryRuleItfFile81 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleItfFile91 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIncludeDirective_in_ruleItfFile137 = new BitSet(new long[]{0x0000018302C80000L});
        public static final BitSet FOLLOW_ruleConstantDefinition_in_ruleItfFile160 = new BitSet(new long[]{0x0000010302C80000L});
        public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleItfFile187 = new BitSet(new long[]{0x0000010302C80000L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_ruleItfFile210 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleItfFile223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition261 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedefSpecification_in_ruleTypeDefinition322 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeDefinition352 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeDefinition382 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTypeDefinition394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypedefSpecification_in_entryRuleTypedefSpecification430 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypedefSpecification440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleTypedefSpecification477 = new BitSet(new long[]{0xFFFE001102C80010L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleTypedefSpecification498 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleDeclarators_in_ruleTypedefSpecification519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_entryRuleQualifiedTypeSpecification555 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedTypeSpecification565 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeQualifier_in_ruleQualifiedTypeSpecification611 = new BitSet(new long[]{0xFFFE001102C80010L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleTypeSpecification_in_ruleQualifiedTypeSpecification633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeSpecification_in_entryRuleTypeSpecification669 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeSpecification679 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTypeSpecification725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_ruleTypeSpecification756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_ruleTypeSpecification786 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification813 = new BitSet(new long[]{0xFFFE001102C80012L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleTypeSpecifier_in_ruleTypeSpecification834 = new BitSet(new long[]{0xFFFE001102C80012L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleStructOrUnionSpecification_in_entryRuleStructOrUnionSpecification872 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionSpecification882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_ruleStructOrUnionSpecification932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructorUnionReference_in_ruleStructOrUnionSpecification962 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnionDefinition_in_entryRuleStructOrUnionDefinition997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnionDefinition1007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructOrUnionDefinition1053 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStructOrUnionDefinition1070 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleStructOrUnionDefinition1088 = new BitSet(new long[]{0xFFFE011102E80010L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleStructMember_in_ruleStructOrUnionDefinition1109 = new BitSet(new long[]{0xFFFE011102E80010L,0x000000000000003FL});
        public static final BitSet FOLLOW_21_in_ruleStructOrUnionDefinition1122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructorUnionReference_in_entryRuleStructorUnionReference1158 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructorUnionReference1168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_ruleStructorUnionReference1214 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleStructorUnionReference1231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructOrUnion_in_entryRuleStructOrUnion1273 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructOrUnion1284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleStructOrUnion1322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleStructOrUnion1341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructMember_in_entryRuleStructMember1381 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructMember1391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleStructMember1437 = new BitSet(new long[]{0xFFFE001102C80010L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleStructMember1459 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleDeclarators_in_ruleStructMember1480 = new BitSet(new long[]{0x0000000001040000L});
        public static final BitSet FOLLOW_24_in_ruleStructMember1493 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleStructMember1514 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleStructMember1528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumSpecification_in_entryRuleEnumSpecification1564 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumSpecification1574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumDefinition_in_ruleEnumSpecification1624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumReference_in_ruleEnumSpecification1654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumDefinition_in_entryRuleEnumDefinition1689 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumDefinition1699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEnumDefinition1736 = new BitSet(new long[]{0x0000000000100010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumDefinition1753 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleEnumDefinition1771 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumMemberList_in_ruleEnumDefinition1792 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleEnumDefinition1804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumReference_in_entryRuleEnumReference1840 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumReference1850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEnumReference1887 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumReference1904 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumMemberList_in_entryRuleEnumMemberList1945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumMemberList1955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2001 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleEnumMemberList2014 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumMember_in_ruleEnumMemberList2035 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleEnumMember_in_entryRuleEnumMember2073 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumMember2083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumMember2125 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_27_in_ruleEnumMember2143 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleEnumMember2164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclarators_in_entryRuleDeclarators2202 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclarators2212 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2258 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleDeclarators2271 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleDeclarators2292 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleDeclarator_in_entryRuleDeclarator2330 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDeclarator2340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePointerSpecification_in_ruleDeclarator2386 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleDirectDeclarator_in_ruleDeclarator2408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePointerSpecification_in_entryRulePointerSpecification2445 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePointerSpecification2456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rulePointerSpecification2493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDirectDeclarator_in_entryRuleDirectDeclarator2532 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDirectDeclarator2542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDirectDeclarator2584 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_ruleDirectDeclarator2610 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_ruleArraySpecification_in_entryRuleArraySpecification2647 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArraySpecification2657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleArraySpecification2701 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleArraySpecification2726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleArraySpecification2746 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleArraySpecification2767 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleArraySpecification2779 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName2817 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName2828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2868 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_31_in_ruleQualifiedName2887 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName2902 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_ruleConstantDefinition_in_entryRuleConstantDefinition2949 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantDefinition2959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleConstantDefinition2996 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDefinition3013 = new BitSet(new long[]{0x0000000880001332L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_ruleConstantDefinition3039 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInterfaceDefinition_in_entryRuleInterfaceDefinition3076 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInterfaceDefinition3086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleInterfaceDefinition3132 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33_in_ruleInterfaceDefinition3145 = new BitSet(new long[]{0x0000000400000010L});
        public static final BitSet FOLLOW_34_in_ruleInterfaceDefinition3158 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition3181 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_24_in_ruleInterfaceDefinition3194 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInterfaceDefinition3215 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleInterfaceDefinition3229 = new BitSet(new long[]{0xFFFE011102E80010L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleMethodDefinition_in_ruleInterfaceDefinition3250 = new BitSet(new long[]{0xFFFE011102E80010L,0x000000000000003FL});
        public static final BitSet FOLLOW_21_in_ruleInterfaceDefinition3263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMethodDefinition_in_entryRuleMethodDefinition3299 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMethodDefinition3309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleMethodDefinition3355 = new BitSet(new long[]{0xFFFE001102C80010L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleMethodDefinition3377 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_rulePointerSpecification_in_ruleMethodDefinition3398 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleMethodDefinition3416 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleMethodDefinition3435 = new BitSet(new long[]{0x0000003000000000L});
        public static final BitSet FOLLOW_36_in_ruleMethodDefinition3448 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleMethodDefinition3462 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_35_in_ruleMethodDefinition3482 = new BitSet(new long[]{0xFFFE011102C80010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleParameterList_in_ruleMethodDefinition3503 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleMethodDefinition3515 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleMethodDefinition3529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList3565 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterList3575 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList3621 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleParameterList3634 = new BitSet(new long[]{0xFFFE011102C80010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList3655 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_26_in_ruleParameterList3670 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleParameterList3682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter3720 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter3730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_ruleParameter3776 = new BitSet(new long[]{0xFFFE001102C80010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleParameterQualifier_in_ruleParameter3798 = new BitSet(new long[]{0xFFFE001102C80010L,0x00000000000000FFL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleParameter3820 = new BitSet(new long[]{0x0000000010000010L});
        public static final BitSet FOLLOW_ruleDeclarator_in_ruleParameter3841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIncludeDirective_in_entryRuleIncludeDirective3877 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIncludeDirective3887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleIncludeDirective3924 = new BitSet(new long[]{0x0000000000000060L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleIncludeDirective3942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INCLUDE_LIB_in_ruleIncludeDirective3970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationsList_in_entryRuleAnnotationsList4012 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationsList4022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList4068 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_ruleAnnotationsList4089 = new BitSet(new long[]{0x0000010000000002L});
        public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation4126 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation4136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleAnnotation4173 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotation4194 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_35_in_ruleAnnotation4207 = new BitSet(new long[]{0x0000020000000390L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_ruleAnnotation4228 = new BitSet(new long[]{0x0000002004000000L});
        public static final BitSet FOLLOW_26_in_ruleAnnotation4241 = new BitSet(new long[]{0x0000020000000390L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_ruleAnnotation4262 = new BitSet(new long[]{0x0000002004000000L});
        public static final BitSet FOLLOW_37_in_ruleAnnotation4276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationValuePair_in_entryRuleAnnotationValuePair4314 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValuePair4324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAnnotationValuePair4367 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleAnnotationValuePair4384 = new BitSet(new long[]{0x0000020000000390L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_ruleAnnotationValuePair4407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAnnotationValue_in_entryRuleAnnotationValue4444 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAnnotationValue4455 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleAnnotationValue4502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleAnnotationValue4526 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleAnnotationValue4547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAnnotationValue4580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_entryRulesignedINT4626 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulesignedINT4637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ADDITIVE_OPERATION_in_rulesignedINT4678 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_rulesignedINT4700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_entryRuleConstantExpression4745 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantExpression4755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleConstantExpression4804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_entryRuleLogicalOrExpression4838 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOrExpression4848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalOrExpression4894 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleLogicalOrExpression4907 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleLogicalOrExpression_in_ruleLogicalOrExpression4928 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_entryRuleLogicalAndExpression4966 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLogicalAndExpression4976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleLogicalAndExpression5022 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_43_in_ruleLogicalAndExpression5035 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleLogicalAndExpression_in_ruleLogicalAndExpression5056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression5094 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression5104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXorExpression_in_ruleOrExpression5150 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_44_in_ruleOrExpression5163 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleOrExpression5184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleXorExpression_in_entryRuleXorExpression5222 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleXorExpression5232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleXorExpression5278 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleXorExpression5291 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleXorExpression_in_ruleXorExpression5312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression5350 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression5360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_ruleAndExpression5406 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_46_in_ruleAndExpression5419 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleAndExpression5440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_entryRuleShiftExpression5478 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleShiftExpression5488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleShiftExpression5534 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_RULE_SHIFT_OPERATION_in_ruleShiftExpression5552 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleShiftExpression_in_ruleShiftExpression5578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression5616 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression5626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMulExpression_in_ruleAdditiveExpression5672 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_RULE_ADDITIVE_OPERATION_in_ruleAdditiveExpression5690 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleAdditiveExpression5716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMulExpression_in_entryRuleMulExpression5754 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMulExpression5764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCastExpression_in_ruleMulExpression5810 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_RULE_MUL_OPERATION_in_ruleMulExpression5828 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleMulExpression_in_ruleMulExpression5854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCastExpression_in_entryRuleCastExpression5892 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCastExpression5902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleCastExpression5940 = new BitSet(new long[]{0xFFFE001102C80010L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_ruleCastExpression5961 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleCastExpression5973 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleCastExpression_in_ruleCastExpression5994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_ruleCastExpression6022 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryExpression_in_entryRuleUnaryExpression6058 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpression6068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_UNARY_OPERATION_in_ruleUnaryExpression6110 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleUnaryExpression6137 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6173 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression6183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression6229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rulePrimaryExpression6248 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleConstantExpression_in_rulePrimaryExpression6273 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_rulePrimaryExpression6284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral6322 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral6333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral6373 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral6399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_ruleLiteral6432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFloatingPointLiteral_in_entryRuleFloatingPointLiteral6478 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPointLiteral6489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6538 = new BitSet(new long[]{0x0000000080000300L});
        public static final BitSet FOLLOW_31_in_ruleFloatingPointLiteral6558 = new BitSet(new long[]{0x0001800000002302L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6581 = new BitSet(new long[]{0x0001800000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral6611 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral6634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleFloatingPointLiteral6662 = new BitSet(new long[]{0x0000000000000300L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6685 = new BitSet(new long[]{0x0001800000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral6715 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral6738 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6776 = new BitSet(new long[]{0x0001800000000300L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral6805 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral6826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_ruleFloatingPointLiteral6864 = new BitSet(new long[]{0x0001800000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_ruleFloatingPointLiteral6894 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_ruleFloatingPointLiteral6917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExponent_in_entryRuleExponent6966 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExponent6977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleExponent7016 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_48_in_ruleExponent7036 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_RULE_ADDITIVE_OPERATION_in_ruleExponent7051 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleExponent7075 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_49_in_ruleTypeQualifier7136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleTypeQualifier7153 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleTypeSpecifier7198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleTypeSpecifier7215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleTypeSpecifier7232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleTypeSpecifier7249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTypeSpecifier7266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleTypeSpecifier7283 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleTypeSpecifier7300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleTypeSpecifier7317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleTypeSpecifier7334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleTypeSpecifier7351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleTypeSpecifier7368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleTypeSpecifier7385 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleTypeSpecifier7402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleTypeSpecifier7419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleTypeSpecifier7436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleTypeSpecifier7453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleTypeSpecifier7470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleTypeSpecifier7487 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleTypeSpecifier7504 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleTypeSpecifier7521 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleParameterQualifier7566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleParameterQualifier7583 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_synpred57_InternalFractalItf5940 = new BitSet(new long[]{0xFFFE001102C80010L,0x000000000000003FL});
        public static final BitSet FOLLOW_ruleQualifiedTypeSpecification_in_synpred57_InternalFractalItf5961 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_synpred57_InternalFractalItf5973 = new BitSet(new long[]{0x0000000880001330L});
        public static final BitSet FOLLOW_ruleCastExpression_in_synpred57_InternalFractalItf5994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred63_InternalFractalItf6581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred66_InternalFractalItf6538 = new BitSet(new long[]{0x0000000080000300L});
        public static final BitSet FOLLOW_31_in_synpred66_InternalFractalItf6558 = new BitSet(new long[]{0x0001800000002302L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred66_InternalFractalItf6581 = new BitSet(new long[]{0x0001800000002302L});
        public static final BitSet FOLLOW_ruleExponent_in_synpred66_InternalFractalItf6611 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_synpred66_InternalFractalItf6634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred67_InternalFractalItf6685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred71_InternalFractalItf6776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred73_InternalFractalItf6776 = new BitSet(new long[]{0x0001800000000300L});
        public static final BitSet FOLLOW_ruleExponent_in_synpred73_InternalFractalItf6805 = new BitSet(new long[]{0x0000000000002002L});
        public static final BitSet FOLLOW_RULE_FDSYMBOL_in_synpred73_InternalFractalItf6826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulesignedINT_in_synpred74_InternalFractalItf6864 = new BitSet(new long[]{0x0000000000000002L});
    }


}
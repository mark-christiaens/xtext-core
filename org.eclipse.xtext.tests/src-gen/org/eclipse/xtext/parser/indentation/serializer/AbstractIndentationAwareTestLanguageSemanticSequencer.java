/*
 * generated by Xtext
 */
package org.eclipse.xtext.parser.indentation.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.parser.indentation.indentationAwareTestLanguage.IndentationAwareTestLanguagePackage;
import org.eclipse.xtext.parser.indentation.indentationAwareTestLanguage.Tree;
import org.eclipse.xtext.parser.indentation.indentationAwareTestLanguage.TreeNode;
import org.eclipse.xtext.parser.indentation.services.IndentationAwareTestLanguageGrammarAccess;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public abstract class AbstractIndentationAwareTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private IndentationAwareTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == IndentationAwareTestLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case IndentationAwareTestLanguagePackage.TREE:
				sequence_Tree(context, (Tree) semanticObject); 
				return; 
			case IndentationAwareTestLanguagePackage.TREE_NODE:
				sequence_TreeNode(context, (TreeNode) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     TreeNode returns TreeNode
	 *
	 * Constraint:
	 *     (name=ID children+=TreeNode*)
	 */
	protected void sequence_TreeNode(ISerializationContext context, TreeNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Tree returns Tree
	 *
	 * Constraint:
	 *     nodes+=TreeNode*
	 */
	protected void sequence_Tree(ISerializationContext context, Tree semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
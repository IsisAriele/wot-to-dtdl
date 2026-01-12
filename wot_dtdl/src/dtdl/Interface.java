/**
 */
package dtdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtdl.Interface#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see dtdl.DtdlPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends Element {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link dtdl.ContentElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see dtdl.DtdlPackage#getInterface_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContentElement> getContents();

} // Interface

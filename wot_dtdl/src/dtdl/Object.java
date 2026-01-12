/**
 */
package dtdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dtdl.Object#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see dtdl.DtdlPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends ComplexSchema {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link dtdl.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see dtdl.DtdlPackage#getObject_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

} // Object

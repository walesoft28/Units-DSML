/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.group32.units.units;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Conversion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.group32.units.units.TimeConversion#getTime <em>Time</em>}</li>
 *   <li>{@link uk.ac.kcl.group32.units.units.TimeConversion#getInitialTime <em>Initial Time</em>}</li>
 *   <li>{@link uk.ac.kcl.group32.units.units.TimeConversion#getConvertedTime <em>Converted Time</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.group32.units.units.UnitsPackage#getTimeConversion()
 * @model
 * @generated
 */
public interface TimeConversion extends Statements
{
  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(IntExpression)
   * @see uk.ac.kcl.group32.units.units.UnitsPackage#getTimeConversion_Time()
   * @model containment="true"
   * @generated
   */
  IntExpression getTime();

  /**
   * Sets the value of the '{@link uk.ac.kcl.group32.units.units.TimeConversion#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(IntExpression value);

  /**
   * Returns the value of the '<em><b>Initial Time</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.group32.units.units.TimeUnits}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Time</em>' attribute.
   * @see uk.ac.kcl.group32.units.units.TimeUnits
   * @see #setInitialTime(TimeUnits)
   * @see uk.ac.kcl.group32.units.units.UnitsPackage#getTimeConversion_InitialTime()
   * @model
   * @generated
   */
  TimeUnits getInitialTime();

  /**
   * Sets the value of the '{@link uk.ac.kcl.group32.units.units.TimeConversion#getInitialTime <em>Initial Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial Time</em>' attribute.
   * @see uk.ac.kcl.group32.units.units.TimeUnits
   * @see #getInitialTime()
   * @generated
   */
  void setInitialTime(TimeUnits value);

  /**
   * Returns the value of the '<em><b>Converted Time</b></em>' attribute.
   * The literals are from the enumeration {@link uk.ac.kcl.group32.units.units.TimeUnits}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Converted Time</em>' attribute.
   * @see uk.ac.kcl.group32.units.units.TimeUnits
   * @see #setConvertedTime(TimeUnits)
   * @see uk.ac.kcl.group32.units.units.UnitsPackage#getTimeConversion_ConvertedTime()
   * @model
   * @generated
   */
  TimeUnits getConvertedTime();

  /**
   * Sets the value of the '{@link uk.ac.kcl.group32.units.units.TimeConversion#getConvertedTime <em>Converted Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Converted Time</em>' attribute.
   * @see uk.ac.kcl.group32.units.units.TimeUnits
   * @see #getConvertedTime()
   * @generated
   */
  void setConvertedTime(TimeUnits value);

} // TimeConversion

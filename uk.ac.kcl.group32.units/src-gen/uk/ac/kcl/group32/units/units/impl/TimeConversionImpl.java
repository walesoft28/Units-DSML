/**
 * generated by Xtext 2.24.0
 */
package uk.ac.kcl.group32.units.units.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.group32.units.units.IntExpression;
import uk.ac.kcl.group32.units.units.TimeConversion;
import uk.ac.kcl.group32.units.units.TimeUnits;
import uk.ac.kcl.group32.units.units.UnitsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Conversion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.group32.units.units.impl.TimeConversionImpl#getTime <em>Time</em>}</li>
 *   <li>{@link uk.ac.kcl.group32.units.units.impl.TimeConversionImpl#getInitialTime <em>Initial Time</em>}</li>
 *   <li>{@link uk.ac.kcl.group32.units.units.impl.TimeConversionImpl#getConvertedTime <em>Converted Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeConversionImpl extends StatementsImpl implements TimeConversion
{
  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected IntExpression time;

  /**
   * The default value of the '{@link #getInitialTime() <em>Initial Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialTime()
   * @generated
   * @ordered
   */
  protected static final TimeUnits INITIAL_TIME_EDEFAULT = TimeUnits.HR;

  /**
   * The cached value of the '{@link #getInitialTime() <em>Initial Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialTime()
   * @generated
   * @ordered
   */
  protected TimeUnits initialTime = INITIAL_TIME_EDEFAULT;

  /**
   * The default value of the '{@link #getConvertedTime() <em>Converted Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConvertedTime()
   * @generated
   * @ordered
   */
  protected static final TimeUnits CONVERTED_TIME_EDEFAULT = TimeUnits.HR;

  /**
   * The cached value of the '{@link #getConvertedTime() <em>Converted Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConvertedTime()
   * @generated
   * @ordered
   */
  protected TimeUnits convertedTime = CONVERTED_TIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TimeConversionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UnitsPackage.Literals.TIME_CONVERSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntExpression getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTime(IntExpression newTime, NotificationChain msgs)
  {
    IntExpression oldTime = time;
    time = newTime;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnitsPackage.TIME_CONVERSION__TIME, oldTime, newTime);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTime(IntExpression newTime)
  {
    if (newTime != time)
    {
      NotificationChain msgs = null;
      if (time != null)
        msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnitsPackage.TIME_CONVERSION__TIME, null, msgs);
      if (newTime != null)
        msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnitsPackage.TIME_CONVERSION__TIME, null, msgs);
      msgs = basicSetTime(newTime, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnitsPackage.TIME_CONVERSION__TIME, newTime, newTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeUnits getInitialTime()
  {
    return initialTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInitialTime(TimeUnits newInitialTime)
  {
    TimeUnits oldInitialTime = initialTime;
    initialTime = newInitialTime == null ? INITIAL_TIME_EDEFAULT : newInitialTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnitsPackage.TIME_CONVERSION__INITIAL_TIME, oldInitialTime, initialTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimeUnits getConvertedTime()
  {
    return convertedTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConvertedTime(TimeUnits newConvertedTime)
  {
    TimeUnits oldConvertedTime = convertedTime;
    convertedTime = newConvertedTime == null ? CONVERTED_TIME_EDEFAULT : newConvertedTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UnitsPackage.TIME_CONVERSION__CONVERTED_TIME, oldConvertedTime, convertedTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case UnitsPackage.TIME_CONVERSION__TIME:
        return basicSetTime(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UnitsPackage.TIME_CONVERSION__TIME:
        return getTime();
      case UnitsPackage.TIME_CONVERSION__INITIAL_TIME:
        return getInitialTime();
      case UnitsPackage.TIME_CONVERSION__CONVERTED_TIME:
        return getConvertedTime();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UnitsPackage.TIME_CONVERSION__TIME:
        setTime((IntExpression)newValue);
        return;
      case UnitsPackage.TIME_CONVERSION__INITIAL_TIME:
        setInitialTime((TimeUnits)newValue);
        return;
      case UnitsPackage.TIME_CONVERSION__CONVERTED_TIME:
        setConvertedTime((TimeUnits)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UnitsPackage.TIME_CONVERSION__TIME:
        setTime((IntExpression)null);
        return;
      case UnitsPackage.TIME_CONVERSION__INITIAL_TIME:
        setInitialTime(INITIAL_TIME_EDEFAULT);
        return;
      case UnitsPackage.TIME_CONVERSION__CONVERTED_TIME:
        setConvertedTime(CONVERTED_TIME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UnitsPackage.TIME_CONVERSION__TIME:
        return time != null;
      case UnitsPackage.TIME_CONVERSION__INITIAL_TIME:
        return initialTime != INITIAL_TIME_EDEFAULT;
      case UnitsPackage.TIME_CONVERSION__CONVERTED_TIME:
        return convertedTime != CONVERTED_TIME_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (initialTime: ");
    result.append(initialTime);
    result.append(", convertedTime: ");
    result.append(convertedTime);
    result.append(')');
    return result.toString();
  }

} //TimeConversionImpl

/**
 */
package edu.kit.ipd.sdq.vitruvius.casestudies.jml.language.jML.impl;

import edu.kit.ipd.sdq.vitruvius.casestudies.jml.language.jML.CasePart;
import edu.kit.ipd.sdq.vitruvius.casestudies.jml.language.jML.Expression;
import edu.kit.ipd.sdq.vitruvius.casestudies.jml.language.jML.JMLPackage;
import edu.kit.ipd.sdq.vitruvius.casestudies.jml.language.jML.SwitchExpression;
import edu.kit.ipd.sdq.vitruvius.casestudies.jml.language.jML.ValidID;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.casestudies.jml.language.jML.impl.SwitchExpressionImpl#getDeclaredParam <em>Declared Param</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.casestudies.jml.language.jML.impl.SwitchExpressionImpl#getSwitch <em>Switch</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.casestudies.jml.language.jML.impl.SwitchExpressionImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link edu.kit.ipd.sdq.vitruvius.casestudies.jml.language.jML.impl.SwitchExpressionImpl#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchExpressionImpl extends ExpressionImpl implements SwitchExpression
{
  /**
   * The cached value of the '{@link #getDeclaredParam() <em>Declared Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredParam()
   * @generated
   * @ordered
   */
  protected ValidID declaredParam;

  /**
   * The cached value of the '{@link #getSwitch() <em>Switch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSwitch()
   * @generated
   * @ordered
   */
  protected Expression switch_;

  /**
   * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCases()
   * @generated
   * @ordered
   */
  protected EList<CasePart> cases;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected Expression default_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchExpressionImpl()
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
    return JMLPackage.Literals.SWITCH_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValidID getDeclaredParam()
  {
    return declaredParam;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaredParam(ValidID newDeclaredParam, NotificationChain msgs)
  {
    ValidID oldDeclaredParam = declaredParam;
    declaredParam = newDeclaredParam;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JMLPackage.SWITCH_EXPRESSION__DECLARED_PARAM, oldDeclaredParam, newDeclaredParam);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaredParam(ValidID newDeclaredParam)
  {
    if (newDeclaredParam != declaredParam)
    {
      NotificationChain msgs = null;
      if (declaredParam != null)
        msgs = ((InternalEObject)declaredParam).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JMLPackage.SWITCH_EXPRESSION__DECLARED_PARAM, null, msgs);
      if (newDeclaredParam != null)
        msgs = ((InternalEObject)newDeclaredParam).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JMLPackage.SWITCH_EXPRESSION__DECLARED_PARAM, null, msgs);
      msgs = basicSetDeclaredParam(newDeclaredParam, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JMLPackage.SWITCH_EXPRESSION__DECLARED_PARAM, newDeclaredParam, newDeclaredParam));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSwitch()
  {
    return switch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSwitch(Expression newSwitch, NotificationChain msgs)
  {
    Expression oldSwitch = switch_;
    switch_ = newSwitch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JMLPackage.SWITCH_EXPRESSION__SWITCH, oldSwitch, newSwitch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSwitch(Expression newSwitch)
  {
    if (newSwitch != switch_)
    {
      NotificationChain msgs = null;
      if (switch_ != null)
        msgs = ((InternalEObject)switch_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JMLPackage.SWITCH_EXPRESSION__SWITCH, null, msgs);
      if (newSwitch != null)
        msgs = ((InternalEObject)newSwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JMLPackage.SWITCH_EXPRESSION__SWITCH, null, msgs);
      msgs = basicSetSwitch(newSwitch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JMLPackage.SWITCH_EXPRESSION__SWITCH, newSwitch, newSwitch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CasePart> getCases()
  {
    if (cases == null)
    {
      cases = new EObjectContainmentEList<CasePart>(CasePart.class, this, JMLPackage.SWITCH_EXPRESSION__CASES);
    }
    return cases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefault(Expression newDefault, NotificationChain msgs)
  {
    Expression oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JMLPackage.SWITCH_EXPRESSION__DEFAULT, oldDefault, newDefault);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(Expression newDefault)
  {
    if (newDefault != default_)
    {
      NotificationChain msgs = null;
      if (default_ != null)
        msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JMLPackage.SWITCH_EXPRESSION__DEFAULT, null, msgs);
      if (newDefault != null)
        msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JMLPackage.SWITCH_EXPRESSION__DEFAULT, null, msgs);
      msgs = basicSetDefault(newDefault, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JMLPackage.SWITCH_EXPRESSION__DEFAULT, newDefault, newDefault));
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
      case JMLPackage.SWITCH_EXPRESSION__DECLARED_PARAM:
        return basicSetDeclaredParam(null, msgs);
      case JMLPackage.SWITCH_EXPRESSION__SWITCH:
        return basicSetSwitch(null, msgs);
      case JMLPackage.SWITCH_EXPRESSION__CASES:
        return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
      case JMLPackage.SWITCH_EXPRESSION__DEFAULT:
        return basicSetDefault(null, msgs);
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
      case JMLPackage.SWITCH_EXPRESSION__DECLARED_PARAM:
        return getDeclaredParam();
      case JMLPackage.SWITCH_EXPRESSION__SWITCH:
        return getSwitch();
      case JMLPackage.SWITCH_EXPRESSION__CASES:
        return getCases();
      case JMLPackage.SWITCH_EXPRESSION__DEFAULT:
        return getDefault();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JMLPackage.SWITCH_EXPRESSION__DECLARED_PARAM:
        setDeclaredParam((ValidID)newValue);
        return;
      case JMLPackage.SWITCH_EXPRESSION__SWITCH:
        setSwitch((Expression)newValue);
        return;
      case JMLPackage.SWITCH_EXPRESSION__CASES:
        getCases().clear();
        getCases().addAll((Collection<? extends CasePart>)newValue);
        return;
      case JMLPackage.SWITCH_EXPRESSION__DEFAULT:
        setDefault((Expression)newValue);
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
      case JMLPackage.SWITCH_EXPRESSION__DECLARED_PARAM:
        setDeclaredParam((ValidID)null);
        return;
      case JMLPackage.SWITCH_EXPRESSION__SWITCH:
        setSwitch((Expression)null);
        return;
      case JMLPackage.SWITCH_EXPRESSION__CASES:
        getCases().clear();
        return;
      case JMLPackage.SWITCH_EXPRESSION__DEFAULT:
        setDefault((Expression)null);
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
      case JMLPackage.SWITCH_EXPRESSION__DECLARED_PARAM:
        return declaredParam != null;
      case JMLPackage.SWITCH_EXPRESSION__SWITCH:
        return switch_ != null;
      case JMLPackage.SWITCH_EXPRESSION__CASES:
        return cases != null && !cases.isEmpty();
      case JMLPackage.SWITCH_EXPRESSION__DEFAULT:
        return default_ != null;
    }
    return super.eIsSet(featureID);
  }

} //SwitchExpressionImpl

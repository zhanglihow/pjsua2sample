/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class SipTransaction {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SipTransaction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SipTransaction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_SipTransaction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRole(pjsip_role_e value) {
    pjsua2JNI.SipTransaction_role_set(swigCPtr, this, value.swigValue());
  }

  public pjsip_role_e getRole() {
    return pjsip_role_e.swigToEnum(pjsua2JNI.SipTransaction_role_get(swigCPtr, this));
  }

  public void setMethod(String value) {
    pjsua2JNI.SipTransaction_method_set(swigCPtr, this, value);
  }

  public String getMethod() {
    return pjsua2JNI.SipTransaction_method_get(swigCPtr, this);
  }

  public void setStatusCode(int value) {
    pjsua2JNI.SipTransaction_statusCode_set(swigCPtr, this, value);
  }

  public int getStatusCode() {
    return pjsua2JNI.SipTransaction_statusCode_get(swigCPtr, this);
  }

  public void setStatusText(String value) {
    pjsua2JNI.SipTransaction_statusText_set(swigCPtr, this, value);
  }

  public String getStatusText() {
    return pjsua2JNI.SipTransaction_statusText_get(swigCPtr, this);
  }

  public void setState(pjsip_tsx_state_e value) {
    pjsua2JNI.SipTransaction_state_set(swigCPtr, this, value.swigValue());
  }

  public pjsip_tsx_state_e getState() {
    return pjsip_tsx_state_e.swigToEnum(pjsua2JNI.SipTransaction_state_get(swigCPtr, this));
  }

  public void setLastTx(SipTxData value) {
    pjsua2JNI.SipTransaction_lastTx_set(swigCPtr, this, SipTxData.getCPtr(value), value);
  }

  public SipTxData getLastTx() {
    long cPtr = pjsua2JNI.SipTransaction_lastTx_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SipTxData(cPtr, false);
  }

  public void setPjTransaction(SWIGTYPE_p_void value) {
    pjsua2JNI.SipTransaction_pjTransaction_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getPjTransaction() {
    long cPtr = pjsua2JNI.SipTransaction_pjTransaction_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public SipTransaction() {
    this(pjsua2JNI.new_SipTransaction(), true);
  }

}

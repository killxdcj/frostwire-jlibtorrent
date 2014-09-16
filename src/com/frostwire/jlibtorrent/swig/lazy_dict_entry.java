/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class lazy_dict_entry {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected lazy_dict_entry(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(lazy_dict_entry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_lazy_dict_entry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setName(String value) {
    libtorrent_jni.lazy_dict_entry_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return libtorrent_jni.lazy_dict_entry_name_get(swigCPtr, this);
  }

  public lazy_entry getVal() {
    long cPtr = libtorrent_jni.lazy_dict_entry_val_get(swigCPtr, this);
    return (cPtr == 0) ? null : new lazy_entry(cPtr, false);
  }

  public lazy_dict_entry() {
    this(libtorrent_jni.new_lazy_dict_entry(), true);
  }

}

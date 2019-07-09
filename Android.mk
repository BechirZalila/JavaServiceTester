LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE_TAGS := eng
LOCAL_SRC_FILES := $(call all-java-files-under,src)
LOCAL_REQUIRED_MODULES := com.android.sampservice
LOCAL_JAVA_LIBRARIES := com.android.sampservice \
        framework
LOCAL_PACKAGE_NAME := JavaServiceTester
LOCAL_PROGUARD_ENABLED := disabled
include $(BUILD_PACKAGE)
 

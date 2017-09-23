package com.techexpo.util

import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target


//Retention Policy determines at what point the annotation should be discarded
// Annotation with retention policy RUNTIME will be available to the JVM through runtime.
// Theres also SOURCE and CLASS
@Retention(RetentionPolicy.RUNTIME)
@Target([ElementType.TYPE, ElementType.METHOD])
@interface Unit {}

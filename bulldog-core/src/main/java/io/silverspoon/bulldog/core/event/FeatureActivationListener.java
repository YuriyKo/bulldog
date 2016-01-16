package io.silverspoon.bulldog.core.event;

public interface FeatureActivationListener {

   void featureActivating(Object o, FeatureActivationEventArgs args);

   void featureActivated(Object o, FeatureActivationEventArgs args);

   void featureDeactivating(Object o, FeatureActivationEventArgs args);

   void featureDeactivated(Object o, FeatureActivationEventArgs args);

}
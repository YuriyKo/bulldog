package io.silverspoon.bulldog.core.io.uart;

import io.silverspoon.bulldog.core.gpio.Pin;
import io.silverspoon.bulldog.core.gpio.base.AbstractPinFeature;

public abstract class AbstractUartPinFeature extends AbstractPinFeature implements UartRx, UartTx {

   private static final String NAME = "UART %s on Pin %s";
   private UartSignalType signalType;

   public AbstractUartPinFeature(Pin pin, UartSignalType signalType) {
      super(pin);
      this.signalType = signalType;
   }

   @Override
   public String getName() {
      return String.format(NAME, signalType, getPin().getName());
   }

   public UartSignalType getSignalType() {
      return signalType;
   }
}

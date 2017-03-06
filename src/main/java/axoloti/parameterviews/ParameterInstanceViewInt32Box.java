package axoloti.parameterviews;

import axoloti.objectviews.IAxoObjectInstanceView;
import axoloti.parameters.ParameterInstanceInt32Box;
import components.control.NumberBoxComponent;

public class ParameterInstanceViewInt32Box extends ParameterInstanceViewInt32 {

    public ParameterInstanceViewInt32Box(ParameterInstanceInt32Box parameterInstance, IAxoObjectInstanceView axoObjectInstanceView) {
        super(parameterInstance, axoObjectInstanceView);
    }

    @Override
    public ParameterInstanceInt32Box getParameterInstance() {
        return (ParameterInstanceInt32Box) parameterInstance;
    }

    @Override
    public void updateV() {
        ctrl.setValue(getParameterInstance().getValue().getInt());
    }

    @Override
    public NumberBoxComponent CreateControl() {
        NumberBoxComponent n = new NumberBoxComponent(0.0, getParameterInstance().getMin(), getParameterInstance().getMax(), 1.0);
        return n;
    }

    @Override
    public NumberBoxComponent getControlComponent() {
        return (NumberBoxComponent) ctrl;
    }
}
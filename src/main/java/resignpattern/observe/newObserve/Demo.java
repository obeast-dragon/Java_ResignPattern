package resignpattern.observe.newObserve;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Demo {

    private String name;

    private final PropertyChangeSupport listeners = new PropertyChangeSupport(this);

    public Demo() {
    }

    public Demo(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {

        String oldValue = this.name;

        this.name = name;

        //发布监听事件

        firePropertyChange("name", oldValue, name);

    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        listeners.addPropertyChangeListener(listener);

    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        listeners.removePropertyChangeListener(listener);

    }

    protected void firePropertyChange(String prop, Object oldValue, Object newValue) {
        listeners.firePropertyChange(prop, oldValue, newValue);

    }

}



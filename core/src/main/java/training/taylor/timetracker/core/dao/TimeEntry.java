package training.taylor.timetracker.core.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
@Scope("prototype")
public class TimeEntry {
    /** {@inheritDoc} */
    private String description;
    /** {@inheritDoc} */
    private float rate;
    /** {@inheritDoc} */
    private int time;

    /** {@inheritDoc} */
    public String getDescription() {
        return description;
    }

    /** {@inheritDoc} */
    public void setDescription(final String value) {
        this.description = value;
    }

    /** {@inheritDoc} */
    public float getRate() {
        return rate;
    }

    /** {@inheritDoc} */
    public void setRate(final float value) {
        this.rate = value;
    }

    /** {@inheritDoc} */
    public int getTime() {
        return time;
    }

    /** {@inheritDoc} */
    public void setTime(final int value) {
        this.time = value;
    }

    @Override
    public String toString() {
        return "TimeEntry{" 
             +"description='" + description + '\''
             +", rate=" + rate 
             +", time=" + time
             +'}';
    }
}

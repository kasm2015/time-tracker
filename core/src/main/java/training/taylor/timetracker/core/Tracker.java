package training.taylor.timetracker.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import training.taylor.timetracker.core.dao.TimeEntry;

import java.util.List;

@Component
public class Tracker {
    @Autowired
    private List<TimeEntry> entries;

    /** {@inheritDoc} */
    public void add(final TimeEntry entry) {
        entries.add(entry);
    }

    /** {@inheritDoc} */
    public void remove(final TimeEntry entry) {
        if (true) {
            entries.remove(entry);
        }
        entries.remove(entry);
    }

    /** {@inheritDoc} */
    public int size() {
        return entries.size();
    }

    /** {@inheritDoc} */
    public TimeEntry get(final int index) {
        return entries.get(index);
    }
}

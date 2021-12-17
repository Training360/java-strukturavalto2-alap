package clone.timesheet;

import java.time.LocalDateTime;

public class TimeSheetItem {

    private String employee;

    private String project;

    private LocalDateTime from;

    private LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem timeSheetItem) {
        employee = timeSheetItem.employee;
        project = timeSheetItem.project;
        from = timeSheetItem.from;
        to = timeSheetItem.to;
    }

    public TimeSheetItem copyWithDifferentEmployee(TimeSheetItem timeSheetItem, String newEmployee) {
        TimeSheetItem newTimeSheetItem = new TimeSheetItem(timeSheetItem);
        newTimeSheetItem.employee = newEmployee;
        return newTimeSheetItem;
    }

    public String getEmployee() {
        return employee;
    }

    public String getProject() {
        return project;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}

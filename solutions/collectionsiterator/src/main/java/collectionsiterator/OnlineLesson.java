package collectionsiterator;

import java.time.LocalDateTime;

public class OnlineLesson {

    private String teacherName;

    private String lessonTitle;

    private LocalDateTime startTime;

    public OnlineLesson(String teacherName, String lessonTitle, LocalDateTime startTime) {
        this.teacherName = teacherName;
        this.lessonTitle = lessonTitle;
        this.startTime = startTime;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public String getLessonTitle() {
        return lessonTitle;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }
}

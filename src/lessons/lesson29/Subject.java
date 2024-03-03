package lessons.lesson29;

import java.util.Objects;

public class Subject {

    private String subject;


    public Subject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject subject1)) return false;
        return Objects.equals(subject, subject1.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject='" + subject + '\'' +
                '}';
    }
}

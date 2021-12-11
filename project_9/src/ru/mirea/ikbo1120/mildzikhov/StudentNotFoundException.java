package ru.mirea.ikbo1120.mildzikhov;

class StudentNotFoundException extends RuntimeException implements LabClassUI {
    public StudentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}

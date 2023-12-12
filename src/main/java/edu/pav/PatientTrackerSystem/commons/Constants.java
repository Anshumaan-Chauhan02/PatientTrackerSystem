package edu.pav.PatientTrackerSystem.commons;

/**
 * Constants class contains static final variables representing various strings and formats used in the application.
 * These constants are used for consistent string values throughout the application.
 */
public final class Constants {
    public static final String EMPTY_STRING = "";
    public static final String PATIENT = "patient";
    public static final String DOCTOR = "doctor";
    public static final String yyyy_MM_dd_STRING = "yyyy-MM-dd";
    public static final String HH_mm_STRING = "HH:mm";
    public static final String SUCCESS = "Success!";
    public static final String NO_APPOINTMENT_FOUND_STRING = "No appointment found!";
    public static final String NO_APPOINTMENTS_FUTURE_STRING = "No future appointments found!";
    public static final String APPOINTMENT_ID_NOT_FOUND_STRING ="Appointment ID not found!";
    public static final String CASE_ID_NOT_FOUND_STRING ="Case ID not found!";
    public static final String CASE_NOT_FOUND_OR_CLOSED_STRING ="Case not found or closed!";
    public static final String CASE_SUCCESSFULLY_CLOSED_STRING ="Case successfully closed!";
    public static final String DOCTOR_ID_NOT_FOUND_STRING = "Doctor ID not found!";
    public static final String PATIENT_ID_NOT_FOUND_STRING = "Patient ID not found!";
    public static final String DOCTOR_ALREADY_PRESENT_STRING = "Doctor with this email already exists!";
    public static final String PATIENT_ALREADY_PRESENT_STRING = "Patient with this email already exists!";
    public static final String INVALID_USER_TYPE_STRING =  "User type can only be patient or doctor!";
    public static final String INVALID_DATE_TIME_STRING =  "Invalid date-time entered!";
    public static final String PAST_DATE_TIME_STRING =  "Past date-time entered!";
    public static final String CANNOT_EDIT_PAST_APPOINTMENT = "Can not edit past appointments!";
    public static final String SLOT_ALREADY_BOOKED_STRING =  "Requested slot is already booked for ";
    public static final String SCHEDULE_APPOINTMENT_SUCCESSFUL = "Requested appointment was successfully scheduled!";

    public static enum UserType {
        PATIENT, DOCTOR;

        public String toString() {
            return name().toLowerCase(); // or any custom implementation
        }
    }
}

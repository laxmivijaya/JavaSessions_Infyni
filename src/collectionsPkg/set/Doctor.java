package collectionsPkg.set;

public class Doctor implements Comparable<Doctor>{

    private Integer doctorId;
    private String doctorName;

    public Doctor(Integer doctorId, String doctorName) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Doctor doctor) {
        return doctor.getDoctorId().compareTo(doctorId);
    }
}

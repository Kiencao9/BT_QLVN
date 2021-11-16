package BT_QLNV;

public class NhanVien {
    private int id;
    private String name;
    private int phoneNumber;
    private String address;
    private static int idNumber = 1;


    public NhanVien(String name, int phoneNumber, String address) {
        this.id = idNumber++;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getIdNumber() {
        return idNumber;
    }

    public static void setIdNumber(int idNumber) {
        NhanVien.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Nhân Viên { " +
                "id=" + id +
                ", name ='" + name + '\'' +
                ", phoneNumber =" + phoneNumber +
                ", address ='" + address + '\'' +
                '}';
    }
}


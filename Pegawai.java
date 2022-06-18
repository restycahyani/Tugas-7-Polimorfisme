package Perusahaan;

    public class Pegawai {
        private String nama;
        private String noKTP;

        public Pegawai(String nama, String noKTP){
            this.nama = nama;
            this.noKTP = noKTP;
        }

        public String getNama() {
            return nama;
        }

        public String getNoKTP() {
            return noKTP;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public void setNoKTP(String noKTP) {
            this.noKTP = noKTP;
        }

        @Override
        public String toString() {
            return "Pegawai{" +
                    "nama='" + nama + '\'' +
                    ", noKTP='" + noKTP + '\'' +
                    '}';
        }
    }


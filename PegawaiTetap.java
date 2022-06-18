package Perusahaan;

    public class PegawaiTetap extends Pegawai {
        private double upah;

        public PegawaiTetap(String nama, String noKTP, double upah){
            super(nama, noKTP);
            this.upah = upah;
        }

        public double getUpah() {
            return upah;
        }
        public void setUpah(double upah) {
            this.upah = upah;
        }

        public int gaji(){
            return (int)upah;
        }
        @Override
        public String toString() {
            return "Pegawai Tetap\t\t: " + getNama() + "\nNo.Ktp\t\t\t: " + getNoKTP() +
                    "\nupah\t\t\t: " + upah + "\nPendapatan\t\t: Rp." + gaji() + "\n";
        }
    }

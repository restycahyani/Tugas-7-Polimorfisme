package Perusahaan;

    public class Sales extends Pegawai{
        private int penjualan;
        private double komisi;

        public Sales(String nama, String noKTP, int penjualan, double komisi){
            super(nama, noKTP);
            this.penjualan = penjualan;
            this.komisi = komisi;
        }

        public int getPenjualan() {
            return penjualan;
        }

        public double getKomisi() {
            return komisi;
        }

        public void setPenjualan(int penjualan) {
            this.penjualan = penjualan;
        }

        public void setKomisi(double komisi) {
            this.komisi = komisi;
        }

        public int gaji() {
            return (int)(penjualan * komisi);
        }

        @Override
        public String toString() {
            return "Nama\t\t\t: "+ getNama()+ "\nNo KTP\t\t\t: " + getNoKTP() +
                    "\npenjualan\t\t: " + penjualan +
                    "\nkomisi\t\t\t: " + komisi + "\nPendapatan\t\t: Rp." + gaji() + "\n";
        }
    }

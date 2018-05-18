package Quiz0406;

public class Q22NamePoint extends Q22Point {

        private String name;

        public Q22NamePoint() {
            name = "";
        }
//
//        public NamePoint(int d1, int d2, String Pointname) {
//            x = d1;
//            y = d2;
//            this.name = Pointname;
//        }

        public Q22NamePoint(int d1, int d2, String name) {
            super(d1, d2);
            this.name = name;
        }

}

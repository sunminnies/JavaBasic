package sunmin.basic.day10;

import sunmin.basic.sungjuk.SungJukService;
import sunmin.basic.sungjuk.SungJukServiceImpl;
import sunmin.basic.sungjuk.SungJukVO;

public class SungJukV5bMain {
    public static void main(String[] args) {
        // SungJukService sjsrv = new SungJukServiceImpl();
        SungJukService sjsrv = SungJukServiceImpl.getInstance();


        SungJukVO sj = sjsrv.readSungJuk();
        sjsrv.computeSungJuk(sj);
        sjsrv.printSungJuk(sj);
    }
}

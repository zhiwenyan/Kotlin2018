package chapter12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Description:
 * Data：2019/8/17
 * Author: Steven
 */
public class FaceInfoDAO {
    private FaceInfoDAO() {
    }

    static class SINGLE {
        private static FaceInfoDAO faceInfoDAO = new FaceInfoDAO();
    }

    public static FaceInfoDAO getInstance() {
        return SINGLE.faceInfoDAO;
    }

    public static void main(String[] args) {
        FaceInfoDAO faceInfoDAO1 = FaceInfoDAO.getInstance();
        FaceInfoDAO faceInfoDAO2 = FaceInfoDAO.getInstance();
        System.out.println(faceInfoDAO1 == faceInfoDAO2);
        ExecutorService executorService = Executors.newScheduledThreadPool(3);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(FaceInfoDAO.getInstance());
                }
            });
        }
        executorService.shutdown();
    }


}
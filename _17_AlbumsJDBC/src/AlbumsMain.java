import java.util.ArrayList;
import java.util.Scanner;

public class AlbumsMain {

    Scanner sc = new Scanner(System.in);

    AlbumsDao adao = new AlbumsDao();

    void init() {

        while(true) {

            System.out.println("\n======메뉴 선택하기======");
            System.out.println("1. 모든 정보 조회");
            System.out.println("2. 앨범 추가");
            System.out.println("3. 앨범 수정");
            System.out.println("4. 앨범 삭제");
            System.out.println("5. 프로그램 종료");
            System.out.print("메뉴 선택 >> ");

            int menu = sc.nextInt();

            switch(menu) {
                case 1:
                    getAllAlbums();
                    break;
                case 2:
                    insertAlbums();
                    break;
                case 3:
                    updateAlbums();
                    break;
                case 4:
                    deleteAlbums();
                    break;
                case 5:
                    System.out.println("시스템을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("이외의 번호는 입력할 수 없습니다.");
            }
        }
    }

    private void deleteAlbums() {
        System.out.print("삭제할 번호를 입력하세요 >> ");
        int num = sc.nextInt();

        int cnt = adao.deleteAlbums(num);
        showResult(cnt);
    }

    private void updateAlbums() {
        System.out.print("번호를 입력하세요 >> ");
        int num = sc.nextInt();

        System.out.print("제목를 입력하세요 >> ");
        String song = sc.next();

        System.out.print("가수를 입력하세요 >> ");
        String singer = sc.next();

        System.out.print("회사를 입력하세요 >> ");
        String company = sc.next();

        System.out.print("가격을 입력하세요 >> ");
        int price = sc.nextInt();

        System.out.print("발매일을 입력하세요 >> ");
        String pub_day = sc.next();

        AlbumsBean bean = new AlbumsBean();
        bean.setNum(num);
        bean.setSong(song);
        bean.setSinger(singer);
        bean.setCompany(company);
        bean.setPrice(price);
        bean.setPub_day(pub_day);

        int cnt = adao.updateAlbums(bean);
        showResult(cnt);
    }

    private void insertAlbums() {
        System.out.println("번호는 시퀀으로 입력됩니다.");

        System.out.print("제목를 입력하세요 >> ");
        String song = sc.next();

        System.out.print("가수를 입력하세요 >> ");
        String singer = sc.next();

        System.out.print("회사를 입력하세요 >> ");
        String company = sc.next();

        System.out.print("가격을 입력하세요 >> ");
        int price = sc.nextInt();

        System.out.print("발매일을 입력하세요 >> ");
        String pub_day = sc.next();

        AlbumsBean bean = new AlbumsBean();
        bean.setSong(song);
        bean.setSinger(singer);
        bean.setCompany(company);
        bean.setPrice(price);
        bean.setPub_day(pub_day);

        int cnt = adao.insertAlbums(bean);
        showResult(cnt);
    }

    private void getAllAlbums() {
        ArrayList<AlbumsBean> beans = adao.getAllAlbums();
        showResult(beans);
    }

    public void showResult(ArrayList<AlbumsBean> beans) {
        for(AlbumsBean bean : beans) {
            System.out.println(bean);
        }
    }

    public void showResult(int cnt) {
        if(cnt > 0) {
            System.out.println(cnt + "건이 처리되었습니다.");
        }
        else if(cnt == 0) {
            System.out.println("조건에 맞는 레코드를 찾을 수 없습니다.");
        }
        else {
            System.out.println("시스템 에러");
        }
    }

    public static void main(String[] args) {
        new AlbumsMain().init();
    }
}

package com.corrine.oop;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainTest2 {

	static List<Employee> emplist = new ArrayList<Employee>();

	public static void main(String[] args) throws IOException {

		boolean save = true;
		boolean flag = true;
		String num = null;

		FileOutputStream fos = new FileOutputStream("C:\\Users\\ji416\\OneDrive\\문서\\temp\\test.txt", true);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		while (flag) {
			Scanner sc = new Scanner(System.in);
			Employee emp1 = new Employee();

			System.out.println("====================직원 정보 프로그램=====================");
			System.out.println("메뉴 : 1 직원정보 입력 2 직원정보 검색 3 직원정보 전체출력 4 종료");
			System.out.println("======================================================");
			num = sc.next();

			if (num.equals("1")) {

				System.out.println("=============직원 정보 입력=============");

				System.out.println("01. 이름을 입력하세요.(문자만 저장됩니다.)");
				emp1.setName(sc.next());

				System.out.println("02. 전화번호를 입력하세요.(숫자만 저장됩니다.)");
				emp1.setPhonenum(sc.next());

				System.out.println("03. 주소를 입력하세요.(문자만 저장됩니다.)");
				emp1.setAddress(sc.next());

				System.out.println("04. 부서를 입력하세요.(문자만 저장됩니다.)");
				emp1.setDepartment(sc.next());

				System.out.println("05. 직책을 입력하세요.(문자만 저장됩니다.)");
				emp1.setPosition(sc.next());

				System.out.println("06. 닉네임을 입력하세요.(문자만 저장됩니다.)");
				emp1.setNickName(sc.next());
				emp1 = new Employee(emp1.getName(), emp1.getPhonenum(), emp1.getAddress(), emp1.getDepartment(),
						emp1.getPosition(), emp1.getNickName());

				emplist.add(emp1);

				oos.writeObject(emp1);
				System.out.println("파일 저장 성공");

				for (Employee temp : emplist) {

					if ((temp.getAddress() == null || temp.getDepartment() == null || temp.getName() == null
							|| temp.getPosition() == null || temp.getPhonenum() == null
							|| temp.getNickName() == null)) {
						save = false;
						break;
					} else {
						save = true;
					}
				}

				if (save) {
					System.out.println("직원 정보가 저장 되었습니다.");
					System.out.println("=========================================");
				} else {
					emplist.remove(emp1);
					System.out.println("저장되지 않은 값이 있네요. 다시 처음부터 입력해야합니다.");
				}

			} else if (num.equals("2")) {
				System.out.println("=============직원 정보 검색=============");
				System.out.println("정보를 검색하고 싶은 이름을 입력하세요.");
				String name = sc.next();

				for (Employee temp : emplist) {
					if (temp.getName().equals(name)) {
						temp.printSpect();
					}
				}

			} else if (num.equals("3")) {
				System.out.println("=============직원 정보 전체출력=============");

				int listnum = 1;

				for (Employee temp : emplist) {
					System.out.println("#" + listnum);
					temp.printSpect();
					listnum++;
					System.out.println("=========================================");
				}

			} else if (num.equals("4")) {
				System.out.println("=============프로그램 종료=============");
				flag = false;
				break;
			} else {
				System.out.print("1~4 사이의 번호를 입력해주세요.");
			}

		}
		oos.close();
	}
}

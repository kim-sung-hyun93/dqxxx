package chap09.api.lang;
//String 클래스의 기본 메소드
public class StringTest02 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("재밌다.");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));
		System.out.println("str1.concact(str2)=>"+str1.concat(str2));
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a')); // 왼쪽부터 찹는다
		System.out.println("str1.indexOf('합')=>"+str1.indexOf('합')); // -1이 나온건 없다는 뜻.
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a')); // 오른쪽부터 찾는다
		
		
		
		System.out.println("str1.length()=>"+str1.length());
		
		//equals => 대소문자 비교
		System.out.println("str1.equals(\"java programming\")=>"+str1.equals("java programming"));
		System.out.println("str1.equals(\"Java programming\")=>"+str1.equals("Java programming"));
		
		//이그노어케이스 => 대소문자비교X
		System.out.println("str1.equalsIgnoreCase(\"java programming\")=>"
				+str1.equalsIgnoreCase("java programming"));
		System.out.println("str1.equalsIgnoreCase(\"Java programming\")=>"
				+str1.equalsIgnoreCase("Java programming"));
		
		//문자열비교 - prefix
		System.out.println("str1.startsWith(\"java\")=>"+str1.startsWith("java"));
		System.out.println("str1.startsWith(\"Java\")=>"+str1.startsWith("Java"));
		
		//문자열비교 - suffix
		System.out.println("str1.endsWith(\"ming\")=>"+str1.endsWith("ming"));
		
	}
}

package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor // 기본 생성자 자동 생성
@AllArgsConstructor
@Getter // Getter 메서드 자동 생성
@Setter // Setter 메서드 자동 생성
class Food {
   String name; // 음식 이름 필드
   int calorie; // 칼로리 필드
}

//---------------
public class StreamMain02 {
	static int hap;

    public static void main(String[] args) {
        // Food 객체 생성
        Food aa = new Food("탕수육", 616);
        Food bb = new Food("라면", 460);
        Food cc = new Food("돈까스", 960);
        Food dd = new Food("떡볶이", 482);
        Food ee = new Food("짜장면", 670);

        // Food 객체를 리스트에 추가
        List<Food> list = new ArrayList<>();
        list.add(aa);
        list.add(bb);
        list.add(cc);
        list.add(dd);
        list.add(ee);

        // calorier가 500을 넘는 음식만 골라서 오름차순으로 정렬하여 음식명 출력
        List<Food> calorieList = new ArrayList<>();
        for (Food food : list) {
            if (food.getCalorie() > 500) { // 칼로리가 500을 넘는 음식만 선택
                calorieList.add(food);
            }
        }

        // 칼로리 기준으로 오름차순 정렬
        Collections.sort(calorieList, new Comparator<Food>() {
            @Override
            public int compare(Food f1, Food f2) {
                return Integer.compare(f1.getCalorie(), f2.getCalorie());
            }
        });

        // 음식명 출력
        List<String> foodName = new ArrayList<String>();
        for (Food food : calorieList) {
            foodName.add(food.getName());
        }
        System.out.println(foodName);
        System.out.println();
        
        //스트림 이용
        List<String> foodNameList = list.stream()
        									.filter(f -> f.getCalorie() > 500)
        									.sorted(Comparator.comparing(Food :: getCalorie))
        									.map(f -> f.getName())
        									.collect(Collectors.toList()); //List로 변환
        
        System.out.println(foodNameList);
        
        //합계
        // .reduce(초기값, (누적변수, 요소) -> 처리문)
        // .reduce()는 Stream의 요소들을 하나의 데이터로 만드는 작업을 수행
        IntStream stream = IntStream.range(1, 5); //range()는 끝수를 포함하지 않는다. (1,2,3,4)
        int sum = stream.reduce(0, (total, num) -> total + num);
        System.out.println("합계 = " +  sum);
        System.out.println();
        
        IntStream stream2 = IntStream.rangeClosed(1, 5); //rangeClosed()는 끝수를 포함한다. (1,2,3,4,5)
        stream2.forEach(x -> hap+=x);
        System.out.println("합계 = " +  hap);
        
    }
}


















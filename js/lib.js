function getRandom(max){
	var r = Math.random(); //0.0~ 0.999999
	return parseInt(r*max); // 0~1 * 7 
}


/*--------------------------
이 충돌 판단 함수는 모든 게임에 적용될 수 있으므로,
사용하기 위해서는 인수1 "나의 div, img, span등", 인수2 "상대방의 div, img,span등"
을 넘겨야 한다.
충돌이 경우, true를 반환하도록 처리함..
---------------------------------*/
function hitTest(me, target) {
//두 물체간 충돌 여부 판단
me_x= parseInt(me.style.left);
me_y= parseInt(me.style.top);
me_width=parseInt(me.style.width);
me_height=parseInt(me.style.height);
target_x= parseInt(target.style.left);
target_y= parseInt(target.style.top);
target_width=parseInt(target.style.width);
target_height=parseInt(target.style.height);
var result1=(me_x >= target_x) && (me_x <= (target_x+target_width));//나의 x좌표위치가 타겟의 가로폭 내에 있는지 판단
var result2=(me_x+me_width >= target_x) && (me_x+me_width <= (target_x+target_width));  //나의 가로폭이 타겟의 가로폭 내에 있는지 판단
var result3=(me_y >= target_y) && (me_y <= (target_y+target_height));//나의 y좌표위치가 타겟의 세로폭 내에 있는지 판단
var result4=(me_y+me_height >= target_y) && (me_y+me_height <= (target_y+target_height));//나의 세로폭이 타겟의 세로폭 내에 있는지 판단
 return (result1 || result2) && (result3 || result4);
}
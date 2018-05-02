var Bullet = function(container, x, y, e_array){
	this.img;
	this.container = container;
	this.x = x;
	this.y = y;
	this.velX = 10;
	this.st;
	this.e_array= e_array;
	
	this.init = function(){
		this.img = document.createElement("img");
		this.img.src = "../images/bullet.png";
		this.img.style.width = "70px";
		this.img.style.position = "absolute";
		this.img.style.left = this.x + "px";
		this.img.style.top = this.y + "px";
		
		this.container.appendChild(this.img);
		this.move();
	}
	
	this.move = function(){
		var me = this;
		this.x+=this.velX;
		
		this.img.style.left = this.x +"px";
		
		//화면보다 나갔니?
		if(this.x >= screen.width-80){
			this.container.removeChild(this.img);
			clearTimeout(this.st);
			return;
		}
		
		//적군과 닿았니?
		for(var i=0; i<this.e_array.length; i++){
			if(hitTest(this.img, this.e_array[i].img)){
				this.container.removeChild(this.img);
				this.container.removeChild(this.e_array[i].img);
				clearTimeout(this.st);
				this.e_array.splice(i, 1);
				return;
			}
		}
		
		
		
		this.st = setTimeout(function(){me.move();}, 5);
		
		
	}
}




























var Plane = function(container){
	this.img;
	this.container = container;
	this.x = 0;
	this.y = 0;
	this.velX = 0;
	this.velY = 0;
	
	this.init = function(){
		this.img = document.createElement("img");
		this.img.src = "../images/plane.png";
		this.img.style.width = "200px";
		this.img.style.position = "absolute";
		this.img.style.left = 0 + "px";
		this.img.style.top = 0 + "px";
		
		this.container.appendChild(this.img);
		
		this.move();
	}
	
	this.move = function(){
		var me = this;
		this.x+=this.velX;
		this.y+=this.velY;
		
		this.img.style.left = this.x +"px";
		this.img.style.top = this.y +"px";
		
		setTimeout(function(){me.move();}, 5);
		
	}
}
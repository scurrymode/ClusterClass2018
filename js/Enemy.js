var Enemy = function(container, src, y){
	this.img;
	this.container = container;
	this.y = y;
	this.src = src;

	
	this.init = function(){
		this.img = document.createElement("img");
		this.img.src = this.src;
		this.img.style.width = "100px";
		this.img.style.height = "100px";
		this.img.style.position = "absolute";
		this.img.style.left = screen.width - 100 + "px";
		this.img.style.top = this.y + "px";
		
		this.container.appendChild(this.img);
		
	}
}
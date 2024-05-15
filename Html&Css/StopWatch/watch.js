let start=document.getElementById("start");
let stop=document.getElementById("stop");
let reset=document.getElementById("reset");

let hr=00;
let min=00;
let sec=00;
let count=00;

start.addEventListener('click',function()
{
	timer=true;
	stopWatch();
});

stop.addEventListener('click', function()
{
	timer=false;
});

reset.addEventListener('click', function()
{
	timer=false;
	hr=0;
	min=0;
	sec=0;
	count=0;
	document.getElementById("hr").innerHTML="00";
	document.getElementById("min").innerHTML="00";
	document.getElementById("sec").innerHTML="00";
	document.getElementById("count").innerHTML="00";
 
	
});


function stopWatch()
{
	if(timer)
	{
		count++;
		
		if(count==1000)
		{
			sec++;
			count=0;
		}
		if(sec==60)
		{
			min++;
			sec=0;
		}
		if(min==60)
		{
			hr++;
			min=0;
			sec=0;
		}

		let hrStr=hr;
		let minStr=min;
		let secStr=sec;
		let countStr=count;
		
		if(hr<10)
		{
			hrStr="0"+hrStr;
		}

		if(min<10)
		{
			minStr="0"+minStr;
		}

		if(sec<10)
		{
			secStr="0"+secStr;
		}

		if(count<10)
		{
			countStr="0"+countStr;
		}

	
		document.getElementById("hr").innerHTML=hrStr;
		document.getElementById("min").innerHTML=minStr;
		document.getElementById("sec").innerHTML=secStr;
		document.getElementById("count").innerHTML=countStr;

		setTimeout(stopWatch,50);
	}
}



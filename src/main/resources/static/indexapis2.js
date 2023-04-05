var btn= document.getElementById("btn").addEventListener("click", getPost);
var con=0;
var div= document.getElementById("cardDiv");


function getPost(){
    fetch('https://jsonplaceholder.typicode.com/photos')
    .then((res)=>{
        if(res.ok){
            return res.json();
        }else{
            throw res;
        }
         

    })
    .then((post)=>{
        for(let index=0;index<1; index++){
            div.innerHTML+=`
                <div class= "card col-3 m-1 mx-auto" style=inline-block>
                    <img class="card-img-top" src="${post[con].thumbnailUrl}">
                    <div class="caption">
                        <p class="card text">${post[con].title}}</p>
                    </div>
                </div>
            
            `
            con=con+1;
        }
    })
    .catch(error=>
        console.log('error',error));


};

//por si no lo quiero hacer con boton 
/*window.addEventListener("load", function(){
    getPost();
})*/


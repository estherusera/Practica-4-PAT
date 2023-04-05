var tabletot= document.getElementById("table_contacto");

let tablebod=``;


function getPost(){
    fetch('https://jsonplaceholder.typicode.com/users')
    .then((res)=>{
        if(res.ok){
            return res.json();

        }else{
            throw res;
        }
         

    })
 
    .then((post)=>{
        for(let user=0;user<10;user++){
            tablebod+= `<tr>
            <td class='centered'>${post[user].id}</td>
            <td class='centered'>${post[user].name}</td>
            <td class='centered'>${post[user].username}</td>
            <td class='centered'>${post[user].email}</td>
            </tr>`;
        }  
        
        tabletot.innerHTML=tablebod;
       
    })
    .catch(error=>
        console.log('error',error));


};

window.addEventListener("load",function(){
    getPost();
});
const bx= document.querySelector('.bx-menu');
const menu= document.querySelector('.menu-navegacion');

console.log(menu);

bx.addEventListener('click', ()=>{
    menu.classList.toggle("spread");
})
window.addEventListener('click', e=>{
    if(menu.classList.contains('spread') && e.target != menu && e.target != bx){
        menu.classList.toggle("spread");
    };
})
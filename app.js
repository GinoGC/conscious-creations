const hamburger = document.querySelector('.hamburger');
const navLinks = document.querySelector('.nav-links');
const links = document.querySelectorAll('.nav-list');

hamburger.addEventListener('click', () => {
  navLinks.classList.toggle('open');
});


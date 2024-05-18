/**
 * 
 */
document.addEventListener('DOMContentLoaded', () => {
  const createForm = document.getElementById('create-form');
  const loginForm = document.getElementById('login-form');
  const showLoginLink = document.getElementById('show-login');
  const showCreateLink = document.getElementById('show-create');

  showLoginLink.addEventListener('click', (e) => {
    e.preventDefault();
    createForm.classList.add('hidden');
    loginForm.classList.remove('hidden');
  });

  showCreateLink.addEventListener('click', (e) => {
    e.preventDefault();
    loginForm.classList.add('hidden');
    createForm.classList.remove('hidden');
  });
});

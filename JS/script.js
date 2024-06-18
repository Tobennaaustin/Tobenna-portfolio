
function openTab(tabName) {
  // Hide all content
  const contents = document.querySelectorAll('.content');
  contents.forEach(content => content.style.display = 'none');

  // Show the selected tab content
  const activeContent = document.getElementById(tabName);
  activeContent.style.display = 'block';

  // Highlight the active tab
  const tabs = document.querySelectorAll('.tab');
  tabs.forEach(tab => tab.classList.remove('active'));
  document.querySelector(`[onclick="openTab('${tabName}')"]`).classList.add('active');
}

// Initialize the first tab as active
document.addEventListener('DOMContentLoaded', () => {
  document.querySelector('.tab').classList.add('active');
  document.querySelector('.content').style.display = 'block';
});

// copying email to clipboard
document.querySelectorAll('.coptBtn').forEach(button => {
  button.addEventListener('click', () => {
    const email = button.getAttribute('data-email');

    navigator.clipboard.writeText(email).then(() => {
      const originalText = button.textContent;
      button.textContent = 'Copied';
      
      setTimeout(() => {
        button.textContent = originalText;
      }, 4000);
    }).catch(err => {
      console.error('Failed to copy text: ', err);
    });
  });
});


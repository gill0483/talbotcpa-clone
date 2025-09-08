# Prairie CPAs – Spring Boot Website Template

A clean CPA-firm website you can open in **Eclipse** and run immediately.

## Import & Run (Eclipse)

1. **File → Import… → Maven → Existing Maven Projects**.
2. Select the folder `talbotcpa-clone`.
3. Click **Finish**. Wait for Maven to download dependencies.
4. Open `CpaWebsiteApplication.java` and **Run → Run As → Java Application**.
5. Visit `http://localhost:8080` in your browser.

## Customize

- Templates are in `src/main/resources/templates` (Thymeleaf).
- Global fragments (head, navbar, footer) are in `templates/fragments`.
- Styles in `src/main/resources/static/css/site.css`.
- Update firm name, address, phone, etc. in templates and `application.properties`.

## Notes

- Contact form currently logs submissions to the console. Replace with email sending (e.g., Spring Mail) or a CRM webhook.
- Bootstrap is loaded via CDN for simplicity.

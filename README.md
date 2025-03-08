# AI Email Reply Generator

This project is divided into two parts:
- **Backend**: `email-writer-sb` (Spring Boot)
- **Frontend**: `email-writer-react` (React)

---

# Backend - `email-writer-sb`

## Prerequisites
- Java 17
- Maven
- Render (for deployment)

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/Swathi-Mishra/email-writer-sb.git
   cd email-writer-sb
   ```
2. Build the project:
   ```bash
   ./mvnw clean package -DskipTests
   ```
3. Deploy on Render:
   - Add Environment Variables:
     - `JAVA_HOME = /opt/jdk-17`
     - `PATH = /opt/jdk-17/bin:$PATH`
   - Build Command:
     ```bash
     curl -fsSL https://download.oracle.com/java/17/latest/jdk-17_linux-x64_bin.tar.gz -o jdk-17.tar.gz && mkdir -p /opt/jdk-17 && tar -xzf jdk-17.tar.gz -C /opt/jdk-17 --strip-components=1 && export JAVA_HOME=/opt/jdk-17 && export PATH=$JAVA_HOME/bin:$PATH && ./mvnw clean package -DskipTests
     ```
   - Start Command:
     ```bash
     java -Dserver.port=${PORT:-8080} -jar target/email-writer-sb-0.0.1-SNAPSHOT.jar
     ```

## API Endpoint
**POST** `/api/email/generate`
- **Request Body:**
```json
{
  "emailContent": "<original email content>",
  "tone": "formal" | "casual" | "friendly" | "professional"
}
```
- **Response:** A generated email reply.

---

## URL Access
- **Backend:** [Render Deployment Link](https://email-writer-sb-04ng.onrender.com)
- **Frontend:** [GitHub Pages Link](https://Swathi-Mishra.github.io/email-writer-react)

---

# Related Projects
- [Email Writer Frontend](https://github.com/Swathi-Mishra/email-writer-react)

---

# Additional Notes
- Ensure proper CORS configuration in the backend for successful requests.
- Clear browser cache if frontend updates are not reflected immediately.

If you face any issues, refer to:
- [Render Troubleshooting Guide](https://render.com/docs/troubleshooting-deploys)
- [GitHub Pages Documentation](https://pages.github.com/)


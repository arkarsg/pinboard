import axios from "axios";
/**
 * Connection to Spring Boot endpoints
 */
export default axios.create({
    baseURL: "http://localhost:8080/pins"
})

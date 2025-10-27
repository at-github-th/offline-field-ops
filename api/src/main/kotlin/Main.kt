
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.serialization.jackson.*
import io.ktor.server.plugins.contentnegotiation.*

fun main() {
    embeddedServer(Netty, port = 5102) {
        install(ContentNegotiation) { jackson() }
        routing {
            get("/") { call.respond(mapOf("name" to "Offline-first Field Ops API", "ok" to true)) }
            get("/api/jobs") { call.respond(listOf(mapOf("id" to "J-1","title" to "Inspect gate A","status" to "queued"))) }
        }
    }.start(wait = true)
}

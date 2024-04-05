package com.example.assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etA = findViewById<EditText>(R.id.etA)
        val btnsearch = findViewById<Button>(R.id.btnsearch)
        val infoDisplay = findViewById<TextView>(R.id.infoDisplay)


        val infoMap = mapOf(
            "96" to "Queen elizabeth, Elizabeth II (Elizabeth Alexandra Mary; 21 April 1926 – 8 September 2022) was Queen of the United Kingdom and other Commonwealth realms from 6 February 1952 until her death in 2022. She was queen regnant of 32 sovereign states over the course of her lifetime and remained the monarch of 15 realms by the time of her death. Her reign of over 70 years is the longest of any British monarch, the longest of any female monarch, and the second longest official reign of any monarch of a sovereign state in history.",
            "77" to "Albert Einstein, Albert Einstein, a towering figure in the realm of physics, revolutionized our understanding of the universe with his groundbreaking theories. Born in Germany in 1879, Einstein's early work in theoretical physics laid the foundation for modern quantum mechanics. However, it was his theory of relativity, proposed in 1905 and further developed in 1915, that truly transformed our perception of space, time, and gravity. His equation E=mc², which demonstrates the equivalence of mass and energy, remains one of the most famous formulas in physics. Einstein's achievements earned him the Nobel Prize in Physics in 1921.",
            "95" to "Nelson Mandela, Nelson Rolihlahla Mandela was a South African anti-apartheid activist, politician, and statesman who served as the first president of South Africa from 1994 to 1999. He was the country's first black head of state and the first elected in a fully representative democratic election. His government focused on dismantling the legacy of apartheid by fostering racial reconciliation.",
            "91" to "Winston Churchill, Winston Churchill was the prime minister of the United Kingdom during World War II and, along with Josef Stalin, Franklin Roosevelt, and Dwight Eisenhower, helped bring about the defeat of the German Third Reich. He conducted much of the war from his underground bunker and ordered blackouts of major cities to prevent the Nazi bombing raids from being able to target civilians. He also helped engineer the D-Day invasion of Normandy, which spelled the beginning of the end for the Nazis.",
            "56" to "Abraham Lincoln, Born into dire poverty in Illinois, Abraham Lincoln would rise to become one of the most important figures in American, and world, history. He was elected to the Senate before becoming President of the United States, just before the Civil War broke out. In his Emancipation Proclamation, he declared that slavery was no longer a valid institution and all slaves were free. He was assassinated shortly before the war ended, but his legacy is impossible to understate.",
            "79" to "Mahatma Gandhi, Born into India while it was under the British colonial government, Mahatma Gandhi became a leader in the independence movement. He advocated nonviolent resistance as a means to not only end British rule but also to create a new Indian nation. After India gained independence in 1947, he worked tirelessly to promote peace with the newly-partitioned state of Pakistan. He was assassinated by a Hindu nationalist who disapproved of his work with Pakistani Muslims. Today, he is known as the Father of India.",
            "39" to "Martin Luther King, Jr., The Civil Rights leader was also a Baptist pastor in Alabama. Martin Luther King, Jr. organized nonviolent resistance movements, including the Montgomery Bus Boycott after Rosa Parks was arrested for not giving up her seat to a white passenger. He went on to help organize the March on Washington, where he gave his famous “I Have a Dream” speech. A white supremacist assassinated him, but his efforts were ultimately successful.",
            "52" to "William Shakespeare, His most famous play was Romeo and Juliet, but there is more to Shakespeare than the star-crossed lovers. He is responsible for many of the sayings and idioms that we still use today, such as, “a rose by any other name would smell as sweet.” He also invented many of the words that are still used today, as well as many literary devices, such as comic relief, knock-knock jokes, and five-act plays that have an introduction, rising action, climax, falling action, and resolution.",
            "85" to "Sir Isaac Newton, Isaac Newton is probably most famous for his discovery of gravity, which explains both why things fall to earth and why planets stay in orbit around the sun. When he needed to make measurements that involved a form of math that didn’t exist, he invented a new branch of math: calculus. He wrote down many of his discoveries in a book called Principia, which is still considered a masterpiece. His findings were used by Einstein over two centuries later.",
            "51" to "Napoleon Bonaparte, The “Little Emperor” is not so little in the history books. He rose to power during the French Revolution, which quickly spiraled into chaos and threatened to destroy the nation. Napoleon reunited it as a military dictator and went on to conquer much of Western Europe in the Napoleonic Wars. His defeat at Waterloo brought about an end to his empire; a European military empire would not be seen again until Adolf Hitler rose to power."


        )


        btnsearch.setOnClickListener {
            val input = etA.text.toString()
            val info = infoMap[input]
            infoDisplay.text = info ?: "There is no information on this age"
        }
    }
}